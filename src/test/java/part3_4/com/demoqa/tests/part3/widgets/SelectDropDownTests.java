// package part3_4.com.demoqa.tests.part3.widgets;
// 
// import org.testng.Assert;
// import org.testng.annotations.Test;
// import part3_4.com.demoqa.base.BaseTest;
// 
// import java.util.List;
// 
// public class SelectDropDownTests extends BaseTest {
// 
//     @Test
//     public void testSelectDropDown() {
//         var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
//         selectMenuPage.selectStandardMulti("Volvo");
//         selectMenuPage.selectStandardMulti("Saab");
//         List<String> selectedOptions = selectMenuPage.getSelectedOptions();
//         Assert.assertTrue(selectedOptions.contains("Volvo"),
//             "\n Selected Options Does Not Contain Volvo \n");
//     }
// }
