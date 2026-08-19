package practice.testng;

import org.testng.annotations.Test;

public class dependOnScriptTest{

	@Test
	public void createContactTest() {
		System.out.println("CreateContact");
	}
	@Test(dependsOnMethods = "createContactTest")
  public void createContactWithMobileTest()
		{
		System.out.println("mobile");
		}
	@Test(dependsOnMethods = "createContactWithMobileTest")
	public void createContactWithIndustryTypeTest()
		{
		System.out.println("industryType");
		}
	}

