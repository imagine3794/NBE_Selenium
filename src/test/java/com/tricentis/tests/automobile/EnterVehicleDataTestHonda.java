package com.tricentis.tests.automobile;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tricentis.base.BaseTest;
import com.tricentis.pages.AutomobilePage;

import io.qameta.allure.*;
@Feature("Automobile Insurance")
@Story("Vehicle Data Entry")
public class EnterVehicleDataTestHonda extends BaseTest {
 
  @Test(dataProvider = "SearchProvider")
  @Description("Test entering vehicle data for a Honda car")
  @Severity(SeverityLevel.CRITICAL)
  public void testEnterVehicleData(
  String make, 
  String enginePerformance, 
  String dateOfManufacture, 
  String numberOfSeats, 
  String fuelType, 
  String listPrice, 
  String licensePlateNumber, 
  String annualMileage, 
  String firstName,
  String lastName,
  String dateOfBirth,
  String streetAddress,
  String country,
  String zipCode,
  String city,
  String occupation,
  String speeding,
  String website,
  String startDate,
  String insuranceSum,
  String meritRating,
  String damageInsurance,
  String courtesyCar,
  String email,
  String username,
  String password,
  String confirmPassword
  ) {
    AutomobilePage automobilePage = homePage.goToAutomobile();

    // Entering vehicle data
    setMake(automobilePage, make);
    setEnginePerformance(automobilePage, enginePerformance);
    setDateOfManufacture(automobilePage, dateOfManufacture);
    setNumberOfSeats(automobilePage, numberOfSeats);
    setFuelType(automobilePage, fuelType);
    setListPrice(automobilePage, listPrice);
    setLicensePlateNumber(automobilePage, licensePlateNumber);
    setAnnualMileage(automobilePage, annualMileage);
    clickNext(automobilePage);

    // Entering personal data
    setFirstName(automobilePage, firstName);
    setLastName(automobilePage, lastName);
    setDateOfBirth(automobilePage, dateOfBirth);
    setGenderMale(automobilePage);
    setStreetAddress(automobilePage, streetAddress);
    setCountry(automobilePage, country);
    setZipCode(automobilePage, zipCode);
    setCity(automobilePage, city);
    setOccupation(automobilePage, occupation);
    setSpeeding(automobilePage);
    setWebsite(automobilePage, website);
    clickNextButtonProductData(automobilePage);

    // Entering product data
    setStartDate(automobilePage, startDate);
    setInsuranceSum(automobilePage, insuranceSum);
    setMeritRating(automobilePage, meritRating);
    setDamageInsurance(automobilePage, damageInsurance);
    setEuroProtection(automobilePage);
    setCourtesyCar(automobilePage, courtesyCar);
    clickNextButtonPriceOption(automobilePage);

    // Entering price option
    selectGold(automobilePage);
    clickNextButtonSendQuote(automobilePage);

    // Entering contact data
    setEmail(automobilePage, email);
    setUsername(automobilePage, username);
    setPassword(automobilePage, password);
    setConfirmPassword(automobilePage, confirmPassword);
    clickSendEmail(automobilePage);

    // Verifying email sent
    Assert.assertTrue(automobilePage.isEmailSent());

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

  @Step("Setting first name")
  private void setFirstName(AutomobilePage automobilePage, String firstName) {
    automobilePage.setFirstName(firstName);
  }

  @Step("Setting last name")  
  private void setLastName(AutomobilePage automobilePage, String lastName) {
    automobilePage.setLastName(lastName);
  }

  @Step("Setting date of birth")
  private void setDateOfBirth(AutomobilePage automobilePage, String dateOfBirth) {
    automobilePage.setDateOfBirth(dateOfBirth);
  }

  @Step("Setting gender male")
  private void setGenderMale(AutomobilePage automobilePage) {
    automobilePage.setGenderMale();
  }

  @Step("Setting street address")
  private void setStreetAddress(AutomobilePage automobilePage, String streetAddress) {
    automobilePage.setStreetAddress(streetAddress);
  }

  @Step("Setting country")  
  private void setCountry(AutomobilePage automobilePage, String country) {
    automobilePage.setCountry(country);
  }

  @Step("Setting zip code")
  private void setZipCode(AutomobilePage automobilePage, String zipCode) {
    automobilePage.setZipCode(zipCode);
  }

  @Step("Setting city")
  private void setCity(AutomobilePage automobilePage, String city) {
    automobilePage.setCity(city);
  }

  @Step("Setting occupation")
  private void setOccupation(AutomobilePage automobilePage, String occupation) {
    automobilePage.setOccupation(occupation);
  }

  @Step("Setting speeding") 
  private void setSpeeding(AutomobilePage automobilePage) {
    automobilePage.setSpeeding();
  }

  @Step("Setting website")
  private void setWebsite(AutomobilePage automobilePage, String website) {
    automobilePage.setWebsite(website);
  }

  @Step("Clicking next button product data")
  private void clickNextButtonProductData(AutomobilePage automobilePage) {
    automobilePage.clickNextButtonProductData();
  }

  @Step("Setting start date")
  private void setStartDate(AutomobilePage automobilePage, String startDate) {
    automobilePage.setStartDate(startDate);
  }

  @Step("Setting insurance sum")  
  private void setInsuranceSum(AutomobilePage automobilePage, String insuranceSum) {
    automobilePage.setInsuranceSum(insuranceSum);
  }

  @Step("Setting merit rating")
  private void setMeritRating(AutomobilePage automobilePage, String meritRating) {
    automobilePage.setMeritRating(meritRating);
  }

  @Step("Setting damage insurance")
  private void setDamageInsurance(AutomobilePage automobilePage, String damageInsurance) {
    automobilePage.setDamageInsurance(damageInsurance);
  } 

  @Step("Setting euro protection")
  private void setEuroProtection(AutomobilePage automobilePage) {
    automobilePage.setEuroProtection();
  }

  @Step("Setting courtesy car")
  private void setCourtesyCar(AutomobilePage automobilePage, String courtesyCar) {
    automobilePage.setCourtesyCar(courtesyCar);
  } 

  @Step("Clicking next button price option")
  private void clickNextButtonPriceOption(AutomobilePage automobilePage) {
    automobilePage.clickNextButtonPriceOption();
  }

  @Step("Selecting gold")
  private void selectGold(AutomobilePage automobilePage) {
    automobilePage.selectGold();
  }

  @Step("Clicking next button send quote")
  private void clickNextButtonSendQuote(AutomobilePage automobilePage) {
    automobilePage.clickNextButtonSendQuote();
  }

  @Step("Setting email")
  private void setEmail(AutomobilePage automobilePage, String email) {
    automobilePage.setEmail(email);
  }

  @Step("Setting username")
  private void setUsername(AutomobilePage automobilePage, String username) {
    automobilePage.setUsername(username);
  }

  @Step("Setting password")
  private void setPassword(AutomobilePage automobilePage, String password) {
    automobilePage.setPassword(password);
  }

  @Step("Setting confirm password")
  private void setConfirmPassword(AutomobilePage automobilePage, String confirmPassword) {
    automobilePage.setConfirmPassword(confirmPassword);
  }

  @Step("Clicking send email")  
  private void clickSendEmail(AutomobilePage automobilePage) {
    automobilePage.clickSendEmail();
  }

  @DataProvider(name="SearchProvider")
  public Object[][] getDataFromDataprovider(Method m){
    if(m.getName().equalsIgnoreCase("testEnterVehicleData")){
      return new Object[][] {
        // Test Case 1: Standard Audi A4 configuration
        { "Honda",
          "100",
          "12/15/2024",
          "5",
          "Gas",
          "50000",
          "ABC123",
          "10000",
          "John",
          "Doe",
          "12/15/1994",
          "123 Main St",
          "United States",
          "12345",
          "Anytown",
          "Farmer",
          "10",
          "https://www.google.com",
          "12/15/2026",
          "3.000.000,00",
          "Bonus 1",
          "Full Coverage",
          "Yes",
          "john.doe@example.com",
          "johndoe",
          "Password123!",
          "Password123!"
        }
      };
    }
    return new Object[][] {};
  }
}