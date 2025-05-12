package com.tricentis.pages;

import org.openqa.selenium.By;
import com.base.BasePage;
import utilities.DropDownUtility;
import utilities.GetUtility;
import utilities.JavaScriptUtility;

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
    private By firstName = By.xpath("//*[@id='firstname']");
    private By lastName = By.xpath("//*[@id='lastname']");
    private By dateOfBirth = By.xpath("//*[@id='birthdate']");
    private By genderMale = By.xpath("//*[@id='gendermale']");
    private By streetAddress = By.xpath("//*[@id='streetaddress']");
    private By country = By.xpath("//*[@id='country']");
    private By zipCode = By.xpath("//*[@id='zipcode']");
    private By city = By.xpath("//*[@id='city']");
    private By occupation = By.xpath("//*[@id='occupation']");
    private By speeding = By.xpath("//*[@id='speeding']");
    private By website = By.xpath("//*[@id='website']");
    private By nextButtonProductData = By.xpath("//*[@id='nextenterproductdata']");
    private By startDate = By.xpath("//*[@id='startdate']");
    private By insuranceSum = By.xpath("//*[@id='insurancesum']");
    private By meritRating = By.xpath("//*[@id='meritrating']");
    private By damageInsurance = By.xpath("//*[@id='damageinsurance']");
    private By euroProtection = By.xpath("//*[@id='EuroProtection']");
    private By courtesyCar = By.xpath("//*[@id='courtesycar']");
    private By nextButtonPriceOption = By.xpath("//*[@id='nextselectpriceoption']");
    private By selectGold = By.xpath("//*[@id='selectgold']");
    private By nextButtonSendQuote = By.xpath("//*[@id='nextsendquote']");
    private By email = By.xpath("//*[@id='email']");
    private By username = By.xpath("//*[@id='username']");
    private By password = By.xpath("//*[@id='password']");
    private By confirmPassword = By.xpath("//*[@id='confirmpassword']");
    private By sendEmail = By.xpath("//*[@id='sendemail']");
    private By alertMessage = By.xpath("//div[@class='sweet-alert showSweetAlert visible']/h2[text()='Sending e-mail success!']");

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

    public void setFirstName(String firstNameValue) {
      set(firstName, firstNameValue);
    }

    public void setLastName(String lastNameValue) {
      set(lastName, lastNameValue);
    }

    public void setDateOfBirth(String date) {
      set(dateOfBirth, date);
    }

    public void setGenderMale() {
      new JavaScriptUtility(driver).clickJS(genderMale);
    }

    public void setStreetAddress(String address) {
      set(streetAddress, address);
    }

    public void setCountry(String countryValue) {
      new DropDownUtility(driver).selectByValue(country, countryValue);
    }

    public void setZipCode(String zip) {
      set(zipCode, zip);
    }

    public void setCity(String cityValue) {
      set(city, cityValue);
    }

    public void setOccupation(String occupationValue) {
      new DropDownUtility(driver).selectByValue(occupation, occupationValue);
    }

    public void setSpeeding() {
      new JavaScriptUtility(driver).clickJS(speeding);
    }

    public void setWebsite(String websiteValue) {
      set(website, websiteValue);
    }

    public void clickNextButtonProductData() {
      click(nextButtonProductData);
    }

    public void setStartDate(String date) {
      set(startDate, date);
    }

    public void setInsuranceSum(String sum) {
      new DropDownUtility(driver).selectByVisibleText(insuranceSum, sum);
    }

    public void setMeritRating(String rating) {
      new DropDownUtility(driver).selectByValue(meritRating, rating);
    }

    public void setDamageInsurance(String damage) {
      new DropDownUtility(driver).selectByValue(damageInsurance, damage);
    }

    public void setEuroProtection() {
      new JavaScriptUtility(driver).clickJS(euroProtection);
    }

    public void setCourtesyCar(String car) {
      new DropDownUtility(driver).selectByValue(courtesyCar, car);
    }

    public void clickNextButtonPriceOption() {
      click(nextButtonPriceOption);
    }

    public void selectGold() {
      new JavaScriptUtility(driver).clickJS(selectGold);
    }

    public void clickNextButtonSendQuote() {
      click(nextButtonSendQuote);
    }

    public void setEmail(String emailValue) {
      set(email, emailValue);
    }

    public void setUsername(String usernameValue) {
      set(username, usernameValue);
    } 

    public void setPassword(String passwordValue) {
      set(password, passwordValue);
    }   

    public void setConfirmPassword(String confirmPasswordValue) {
      set(confirmPassword, confirmPasswordValue);
    } 

    public void clickSendEmail() {
      click(sendEmail);
    }

    public boolean isEmailSent() {
      if (new GetUtility(driver).getText(alertMessage).toLowerCase().equals("sending e-mail success!"))
      {
        return true;
      }
      else
      {
        return false;
      }
    } 
  }
  