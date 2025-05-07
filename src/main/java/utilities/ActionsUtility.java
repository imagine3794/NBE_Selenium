package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility {

  private WebDriver driver;

  public ActionsUtility(WebDriver driver) {
    this.driver = driver;
  }

  private Actions act() {
    return new Actions(driver);
  }

  public void dragAndDropBy(WebElement source, int x, int y) {
    act().dragAndDropBy(source, x, y).perform();
  }

  public void sendKeys(WebElement source, CharSequence keys) {
    act().sendKeys(source, keys).perform();
  }

}
