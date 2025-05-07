package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class JavaScriptUtility {

  private WebDriver driver;

  public JavaScriptUtility(WebDriver driver) {
    this.driver = driver;
  }

  public void scrollToElementJS(By locator) {
    WebElement element = driver.findElement(locator);
    String jsScript = "arguments[0].scrollIntoView();";
    ((JavascriptExecutor)driver).executeScript(jsScript, element);
  }

  public void clickJS(By locator) {
    WebElement element = driver.findElement(locator);
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("arguments[0].click();", element);
  }
}
