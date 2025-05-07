package com.tricentis.pages;



import org.openqa.selenium.By;

import com.base.BasePage;

import utilities.JavaScriptUtility;

public class HomePage extends BasePage {
    private By automobileLink = By.xpath("//*[@id='nav_automobile']");

    public AutomobilePage goToAutomobile() {
      new JavaScriptUtility(driver).scrollToElementJS(automobileLink);
      click(automobileLink);
      var obj = new AutomobilePage();
      obj.setDriver(driver);
      return obj;
    }
  
  }