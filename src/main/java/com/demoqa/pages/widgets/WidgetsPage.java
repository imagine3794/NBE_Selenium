package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import utilities.JavaScriptUtility;

public class WidgetsPage extends HomePage {

  private By selectMenuItem = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
  private By datePickerMenuItem = By.xpath("//li[@id='item-2']/span[text()='Date Picker']");
  private By progressBarMenuItem = By.xpath("//li[@id='item-4']/span[text()='Progress Bar']");
  private By sliderMenuItem = By.xpath("//li[@id='item-3']/span[text()='Slider']");
  private JavaScriptUtility javascriptUtilityObj = new JavaScriptUtility(driver);

  public SliderPage clickSlider() {
    javascriptUtilityObj.scrollToElementJS(sliderMenuItem);
    click(sliderMenuItem);
    return new SliderPage();
  }

  public ProgressBarPage clickProgressBar() {
    javascriptUtilityObj.scrollToElementJS(progressBarMenuItem);
    click(progressBarMenuItem);
    return new ProgressBarPage();
  }

  public SelectMenuPage clickSelectMenu() {
    javascriptUtilityObj.scrollToElementJS(selectMenuItem);
    click(selectMenuItem);
    return new SelectMenuPage();
  }

  public DatePickerMenuPage clickDatePicker() {
    javascriptUtilityObj.scrollToElementJS(datePickerMenuItem);
    click(datePickerMenuItem);
    return new DatePickerMenuPage();
  }
}
