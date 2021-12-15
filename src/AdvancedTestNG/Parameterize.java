package AdvancedTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameterize{
	public WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void setup(String browser) {
		 System.out.println("My setupmethods");
		//String browser=testcontext.getCurrentXmlTest().getParameter("browser");
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("Chrome Browser");
			
		}
		else if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver","C:\\Automation\\Software\\Drivers\\edgedriver.exe");
			driver=new EdgeDriver();
			System.out.println("Edge Browser");
			
		}
		
		else if(browser.equalsIgnoreCase("ff")){
			System.setProperty("webdriver.gecko.driver","C:\\Automation\\Software\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println("ff Browser");
			
			
		}
		  
	  }

 

  @Parameters({"username","password"})
  @AfterMethod
	public void gettestresult(String username, String password) throws InterruptedException
	{
	// GO to URL https://www.saucedemo.com//
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@id='login-button']")).click();
			Thread.sleep(3000);
			driver.close();
	
	}
}
