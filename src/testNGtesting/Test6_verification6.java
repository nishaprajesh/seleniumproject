package testNGtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test6_verification6 {
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
		WebElement e= driver.findElement(By.xpath("//input[@name='user-name']"));
		e.sendKeys("standard_user");
		Thread.sleep(3000);
		e.clear();
		Thread.sleep(3000);
		e.sendKeys("Nisha");
		Thread.sleep(3000);
		//To get the text you send to the text box use attribute
		String x=e.getAttribute("value");
		System.out.println(x);
		
		//To get the name
				String name=e.getAttribute("name");
				System.out.println(name);
		
		//To get the CSS
		System.out.println("Color="+e.getCssValue("Color"));
		System.out.println("Color="+e.getCssValue("Font-size"));
		
		
		
		Thread.sleep(3000);
					
		//Close the browser
		driver.close();

		
	}

}
