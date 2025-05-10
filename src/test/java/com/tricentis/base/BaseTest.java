package com.tricentis.base;

import com.tricentis.pages.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import io.qameta.allure.Attachment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.nio.file.Files;


public class BaseTest {

  private WebDriver driver;
  protected HomePage homePage;
  private String URL = "https://sampleapp.tricentis.com/101/index.php";

  @BeforeClass
  public void setUp() {
    driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  }

  @BeforeMethod
  public void loadApplication() {
    driver.get(URL);
    homePage = new HomePage();
    homePage.setDriver(driver);
  }

  @AfterMethod(alwaysRun = false)
  public void takeFailedResultScreenshot(ITestResult testResult) {
    if (ITestResult.FAILURE == testResult.getStatus()) {
      TakesScreenshot screenshot = (TakesScreenshot) driver;
      File source = screenshot.getScreenshotAs(OutputType.FILE);
      String errorMessage = testResult.getThrowable().getMessage();
      if (errorMessage != null) {
        // Get the first line of the error message and limit its length
        errorMessage = errorMessage.split("\n")[0];
        errorMessage = errorMessage.length() > 50 ? errorMessage.substring(0, 47) + "..." : errorMessage;
      } else {
        errorMessage = "UnknownError";
      }
      
      // Save to file system (existing functionality)
      File destination = new File(System.getProperty("user.dir") +
              "/resources/screenshots/(" +
              java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss")) + ") " +
              testResult.getName() + "_" +
              errorMessage.replaceAll("[^a-zA-Z0-9\\s-]", "_") + ".png");
      try {
        FileHandler.copy(source, destination);
        // Attach screenshot to Allure report
        attachScreenshotToAllure(source, testResult.getName());
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      System.out.println("Screenshot Located At " + destination);
    }
  }

  @Attachment(value = "{screenshotName}", type = "image/png")
  private byte[] attachScreenshotToAllure(File screenshot, String screenshotName) {
    try {
      return Files.readAllBytes(screenshot.toPath());
    } catch (IOException e) {
      throw new RuntimeException("Failed to attach screenshot to Allure report", e);
    }
  }

  @AfterClass
  public void tearDown() {
    driver.quit();
  }
}
