package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import java.util.List;

import utilities.DropDownUtility;
import utilities.JavaScriptUtility;

public class SelectMenuPage extends WidgetsPage {

  private By standardMultiSelect = By.id("cars");
  private JavaScriptUtility javascriptUtilityObj = new JavaScriptUtility(driver);
  private DropDownUtility dropDownUtilityObj = new DropDownUtility(driver);

  public void selectStandardMulti(String text) {
    javascriptUtilityObj.scrollToElementJS(standardMultiSelect);
//    Select select = new Select(find(standardMultiSelect));
//    select.selectByVisibleText(text);
    dropDownUtilityObj.selectByVisibleText(standardMultiSelect, text);
  }

  public void selectStandardMulti(int index) {
    javascriptUtilityObj.scrollToElementJS(standardMultiSelect);
    dropDownUtilityObj.selectByIndex(standardMultiSelect, index);
  }

  public void deselectStandardMulti(String value) {
    javascriptUtilityObj.scrollToElementJS(standardMultiSelect);
    dropDownUtilityObj.deselectByValue(standardMultiSelect, value);
  }

  public List<String> getAllSelectedStandardMultiOptions() {
    return dropDownUtilityObj.getAllSelectedOptions(standardMultiSelect);
  }
}















