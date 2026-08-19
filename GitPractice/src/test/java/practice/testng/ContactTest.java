package practice.testng;

import org.testng.annotations.Test;

public class ContactTest {
	
 /*@Test
 public void test1()
 {
	 System.out.println("Hi TestNg");
 } */
 @Test(priority = 11)
 public void createContactTest()
 {
	 System.out.println("contacttest");
 }
 @Test(priority = -1)
 public void createContactWithMobileNoTest()
 {
	 System.out.println("mobile");
 }
 @Test(priority = 0)
 public void createContactWithIndustryTypeTest()
 {
	 System.out.println("Hi industry");
 }
}
