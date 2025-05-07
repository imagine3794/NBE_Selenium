package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

  protected WebDriver driver;

  public void setDriver(WebDriver driver) {
    this.driver = driver;
  }

  protected WebElement find(By locator) {
    return driver.findElement(locator);
  }

  protected void set(By locator, String text) {
    find(locator).clear();
    find(locator).sendKeys(text);
  }

  protected void click(By locator) {
    find(locator).click();
  }

  public void delay(int milliseconds) {
    // Demo Purpose
    try {
      Thread.sleep(milliseconds);
    } catch(InterruptedException exc) {
      exc.printStackTrace();
    }
  }
}
