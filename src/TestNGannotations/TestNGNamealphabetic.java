package TestNGannotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNGNamealphabetic {
/* Testcase with single method
 * 1. Launch Chrome browser
 * 2. Go to test URL https://www.saucedemo.com/
 * 3.Get title of the page
 * 4. Get the URL of the page
 * 5. Close browser
 */
	public WebDriver driver;
	String expURL, actualURL;
	
	@Test(priority=1)
	public void ainitialize() throws InterruptedException
	{
		//Launch the chrome  browser
			System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("First Method");
			
	}
	@Test(dependsOnMethods="ainitialize")
	public void bURL() throws InterruptedException
	{
			
			// GO to URL https://www.saucedemo.com//
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(3000);
			System.out.println("Second Method");
	}
	@Test(dependsOnMethods="bURL")
	public void cverification()
	{
		
			//Verification based on URL
			expURL = "https://www.saucedemo.com/";
			actualURL = driver.getCurrentUrl();
			System.out.println("Third Method");
	}
	//always run=true for functional test case if one fails
	@Test(dependsOnMethods="cverification",alwaysRun=true)
	public void dasserttest() throws InterruptedException
	{
			Assert.assertEquals(expURL,actualURL);
			Thread.sleep(3000);
			//Close the browser
			driver.close();
			System.out.println("Fourth Method");

	}		

}
