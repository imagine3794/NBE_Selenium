package com.tricentis.pages;

import org.openqa.selenium.By;
import com.base.BasePage;
import utilities.DropDownUtility;

public class AutomobilePage extends BasePage {
    private By make = By. xpath("//*[@id='make']");
    private By enginePerformance = By.xpath("//*[@id='engineperformance']");
    private By dateOfManufacture = By.xpath("//*[@id='dateofmanufacture']");
    private By numberOfSeats = By.xpath("//*[@id='numberofseats']");
    private By fuelType = By.xpath("//*[@id='fuel']");
    private By listPrice = By.xpath("//*[@id='listprice']");
    private By licensePlateNumber = By.xpath("//*[@id='licenseplatenumber']");
    private By annualMileage = By.xpath("//*[@id='annualmileage']");  
    private By nextButton = By.xpath("//*[@id='nextenterinsurantdata']");
  
    public void setMake(String makeValue) {
      new DropDownUtility(driver).selectByValue(make, makeValue);
    }
  
    public void setEnginePerformance(String kW) {
      set(enginePerformance, kW);
    }

    public void setDateOfManufacture(String date) {
      set(dateOfManufacture, date);
    }

    public void setNumberOfSeats(String seats) {
      new DropDownUtility(driver).selectByValue(numberOfSeats, seats);
    }
  
    public void setFuelType(String fuel) {
      new DropDownUtility(driver).selectByValue(fuelType, fuel);
    }
  
    public void setListPrice(String price) {
      set(listPrice, price);
    }
  
    public void setLicensePlateNumber(String plateNumber) {
      set(licensePlateNumber, plateNumber);
    }
  
    public void setAnnualMileage(String miles) {
      set(annualMileage, miles);
    }
  
    public void clickNextButton() {
      click(nextButton);
    }
  }
  