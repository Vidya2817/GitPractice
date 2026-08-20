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
	@Test
	public void createContactWithMobile1Test()
	{
	System.out.println("mobile one");
	}
	@Test(dependsOnMethods = {"createContactWithMobileTest","createContactWithMobile1Test"})
	public void createContactWithIndustryTypeTest()
		{
		System.out.println("industryType");
		}
	}

