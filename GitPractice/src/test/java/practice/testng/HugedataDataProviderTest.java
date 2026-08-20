package practice.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HugedataDataProviderTest{

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
	public Object[][] details() throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestscriptDataforutility.xlsx");
		 Workbook wb=WorkbookFactory.create(fis);
		 Sheet sh=wb.getSheet("Sheet1");
		int rowCount =sh.getLastRowNum();
		Object [][] objArr=new Object[rowCount][2];
		for(int i=0;i<rowCount;i++)
		{
			objArr[i][0]=sh.getRow(i+1).getCell(0).getStringCellValue();
			objArr[i][1]=sh.getRow(i+1).getCell(1).getStringCellValue();
		}
		
	    return objArr;
	}
}
	

	
