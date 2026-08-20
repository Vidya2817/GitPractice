package practice.testng;

import java.io.File;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class StoreMultipleScreenShotTest {
@Test
public void Sample() throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.google.com/");
	Date d=new Date();
	System.out.println(d);
	String date = d.toString().replace("","_" ).replace(":","_");
	Thread.sleep(2000);
	TakesScreenshot ts=(TakesScreenshot)driver;
    File src=ts.getScreenshotAs(OutputType.FILE);
    File dest=new File("./Screenshots/failed"+date+".png");
    FileHandler.copy(src, dest);
    driver.quit();
}
}
