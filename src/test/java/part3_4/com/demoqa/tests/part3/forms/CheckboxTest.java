// package part3_4.com.demoqa.tests.part3.forms;
// 
// import org.testng.Assert;
// import org.testng.annotations.Test;
// import part3_4.com.demoqa.base.BaseTest;
// 
// public class CheckboxTest extends BaseTest {
// 
//     @Test
//     public void testCheckbox() {
//         var checkboxPage = homePage.goToElements().clickCheckbox();
//         checkboxPage.expandAll();
//         checkboxPage.clickDesktopCheckbox();
//         checkboxPage.clickDocumentsCheckbox();
//         String actualText = checkboxPage.getSelectedCheckboxText();
//         Assert.assertTrue(actualText.contains("desktop") && actualText.contains("documents"),
//             "\n The Message Does Not Contain 'desktop' and 'documents' \n");
//     }
// }
