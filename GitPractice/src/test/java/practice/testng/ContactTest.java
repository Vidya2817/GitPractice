package practice.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class ContactTest {
	
 /*@Test
 public void test1()
 {
	 System.out.println("Hi TestNg");
 } */
 @Test(priority = 1)
 public void createContactTest()
 {
	Reporter.log("login successfull");
 }
 @Test(priority = 1)
 public void AddContactTest()
 {
	Reporter.log("added contact");
 }

 @Test(priority = -1)
 public void createContactWithMobileNoTest()
 {
	 Reporter.log("mobile",true);
 }
@Test(priority = 0)
 public void createContactWithIndustryTypeTest()
 {
	 System.out.println("Hi industry");
 }
}
