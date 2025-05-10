package com.tricentis.tests.automobile;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tricentis.base.BaseTest;
import com.tricentis.pages.AutomobilePage;

import io.qameta.allure.*;
@Feature("Automobile Insurance")
@Story("Vehicle Data Entry")
public class EnterVehicleDataTestFord extends BaseTest {
 
  @Test(dataProvider = "SearchProvider")
  @Description("Test entering vehicle data for a Ford car")
  @Severity(SeverityLevel.CRITICAL)
  public void testEnterVehicleData(
  String make, 
  String enginePerformance, 
  String dateOfManufacture, 
  String numberOfSeats, 
  String fuelType, 
  String listPrice, 
  String licensePlateNumber, 
  String annualMileage
  ) {
    AutomobilePage automobilePage = homePage.goToAutomobile();

    setMake(automobilePage, make);
    setEnginePerformance(automobilePage, enginePerformance);
    setDateOfManufacture(automobilePage, dateOfManufacture);
    setNumberOfSeats(automobilePage, numberOfSeats);
    setFuelType(automobilePage, fuelType);
    setListPrice(automobilePage, listPrice);
    setLicensePlateNumber(automobilePage, licensePlateNumber);
    setAnnualMileage(automobilePage, annualMileage);
    clickNext(automobilePage);
  }

  @Step("Setting make")
  private void setMake(AutomobilePage automobilePage, String make) {
    automobilePage.setMake(make);
  }

  @Step("Setting engine performance")
  private void setEnginePerformance(AutomobilePage automobilePage, String enginePerformance) {
    automobilePage.setEnginePerformance(enginePerformance);
  }

  @Step("Setting date of manufacture")
  private void setDateOfManufacture(AutomobilePage automobilePage, String dateOfManufacture) {
    automobilePage.setDateOfManufacture(dateOfManufacture);
  }

  @Step("Setting number of seats")
  private void setNumberOfSeats(AutomobilePage automobilePage, String numberOfSeats) {
    automobilePage.setNumberOfSeats(numberOfSeats);
  }

  @Step("Setting fuel type")
  private void setFuelType(AutomobilePage automobilePage, String fuelType) {
    automobilePage.setFuelType(fuelType);
  }

  @Step("Setting list price")
  private void setListPrice(AutomobilePage automobilePage, String listPrice) {
    automobilePage.setListPrice(listPrice);
  }

  @Step("Setting license plate number")
  private void setLicensePlateNumber(AutomobilePage automobilePage, String licensePlateNumber) {
    automobilePage.setLicensePlateNumber(licensePlateNumber);
  }

  @Step("Setting annual mileage")
  private void setAnnualMileage(AutomobilePage automobilePage, String annualMileage) {
    automobilePage.setAnnualMileage(annualMileage);
  }

  @Step("Clicking next button")
  private void clickNext(AutomobilePage automobilePage) {
    automobilePage.clickNextButton();
  }

  @DataProvider(name="SearchProvider")
  public Object[][] getDataFromDataprovider(Method m){
    if(m.getName().equalsIgnoreCase("testEnterVehicleData")){
      return new Object[][] {
        { "Ford", "100", "12/15/2024", "5", "Gas", "500", "ABC123", "10000" }
      };
    }
    return new Object[][] {};
  }
}