// package part3_4.com.demoqa.tests.part3.widgets;
// 
// import org.testng.Assert;
// import org.testng.annotations.Test;
// import part3_4.com.demoqa.base.BaseTest;
// 
// public class DateTest extends BaseTest {
// 
//     @Test
//     public void testDatePicker() {
//         var datePickerPage = homePage.goToWidgets().clickDatePicker();
//         datePickerPage.selectDate("12/25/2023");
//         String actualDate = datePickerPage.getSelectedDate();
//         String expectedDate = "12/25/2023";
//         Assert.assertEquals(actualDate, expectedDate,
//             "\n Actual & Expected Dates Do Not Match \n");
//     }
// }
