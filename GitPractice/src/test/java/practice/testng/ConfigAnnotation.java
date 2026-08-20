package practice.testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigAnnotation {
 @BeforeSuite
	public void beforeSuite() 
	{
		Reporter.log("database connected Successfully",true);
	}
 
 @AfterSuite
 public void afterSuitye()
 {
	 Reporter.log("database disconnected Successfully",true);
 }
 
 @BeforeTest
 public void beforeTest()
 {
	 Reporter.log("VPN connected Successfully",true);
	 
 }
 
 @AfterTest
 public void afterTest()
 {
	 Reporter.log("VPN disconnected Successfully",true);
	 
 }
@BeforeClass
 public void beforeClass()
 {
	 Reporter.log("browser launched Successfully",true);
	 
 }
@AfterClass
public void afterClass()
{
	 Reporter.log("browser closed Successfully",true);
	 
}

 @BeforeMethod
public void beforeMethod()
{
	 Reporter.log("login to application",true);
	 
}
 
@AfterMethod
 public void afterMethod()
 {
 	 Reporter.log("logout from application",true);
 	 
 }
	@Test
	public void addProduct()
	{
		Reporter.log("Added product to cart",true);
	}
	
}
