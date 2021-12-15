package Webdriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FF {
	@Test
	public void verifySwagloginFF() throws InterruptedException
	{
		//Launch the FF  browser
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Software\\Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		// GO to URL https://www.saucedemo.com//
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		//Verification based on title
		String ExpetedTitle="Swag Labs";
		
		String actualURL=driver.getTitle();
		if(ExpetedTitle.equals(actualURL))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		Thread.sleep(3000);
		//Close the browser
		driver.close();

		
	}
}
