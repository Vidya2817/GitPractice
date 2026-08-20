package practice.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
	@Test(dataProvider="details")   // here it is act like helper attribute
	
	public void loginTest(String username,String password) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
		String title=driver.getTitle();
		Reporter.log(title,true);
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	
	
	@DataProvider   // here , it acts like @Dataprovider annotation
	public Object[][] details()
	{
		Object [][] objArr=new Object[3][2];
		objArr[0][0]="varsh";
		objArr[0][1]="21";
	    objArr[1][0]="vidya";
	    objArr[1][1]="22";
	    objArr[2][0]="Shree";
	    objArr[2][1]="23";
	    return objArr;
	}
}
