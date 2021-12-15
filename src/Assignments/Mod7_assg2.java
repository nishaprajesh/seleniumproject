package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mod7_assg2 {
	/* Test Scenario I:---File Download  
Step-1 Launch Firefox Browser
Step-2 Open Test URL https://www.selenium.dev/downloads/
Step-3 In Selenium Client & WebDriver Language Bindings, Click on linkText to download  Selenium with Java Language binding  
Step-4 Automate File Download    
Step-5 Close Browser
 */


	public static void main(String[] args) throws InterruptedException, AWTException {
		//Step-1 Launch FF Browser
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Software\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
				
		//Step-2 Open Test URL https://www.selenium.dev/downloads/
	    driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		//Step-3 In Selenium Client & WebDriver Language Bindings, 
		//Click on linkText to download  Selenium with Java Language binding
		
		driver.findElement(By.xpath("(//a[text()='Download'])[2]")).click();
		Thread.sleep(2000);
				
		
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(2000);
				
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				//4. Specify Wait  
				Thread.sleep(12000);
				//5. Close Site
				
				driver.close();
			
	}

}
