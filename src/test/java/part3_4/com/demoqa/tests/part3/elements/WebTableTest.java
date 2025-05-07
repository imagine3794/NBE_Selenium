// package part3_4.com.demoqa.tests.part3.elements;
// 
// import org.testng.Assert;
// import org.testng.annotations.Test;
// import part3_4.com.demoqa.base.BaseTest;
// 
// public class WebTableTest extends BaseTest {
// 
//     @Test
//     public void testWebTable() {
//         var webTablePage = homePage.goToElements().clickWebTable();
//         webTablePage.clickAddButton();
//         webTablePage.setFirstName("John");
//         webTablePage.setLastName("Doe");
//         webTablePage.setEmail("john.doe@example.com");
//         webTablePage.setAge("30");
//         webTablePage.setSalary("50000");
//         webTablePage.setDepartment("IT");
//         webTablePage.clickSubmitButton();
//         Assert.assertTrue(webTablePage.isRecordAdded("John", "Doe"),
//             "\n Record Was Not Added Successfully \n");
//     }
// }
