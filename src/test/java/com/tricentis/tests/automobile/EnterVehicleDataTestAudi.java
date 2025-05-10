package com.tricentis.tests.automobile;

import org.testng.annotations.Test;
import io.qameta.allure.*;
import com.tricentis.base.BaseTest;
import com.tricentis.pages.AutomobilePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import java.io.ByteArrayInputStream;

@Feature("Automobile Insurance")
@Story("Vehicle Data Entry")
public class EnterVehicleDataTestAudi extends BaseTest {
 
  @Test
  @Description("Test entering vehicle data for an Audi car")
  @Severity(SeverityLevel.CRITICAL)
  public void testEnterVehicleData() {
    var automobilePage = homePage.goToAutomobile();
    
    setMake(automobilePage);
    setEnginePerformance(automobilePage);
    setDateOfManufacture(automobilePage);
    setNumberOfSeats(automobilePage);
    setFuelType(automobilePage);
    setListPrice(automobilePage);
    setLicensePlateNumber(automobilePage);
    setAnnualMileage(automobilePage);
    clickNext(automobilePage);
  }

  @Step("Setting make to Audi")
  private void setMake(AutomobilePage automobilePage) {
    automobilePage.setMake("Audi");
  }

  @Step("Setting engine performance to 100")
  private void setEnginePerformance(AutomobilePage automobilePage) {
    automobilePage.setEnginePerformance("100");
  }

  @Step("Setting date of manufacture to 12/15/2024")
  private void setDateOfManufacture(AutomobilePage automobilePage) {
    automobilePage.setDateOfManufacture("12/15/2024");
  }

  @Step("Setting number of seats to 5")
  private void setNumberOfSeats(AutomobilePage automobilePage) {
    automobilePage.setNumberOfSeats("5");
  }

  @Step("Setting fuel type to Gas")
  private void setFuelType(AutomobilePage automobilePage) {
    automobilePage.setFuelType("Gas");
  }

  @Step("Setting list price to 500")
  private void setListPrice(AutomobilePage automobilePage) {
    automobilePage.setListPrice("500");
  }

  @Step("Setting license plate number to ABC123")
  private void setLicensePlateNumber(AutomobilePage automobilePage) {
    automobilePage.setLicensePlateNumber("ABC123");
  }

  @Step("Setting annual mileage to 10000")
  private void setAnnualMileage(AutomobilePage automobilePage) {
    automobilePage.setAnnualMileage("10000");
  }

  @Step("Clicking next button")
  private void clickNext(AutomobilePage automobilePage) {
    automobilePage.clickNextButton();
  }
}