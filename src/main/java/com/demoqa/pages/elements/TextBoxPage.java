package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utilities.ActionsUtility;
import utilities.GetUtility;
import utilities.JavaScriptUtility;
import utilities.WaitUtility;

public class TextBoxPage extends ElementsPage {
  private By fullNameField = By.id("userName");
  private By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
  private By submitButton = By.id("submit");
  private By currentAddressResult =By.xpath("//p[@id='currentAddress']");
  private WaitUtility waitUtilityObj = new WaitUtility(driver);
  private GetUtility getUtilityObj = new GetUtility(driver);
  private JavaScriptUtility javascriptUtilityObj = new JavaScriptUtility(driver);
  private ActionsUtility actionsUtilityObj = new ActionsUtility(driver);
  public String getCurrentAddress() {
    waitUtilityObj.explicitWaitUntilVisible(5, currentAddressResult);
    return getUtilityObj.getText(currentAddressResult);
  }

  public void clickSubmitButton() {
    javascriptUtilityObj.scrollToElementJS(submitButton);
    click(submitButton);
  }

  public void setCurrentAddress(String address) {
    find(currentAddressField).sendKeys(address + Keys.ENTER);
  }

  public void setFullName(String name) {
    delay(1000);
    javascriptUtilityObj.scrollToElementJS(fullNameField);
    actionsUtilityObj.sendKeys(find(fullNameField), Keys.chord(name));
  }

  public void setEmail(String email) {
    setFullName(Keys.chord(Keys.TAB, email));
  }
}
