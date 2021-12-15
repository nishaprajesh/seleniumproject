package Webdriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Edgerun {
	@Test
	public void verifySwagloginEdge() throws InterruptedException
	{
		//Launch the edge  browser
		System.setProperty("webdriver.edge.driver","C:\\Automation\\Software\\Drivers\\edgedriver.exe");
		
		
		WebDriver driver=new EdgeDriver();
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
