package testNGtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2_verification2 {
	//Verification based on URL
	@Test
	public void verifySwaglogin() throws InterruptedException
	{
		//Launch the chrome  browser
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// GO to URL https://www.saucedemo.com//
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		Thread.sleep(3000);
			
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(3000);
		//Verification based on URL
		String ExpetedURL="https://www.saucedemo.com/inventory.html";
		
				String actualURL=driver.getCurrentUrl();
		if(ExpetedURL.equals(actualURL))
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
