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

public class Mod7_assg4 {
	/* Test Scenario I:---File Download  
Step-1 Launch Firefox Browser
Step-2 Open Test URL https://www.selenium.dev/downloads/
Step-3 In table Selenium Client & WebDriver Language Bindings, automate the plain text   
Step-4 Get the plain text Java , Python  into Console   
Step-5 Close Browser

 */


	public static void main(String[] args) throws InterruptedException, AWTException {
		//Step-1 Launch FF Browser
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Software\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
				
		//Step-2 Open Test URL https://www.selenium.dev/downloads/
	    driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		//Step-3 In table Selenium Client & WebDriver Language Bindings, automate the plain text
		//Step-4 Get the plain text Java , Python  into Console 
		String text1 = driver.findElement(By.xpath("//table[@class='data-list']//td[text()='Python']")).getText();
		System.out.println(text1);
		Thread.sleep(2000);
		
		String text2 = driver.findElement(By.xpath("//table[@class='data-list']//td[text()='Java']")).getText();
		System.out.println(text2);
				//5. Close Site
				
				driver.close();
			
	}

}
