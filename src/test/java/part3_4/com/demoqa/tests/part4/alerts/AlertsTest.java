// package part3_4.com.demoqa.tests.part4.alerts;

// import org.testng.Assert;
// import org.testng.annotations.Test;
// import part3_4.com.demoqa.base.BaseTest;

// import utilities.SwitchToUtility;

// @Test
// public class AlertsTest extends BaseTest {

//   private SwitchToUtility switchToUtilityObj = new SwitchToUtility();

//   public void testInformationAlert() {
//     String expectedAlertText = "You clicked a button";
//     var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
//     alertsPage.clickInformationAlertButton();

//     Assert.assertEquals(switchToUtilityObj.getAlertText(), expectedAlertText,
//             "\n Actual & Expected Messages Do Not Match \n");
//     switchToUtilityObj.acceptAlert();
//   }

//   public void testConfirmationAlert() {
//     var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
//     alertsPage.clickConfirmationAlertButton();
//     switchToUtilityObj.dismissAlert();
//     String actualConfirmationResult = alertsPage.getConfirmationResult();
//     String expectedConfirmationResult = "You selected Cancel";
//     Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult,
//             "\n You Did Not Select Cancel \n");
//   }

//   public void testPromptAlert() {
//     String alertText = "Selenium With Java";
//     String expectedResult = "You entered " + alertText;

//     var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
//     alertsPage.clickPromptAlertButton();
//     switchToUtilityObj.setAlertText(alertText);
//     switchToUtilityObj.acceptAlert();
//     String actualResult = alertsPage.getPromptAlertResult();
//     Assert.assertEquals(actualResult, expectedResult,
//             "\n Actual & Expected Results Do Not Match \n");
//   }
// }
