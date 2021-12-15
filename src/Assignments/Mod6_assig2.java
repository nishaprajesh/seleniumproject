package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mod6_assig2 {
	/* Test Scenario I:   Actions 
Step-1 Launch Chrome Browser
Step-2 Open Test URL http://only-testing-blog.blogspot.com/2014/09/selectable.html
Step-4  Double Click on Double-Click Me To See Alert Button  to generate Alert
Step-5  Accept Alert 
Step-6 Close Browser

  
*/
	public static void main(String[] args) throws InterruptedException {
	//Step-1 Launch ChromeBrowser
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//Step-2 Open Test URL http://only-testing-blog.blogspot.com/2014/09/selectable.html
		
	driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
	Thread.sleep(2000);

	//Step-4  Double Click on Double-Click Me To See Alert Button  to generate Alert
	WebElement e= driver.findElement(By.xpath("//button[contains(text(),'See Alert')]"));
	Actions dblclk= new Actions(driver);
	dblclk.doubleClick(e).build().perform();
	Thread.sleep(2000);
		
	
	//Step-5  Accept Alert 
	String atxt=driver.switchTo().alert().getText();
	System.out.println(atxt);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
//Step-6 Close Browser
	driver.close();
	
	
	
	}
}