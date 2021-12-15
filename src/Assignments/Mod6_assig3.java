package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mod6_assig3 {
	/* Test Scenario I:   Actions 
Step-1 Launch Chrome Browser
Step-2 Open Test URL http://only-testing-blog.blogspot.com/2014/09/selectable.html
Step-3 Drag the Slider up to 50% and drop the Slider  
Step-4 Close Browser

*/
	public static void main(String[] args) throws InterruptedException {
	//Step-1 Launch ChromeBrowser
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//Step-2 Open Test URL http://only-testing-blog.blogspot.com/2014/09/selectable.html
		
	driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
	Thread.sleep(2000);

	//Step-4  Right  Click on Double-Click Me To See Alert Button  
	WebElement e= driver.findElement(By.xpath("//button[contains(text(),'See Alert')]"));
	Actions rclk= new Actions(driver);
	rclk.contextClick(e).build().perform();
	
	Thread.sleep(2000);
		
	
//Step-6 Close Browser
	driver.close();
	
	
	
	}
}