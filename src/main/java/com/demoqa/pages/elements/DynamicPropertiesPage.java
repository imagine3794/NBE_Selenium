package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import utilities.GetUtility;
import utilities.WaitUtility;

public class DynamicPropertiesPage extends ElementsPage {

  private By visibleAfterButton = By.id("visibleAfter");
  private WaitUtility waitUtilityObj = new WaitUtility(driver);
  private GetUtility getUtilityObj = new GetUtility(driver);

  public String getVisibleAfterButtonText() {
    waitUtilityObj.explicitWaitUntilVisible(5, visibleAfterButton);
    String visibleText = getUtilityObj.getText(visibleAfterButton);
    System.out.println("Button Text: " + visibleText);
    return visibleText;
  }
}
