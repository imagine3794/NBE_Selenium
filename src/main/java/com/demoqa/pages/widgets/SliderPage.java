package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import utilities.ActionsUtility;
import utilities.GetUtility;

public class SliderPage extends WidgetsPage {

  private By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
  private By sliderValue = By.id("sliderValue");
  private ActionsUtility actionsUtilityObj = new ActionsUtility(driver);
  private GetUtility getUtilityObj = new GetUtility(driver);

  public String getSliderValue() {
    return getUtilityObj.getAttribute(sliderValue, "value");
  }

  public void moveSlider(int x, int y) {
//    Actions act = new Actions(driver);
//    act.dragAndDropBy(find(slider), x, y).perform();
    actionsUtilityObj.dragAndDropBy(driver.findElement(slider), x, y);
  }
}
