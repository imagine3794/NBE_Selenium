package com.tricentis.pages;

import org.openqa.selenium.By;
import com.base.BasePage;
import utilities.JavaScriptUtility;
import utilities.DropDownUtility;
import utilities.GetUtility;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class AutomobilePage extends BasePage {
    private By make = By.xpath("//*[@id='make']");
    private By enginePerformance = By.xpath("//*[@id='engineperformance']");
    private By dateOfManufacture = By.xpath("//*[@id='dateofmanufacture']");
    private By dateOfManufactureDatePicker = By.xpath("//*[@id='opendateofmanufacturecalender']");
    private By leftArrowDatePicker = By.xpath("//*[@id='ui-datepicker-div']/div/a[1]");
    private By monthOfDatePicker = By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]");
    private By yearOfDatePicker = By.xpath("//*[@id='ui-datepicker-div']/div/div/span[2]");
    private By numberOfSeats = By.xpath("//*[@id='numberofseats']");
    private By fuelType = By.xpath("//*[@id='fuel']");
    private By listPrice = By.xpath("//*[@id='listprice']");
    private By licensePlateNumber = By.xpath("//*[@id='licenseplatenumber']");
    private By annualMileage = By.xpath("//*[@id='annualmileage']");  
    private By nextButton = By.xpath("//*[@id='nextenterinsurantdata']");
  
    public void setMake(String makeValue) {
      delay(1000);
      new JavaScriptUtility(driver).scrollToElementJS(make);
      new DropDownUtility(driver).selectByValue(make, makeValue);
    }
  
    public void setEnginePerformance(String kW) {
      delay(1000);
      new JavaScriptUtility(driver).scrollToElementJS(enginePerformance);
      set(enginePerformance, kW);
    }
  
    private String formatDateWithMonthName(String date) {
      delay(1000);
      String[] parts = date.split("/");
      int month = Integer.parseInt(parts[0]);
      int day = Integer.parseInt(parts[1]);
      int year = Integer.parseInt(parts[2]);
      
      LocalDate localDate = LocalDate.of(year, month, day);
      return localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH) + " " + 
             day + " "+ year;
    }
  
    public void setDateOfManufacture(String date) {
      new JavaScriptUtility(driver).scrollToElementJS(dateOfManufacture);
      new JavaScriptUtility(driver).clickJS(dateOfManufactureDatePicker);
      while (true) {
        delay(1000);
        String year = new GetUtility(driver).getText(yearOfDatePicker);
        if (year.equals(date.split("/")[2])) {
          break;
        }
        new JavaScriptUtility(driver).clickJS(leftArrowDatePicker);
      }
      while (true) {
        delay(1000);
        String monthName = new GetUtility(driver).getText(monthOfDatePicker);
        String targetMonthName = formatDateWithMonthName(date).split(" ")[0];
        if (monthName.equals(targetMonthName)) {
          break;
        }
        new JavaScriptUtility(driver).clickJS(leftArrowDatePicker);
      }
  
      int day = Integer.parseInt(date.split("/")[1]);
      By dayOfDatePicker = By.xpath("//*[@id='ui-datepicker-div']/table/tbody//a[text()='"+ day + "']");
      new JavaScriptUtility(driver).clickJS(dayOfDatePicker);
    }
  
    public void setNumberOfSeats(String seats) {
      delay(1000);
      new JavaScriptUtility(driver).scrollToElementJS(numberOfSeats);
      new DropDownUtility(driver).selectByValue(numberOfSeats, seats);
    }
  
    public void setFuelType(String fuel) {
      delay(1000);
      new JavaScriptUtility(driver).scrollToElementJS(fuelType);
      new DropDownUtility(driver).selectByValue(fuelType, fuel);
    }
  
    public void setListPrice(String price) {
      delay(1000);
      new JavaScriptUtility(driver).scrollToElementJS(listPrice);
      set(listPrice, price);
    }
  
    public void setLicensePlateNumber(String plateNumber) {
      delay(1000);
      new JavaScriptUtility(driver).scrollToElementJS(licensePlateNumber);
      set(licensePlateNumber, plateNumber);
    }
  
    public void setAnnualMileage(String miles) {
      delay(1000);
      new JavaScriptUtility(driver).scrollToElementJS(annualMileage);
      set(annualMileage, miles);
    }
  
    public void clickNextButton() {
      delay(1000);
      new JavaScriptUtility(driver).scrollToElementJS(nextButton);
      click(nextButton);
    }
  }
  