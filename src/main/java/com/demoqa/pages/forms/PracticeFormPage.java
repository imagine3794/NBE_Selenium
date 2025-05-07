package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import utilities.JavaScriptUtility;

public class PracticeFormPage extends FormsPage {

  private By femaleRadioButton = By.id("gender-radio-2");
  private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
  private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
  private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");
  private By submitButton = By.id("submit");
  private JavaScriptUtility javascriptUtilityObj = new JavaScriptUtility(driver);

  public void clickFemaleRadioButton() {
    javascriptUtilityObj.scrollToElementJS(femaleRadioButton);
    javascriptUtilityObj.clickJS(femaleRadioButton);
  }

  public boolean isFemaleSelected() {
    return find(femaleRadioButton).isSelected();
  }

  public void clickSportsCheckbox() {
    if (!find(sportsHobbyCheckbox).isSelected()) {
      javascriptUtilityObj.scrollToElementJS(sportsHobbyCheckbox);
      javascriptUtilityObj.clickJS(sportsHobbyCheckbox);
    }
  }

  public void clickReadingCheckbox() {
    if (!find(readingHobbyCheckbox).isSelected()) {
      javascriptUtilityObj.scrollToElementJS(readingHobbyCheckbox);
      javascriptUtilityObj.clickJS(readingHobbyCheckbox);
    }
  }

  public void clickMusicCheckbox() {
    if (!find(musicHobbyCheckbox).isSelected()) {
      javascriptUtilityObj.scrollToElementJS(musicHobbyCheckbox);
      javascriptUtilityObj.clickJS(musicHobbyCheckbox);
    }
  }

  public void unclickReadingCheckbox() {
    if (find(readingHobbyCheckbox).isSelected()) {
      javascriptUtilityObj.scrollToElementJS(readingHobbyCheckbox);
      javascriptUtilityObj.clickJS(readingHobbyCheckbox);
    }
  }

  public boolean isReadingSelected() {
    return find(readingHobbyCheckbox).isSelected();
  }

  public void clickSubmitButton() {
//    scrollToElementJS(submitButton);
    click(submitButton);
  }
}
