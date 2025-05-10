package com.tricentis.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private By automobileLink = By.xpath("//*[@id='nav_automobile']");

    public AutomobilePage goToAutomobile() {
      click(automobileLink);
      var obj = new AutomobilePage();
      obj.setDriver(driver);
      return obj;
    }
  
  }