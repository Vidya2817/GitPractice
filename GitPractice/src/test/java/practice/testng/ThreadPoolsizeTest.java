package practice.testng;

import java.lang.annotation.Repeatable;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThreadPoolsizeTest {
	@Test(invocationCount = 5,threadPoolSize = 3) // threadpoolsize how many browsers at a time
	public void loginTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
		String title=driver.getTitle();
		driver.findElement(By.id("user-name")).sendKeys("hi");
		driver.findElement(By.id("password")).sendKeys("hello");
		driver.findElement(By.id("login-button")).click();
		Reporter.log(title,true);
	}

}
