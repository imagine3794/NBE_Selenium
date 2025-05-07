package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Set;

  public class GetUtility {

  private WebDriver driver;

  public GetUtility(WebDriver driver) {
    this.driver = driver;
  }

  public String getWindowHandle() {
    return driver.getWindowHandle();
  }

  public Set<String> getWindowHandles() {
    return driver.getWindowHandles();
  }

  public String getText(By locator) {
    return driver.findElement(locator).getText();
  }

  public String getAttribute(By locator, String attribute) {
    return driver.findElement(locator).getAttribute(attribute);
  }

  public String getURL() {
    return driver.getCurrentUrl();
  }
}
