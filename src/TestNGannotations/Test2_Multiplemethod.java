package TestNGannotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2_Multiplemethod {
/* Testcase with single method
 * 1. Launch Chrome browser
 * 2. Go to test URL https://www.saucedemo.com/
 * 3.Get title of the page
 * 4. Get the URL of the page
 * 5. Close browser
 */
	@Test
	public void swaglabtest() throws InterruptedException
	{
	
	//Launch the chrome  browser
			System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			// GO to URL https://www.saucedemo.com//
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(3000);
			
			//Verification based on URL
			String expURL = "https://www.saucedemo.com/";
			String actualURL = driver.getCurrentUrl();
		
			Assert.assertEquals(expURL,actualURL);
			Thread.sleep(3000);
			//Close the browser
			driver.close();

	}		

}
