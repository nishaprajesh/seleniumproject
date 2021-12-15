package testNGtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test4_verification4 {
	
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
		//Verification based on an element in the target page with contains
		String Expectedtitle = "Swag";
		String Acttitle=driver.getTitle();
	
	
		if(Acttitle.contains(Expectedtitle))
		{
			System.out.println("Title contains text-Pass");
		}
		else
		{
			System.out.println("Title doesnt contains text-Fail");
		}
		Thread.sleep(3000);
		//Close the browser
		driver.close();

		
	}

}
