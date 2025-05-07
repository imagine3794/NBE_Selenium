package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import utilities.JavaScriptUtility;

public class FormsPage extends HomePage {

  private By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");
  private JavaScriptUtility javascriptUtilityObj = new JavaScriptUtility(driver);

  public PracticeFormPage clickPracticeForm() {
    javascriptUtilityObj.scrollToElementJS(practiceFormMenuItem);
    click(practiceFormMenuItem);
    return new PracticeFormPage();
  }
}
