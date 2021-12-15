package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*Assignment-3
 .	Automate Yahoo Registration Page  using Absolute X-path in Chrome Browser
 */

public class Mod4_assig3 {


	public static void main(String[] args) throws InterruptedException {
	//Launch the chrome  browser
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	// GO to URL https://www.google.com
	driver.get("https://login.yahoo.com/account/create");
	
	//Enter First name --Uses absolute xpath
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")).sendKeys("Nisha");
			
	//Enter second name-- Relative xpath syntax1 //tagname[@locator1='value of the locator']
	driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("Lastname");
					
	//Enter email id-- Relative xpath syntax3  //tagname[@locator1='value of the locator'  or @locator2='value of the locator']
	
	driver.findElement(By.xpath("//input[@name='yid' or id='usernamereg-yid']")).sendKeys("test1");
	//Enter password
	
	//Select drop down country code
	//Enter mobile number 
	//Select drop down Birth Month
	
	//Enter day 
	driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("1");
	//Enter year
	driver.findElement(By.xpath("(//input[@type='tel'])[3]")).sendKeys("2000");
	//Enter Gender
	driver.findElement(By.xpath("//*[@name='freeformGender']")).sendKeys("F");
		//Click on Continue 
	driver.switchTo().alert().accept();
	
	
	//Wait for 5 seconds
	Thread.sleep(5000);
	
	//Print the page title
	String pagetitle=driver.getTitle();
	System.out.println(pagetitle);
	
	}
}