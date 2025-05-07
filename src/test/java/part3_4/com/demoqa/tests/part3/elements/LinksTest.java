// package part3_4.com.demoqa.tests.part3.elements;
// 
// import org.testng.Assert;
// import org.testng.annotations.Test;
// import part3_4.com.demoqa.base.BaseTest;
// 
// public class LinksTest extends BaseTest {
// 
//     @Test
//     public void testLinks() {
//         var linksPage = homePage.goToElements().clickLinks();
//         linksPage.clickHomeLink();
//         linksPage.switchToNewWindow();
//         String actualURL = linksPage.getCurrentURL();
//         Assert.assertTrue(actualURL.contains("demoqa.com"),
//             "\n The URL Does Not Contain 'demoqa.com' \n");
//     }
// }
