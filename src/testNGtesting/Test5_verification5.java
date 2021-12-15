package testNGtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test5_verification5 {
	
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
		//Verification of error message
		String Expectederr="Epic sadface: Username and password do not match any user in this service";
		
		String Actualerr=driver.findElement(By.xpath("//h3[contains(text(),'password')]")).getText();
		if(Expectederr.equals(Actualerr))
		//if(Actualerr.contains("Username and password do not match")
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
