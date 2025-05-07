package com.tricentis.tests.automobile;

import org.testng.annotations.Test;

import com.tricentis.base.BaseTest;

public class EnterVehicleDataTestHonda extends BaseTest {
 
  @Test
  public void testEnterVehicleData() {
    var automobilePage = homePage.goToAutomobile();
    automobilePage.setMake("Honda");
    automobilePage.setEnginePerformance("100");
    automobilePage.setDateOfManufacture("12/15/2024");
    automobilePage.setNumberOfSeats("5");
    automobilePage.setFuelType("Gas");
    automobilePage.setListPrice("500");
    automobilePage.setLicensePlateNumber("ABC123");
    automobilePage.setAnnualMileage("10000");
    automobilePage.clickNextButton();
  }
}