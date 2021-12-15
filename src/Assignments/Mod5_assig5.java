package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mod5_assig5 {
	/*Module 5 Assignment-6
    Step-1 Launch Firefox Browser
	Step-2 Open Test URL https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt  in Chrome Browser
	Step-3 Switch into Frame 
	Step-3 Click on  Try it  Button 
	Step-4 Send the text into Alert 
	Step-5 Accept  the Web Alert 
	Step-6 Get the text displayed on page into Console 
	Step-7 Close Browser	
*/
	public static void main(String[] args) throws InterruptedException {
		//Step-1 Launch FF Browser
	System.setProperty("webdriver.firefox.driver","C:\\Automation\\Software\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();

	
	//Step-2 Open Test URL https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt  in FF Browser
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	Thread.sleep(2000);
	//Step-3 Switch into Frame 
	driver.switchTo().frame(0);
	
	//Step-3 Click on  Try it  Button
	driver.findElement(By.xpath("//button[contains(text(),'Try')]")).click();
	Thread.sleep(1000);
	//Step-4 Send the text into Alert
	driver.switchTo().alert().sendKeys("Nisha");

	Thread.sleep(1000);
	//Step-5 Accept  the Web Alert 
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	//Step-6 Get the text displayed on page into Console 
	String Resulttxt=driver.findElement(By.xpath("//p[contains(text(),'Hello')]")).getText();
	System.out.println(Resulttxt);
		
	//Close drive
	driver.close();
	
	
	
	}
}