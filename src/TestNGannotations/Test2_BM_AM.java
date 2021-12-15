package TestNGannotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2_BM_AM {
/* Testcase with single method
 * 1. Launch Chrome browser
 * 2. Go to test URL https://www.saucedemo.com/
 * 3.Get title of the page
 * 4. Get the URL of the page
 * 5. Close browser
 */
	public WebDriver driver;
	@BeforeMethod
	public void launchbrowser() throws InterruptedException
	{
	//Launch the chrome  browser
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 Thread.sleep(3000);
	}
	@AfterMethod
	public void close()
	{
		//Close the browser
		driver.close();
	
	}
	@Test(priority=1)
	public void swaglabtest() throws InterruptedException
	{
	
		
			// GO to URL https://www.saucedemo.com//
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(3000);
			
			//Verification based on URL
			String expURL = "https://www.saucedemo.com/";
			String actualURL = driver.getCurrentUrl();
		
			Assert.assertEquals(expURL,actualURL);
			Thread.sleep(3000);
			
	}		

	@Test(priority=2)
	public void yahoo() throws InterruptedException
	{
	
			
			// GO to URL https://www.yahoo.com//
			driver.get("https://www.yahoo.com/");
			Thread.sleep(3000);
			
			//Verification based on URL
			String expURL = "https://www.yahoo.com/";
			String actualURL = driver.getCurrentUrl();
		
			Assert.assertEquals(expURL,actualURL);
			Thread.sleep(3000);
			
	}
	@Test(priority=3)
	public void google() throws InterruptedException
	{
	
		
			// GO to URL https://www.google.com//
			driver.get("https://www.google.com/");
			Thread.sleep(3000);
			
			//Verification based on URL
			String expURL = "https://www.google.com/";
			String actualURL = driver.getCurrentUrl();
		
			Assert.assertEquals(expURL,actualURL);
			Thread.sleep(3000);
			
	}
	
	
}
