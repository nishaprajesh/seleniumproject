package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mod6_assig4 {
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

	//Step-4  Drag the Slider up to 50% and drop the Slider  
	WebElement e= driver.findElement(By.xpath("//div[@id='slider']"));
	Actions slider= new Actions(driver);
	slider.dragAndDropBy(e, 70, 0).build().perform();
	Thread.sleep(3000);
		
	
//Step-6 Close Browser
	driver.close();
	
	
	
	}
}