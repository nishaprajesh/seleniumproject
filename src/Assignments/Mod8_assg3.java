package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mod8_assg3 {
	/* Test Scenario I:  File Upload
Step-1 Launch Chrome Browser
Step-2 Open Test URL https://smallpdf.com/word-to-pdf
Step-3 Click on ChooseFile Button
Step-4 Automate Window Alert by Uploading File  
Step-5 Specify implicit Wait to Complete file Conversion and Download button get's displayed 
Step-6 Click on Download Button
Step-5 Close Browser


 */
	public static void main(String[] args) throws InterruptedException, AWTException {
		//Step-1 Launch Chrome Browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Step-2 Open Test URL https://smallpdf.com/word-to-pdf
		driver.get("https://smallpdf.com/word-to-pdf");
		
		Thread.sleep(2000);
		//Step-3 Click on ChooseFile Button
		driver.findElement(By.xpath("//button[@type='button']//span[text()='Choose Files']")).click();
		Thread.sleep(2000);
		//copy to clipboard
		StringSelection s=new StringSelection("C:\\Automation\\Testupload.docx");
		 //send the data from clipboard to screen
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		//using Java robot
		Robot r=new Robot();
		//Step-4 Automate Window Alert by Uploading File   
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(12000);
		WebDriverWait w= new WebDriverWait(driver,100);
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Download']")));
		
		driver.findElement(By.xpath("//span[text()='Download']")).click();
		Thread.sleep(5000);

		//Step-5 Close Browser
		
		driver.close();
	}

}
