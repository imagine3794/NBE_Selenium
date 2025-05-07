package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import utilities.DropDownUtility;

public class DatePickerMenuPage extends WidgetsPage {

  private By selectDateField = By.id("datePickerMonthYearInput");
  private By monthDropDown = By.className("react-datepicker__month-select");
  private By yearDropDown = By.cssSelector(".react-datepicker__year-select");
  private DropDownUtility dropDownUtilityObj = new DropDownUtility(driver);
  private By dayValue(String day) {
    return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
  }

  public void clickDay(String day) {
//    By dayValue = By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
//    click(dayValue);
    click(dayValue(day));
  }

  public boolean isDayInMonth(String day) {
//    By dayValue = By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
//    return find(dayValue).isDisplayed();
    return find(dayValue(day)).isDisplayed();
  }

  public void clickSelectDate() {
    click(selectDateField);
  }

  public String getDate() {
    return find(selectDateField).getAttribute("value");
  }

  public void selectMonth(String month) {
    dropDownUtilityObj.selectByVisibleText(monthDropDown, month);
  }

  public void selectYear(String year) {
    dropDownUtilityObj.selectByVisibleText(yearDropDown, year);
  }
}
