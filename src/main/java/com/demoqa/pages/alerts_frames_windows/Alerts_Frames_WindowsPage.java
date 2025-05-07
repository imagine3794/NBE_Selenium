package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import utilities.JavaScriptUtility;

public class Alerts_Frames_WindowsPage extends HomePage {

  private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");
  private By alertsMenuItem = By.xpath("//li[@id='item-1']/span[text()='Alerts']");
  private By framesMenuItem = By.xpath("//li[@id='item-2']/span[text()='Frames']");
  private By browserWindowsMenuItem = By.xpath("//li[@id='item-0']/span[text()='Browser Windows']");
  private JavaScriptUtility javascriptUtilityObj = new JavaScriptUtility(driver);

  public BrowserWindowsPage clickBrowserWindows() {
    javascriptUtilityObj.scrollToElementJS(browserWindowsMenuItem);
    click(browserWindowsMenuItem);
    return new BrowserWindowsPage();
  }

  public FramesPage clickFrames() {
    javascriptUtilityObj.scrollToElementJS(framesMenuItem);
    click(framesMenuItem);
    return new FramesPage();
  }

  public AlertsPage clickAlerts() {
    javascriptUtilityObj.scrollToElementJS(alertsMenuItem);
    click(alertsMenuItem);
    return new AlertsPage();
  }

  public ModalDialogsPage clickModalDialogs() {
    javascriptUtilityObj.scrollToElementJS(modalDialogsMenuItem);
    click(modalDialogsMenuItem);
    return new ModalDialogsPage();
  }
}
