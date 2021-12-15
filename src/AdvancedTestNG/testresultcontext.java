package AdvancedTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testresultcontext {
	
public WebDriver driver;
@BeforeTest(alwaysRun=true)
  public void setup(ITestContext testcontext) {
	String browser=testcontext.getCurrentXmlTest().getParameter("browser");
	
	
	if(browser.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Chrome Browser");
		driver.close();
	}
	else if(browser.equalsIgnoreCase("edge")){
		System.setProperty("webdriver.edge.driver","C:\\Automation\\Software\\Drivers\\edgedriver.exe");
		driver=new EdgeDriver();
		System.out.println("Edge Browser");
		driver.close();
	}
	
	else if(browser.equalsIgnoreCase("ff")){
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Software\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("ff Browser");
		driver.close();
		
	}
	  
  }

	@Test(groups="sanity")
	public void testlogin(){
	

	}
	@Test(groups="sanity")
	public void testCreateAdmin(){
	

	}
	@Test
	public void testDeluser()
	{
		Assert.assertEquals(true, false);
		Assert.
	}
	
	@AfterMethod
	public void gettestresult(ITestResult testresult)
	{
		System.out.println("TCName:"+testresult.getName());
		System.out.println("TC Result"+testresult.getStatus());
	}
}