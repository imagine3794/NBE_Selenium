package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility {

  private WebDriver driver;

  public SwitchToUtility(WebDriver driver) {
    this.driver = driver;
  }

  private WebDriver.TargetLocator switchTo() {
    return driver.switchTo();
  }

  public String getAlertText() {
    return switchTo().alert().getText();
  }

  public void acceptAlert() {
    switchTo().alert().accept();
  }

  public void dismissAlert() {
    switchTo().alert().dismiss();
  }

  public void setAlertText(String text) {
    switchTo().alert().sendKeys(text);
  }

  public void switchToFrameString(String value) {
    switchTo().frame(value);
  }

  public void switchToDefaultContent() {
    switchTo().defaultContent();
  }

  public void switchToFrameIndex(int index) {
    switchTo().frame(index);
  }

  public void switchToFrameElement(WebElement element) {
    switchTo().frame(element);
  }

  public void switchToWindow(String handle) {
    switchTo().window(handle);
  }
}
