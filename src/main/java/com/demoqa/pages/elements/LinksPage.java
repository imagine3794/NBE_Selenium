package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import utilities.JavaScriptUtility;

public class LinksPage extends ElementsPage {

  private By badRequestLink = By.id("bad-request");
  private By responseLink = By.id("linkResponse");
  private JavaScriptUtility javascriptUtilityObj = new JavaScriptUtility(driver);
  public void clickBadRequestLink() {
    javascriptUtilityObj.scrollToElementJS(badRequestLink);
    click(badRequestLink);
  }

  public String getResponse() {
    delay(2000);
    return find(responseLink).getText();
  }
}
