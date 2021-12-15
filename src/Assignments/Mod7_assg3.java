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

public class Mod7_assg3 {
	/*  Assignment-3
Test Scenario I:
Test Scenario IV:---File Download
1. Launch https://launchpad.net/sikuli  in Firefox Browser
2. Click  on sikulixsetup-1.1.2.jar  to Download
3. Go to Window Alert and Select  Save 
4. Specify Wait  
5. Close Site

 */


	public static void main(String[] args) throws InterruptedException, AWTException {
		//Step-1 Launch FF Browser
		
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Software\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//Launch https://launchpad.net/sikuli  in Firefox Browser
		driver.get(" https://launchpad.net/sikuli");
		Thread.sleep(2000);
		//Click  on sikulixsetup-1.1.2.jar  to Download
		driver.findElement(By.xpath("//a[text()='sikulixide-2.0.5.jar']")).click();
		Thread.sleep(5000);

		//3. Go to Window Alert and Select  Save
		Robot r=new Robot();
		//driver.switchTo().alert();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//4. Specify Wait  
		Thread.sleep(12000);
		//5. Close Site
		
		
		driver.close();
	}

}
