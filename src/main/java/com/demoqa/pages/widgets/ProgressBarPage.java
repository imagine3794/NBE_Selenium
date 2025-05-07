package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import utilities.GetUtility;
import utilities.WaitUtility;

public class ProgressBarPage extends WidgetsPage {

  private By startButton = By.id("startStopButton");
  private By progressValue = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='100']");
  private WaitUtility waitUtilityObj = new WaitUtility(driver);
  private GetUtility getUtilityObj = new GetUtility(driver);

  public String getProgressValue() {
    waitUtilityObj.fluentWaitUntilVisible(30, progressValue);
    return getUtilityObj.getText(progressValue);
  }

  public void clickStartButton() {
    click(startButton);
  }
}
