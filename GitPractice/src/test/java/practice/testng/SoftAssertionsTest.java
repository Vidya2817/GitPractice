package practice.testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsTest {
	@Test
	public void sample() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		Reporter.log("step 1",true);
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(title, "Instagram"); 
		Reporter.log("step 2",true);
		driver.quit();
		sf.assertAll();
	}
}
