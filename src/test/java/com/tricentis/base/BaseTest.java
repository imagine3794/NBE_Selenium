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

import java.io.File;
import java.io.IOException;


public class BaseTest {

  private WebDriver driver;
  protected HomePage homePage;
  private String DEMOQA_URL = "https://sampleapp.tricentis.com/101/index.php";

  @BeforeClass
  public void setUp() {
    driver = new EdgeDriver();
    driver.manage().window().maximize();
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  @BeforeMethod
  public void loadApplication() {
    driver.get(DEMOQA_URL);
    homePage = new HomePage();
    homePage.setDriver(driver);
  }

  @AfterMethod
  public void takeFailedResultScreenshot(ITestResult testResult) {
    if (ITestResult.FAILURE == testResult.getStatus()) {
      TakesScreenshot screenshot = (TakesScreenshot) driver;
      File source = screenshot.getScreenshotAs(OutputType.FILE);
      File destination = new File(System.getProperty("user.dir") +
              "/resources/screenshots/(" +
              java.time.LocalDate.now() + ") " +
              testResult.getName() + ".png");
      try {
        FileHandler.copy(source, destination);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      System.out.println("Screenshot Located At " + destination);
    }
  }

  @AfterClass
  public void tearDown() {
    driver.quit();
  }
}
