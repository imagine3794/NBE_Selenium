package com.tricentis.tests.automobile;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tricentis.base.BaseTest;

public class EnterVehicleDataTestDataProvider extends BaseTest {
 
  @Test(dataProvider = "SearchProvider")
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

    var automobilePage = homePage.goToAutomobile();
    automobilePage.setMake(make);
    automobilePage.setEnginePerformance(enginePerformance);
    automobilePage.setDateOfManufacture(dateOfManufacture);
    automobilePage.setNumberOfSeats(numberOfSeats);
    automobilePage.setFuelType(fuelType);
    automobilePage.setListPrice(listPrice);
    automobilePage.setLicensePlateNumber(licensePlateNumber);
    automobilePage.setAnnualMileage(annualMileage);
    automobilePage.clickNextButton();
  }

  @DataProvider(name="SearchProvider")
  public Object[][] getDataFromDataprovider(Method m){
    if(m.getName().equalsIgnoreCase("testEnterVehicleData")){
      return new Object[][] {
        { "Opel", "100", "12/15/2024", "5", "Gas", "500", "ABC123", "10000" },
        { "Tesla", "100", "12/15/2024", "5", "Gas", "500", "ABC123", "10000" },
        { "SYM", "100", "12/15/2024", "5", "Gas", "500", "ABC123", "10000" }
      };
    }
    return new Object[][] {};
  }
}