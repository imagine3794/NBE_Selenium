// package part3_4.com.demoqa.tests.part3.forms;
// 
// import org.testng.Assert;
// import org.testng.annotations.Test;
// import part3_4.com.demoqa.base.BaseTest;
// 
// public class RadioButtonTest extends BaseTest {
// 
//     @Test
//     public void testRadioButton() {
//         var radioButtonPage = homePage.goToElements().clickRadioButton();
//         radioButtonPage.clickYesRadio();
//         String actualText = radioButtonPage.getSelectedRadioText();
//         Assert.assertTrue(actualText.contains("Yes"),
//             "\n The Message Does Not Contain 'Yes' \n");
//     }
// }
