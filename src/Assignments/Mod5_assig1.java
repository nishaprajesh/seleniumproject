package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mod5_assig1 {
	//Module 5 Assignment-1
//	1.	Automate Yahoo Registration Page  using Relative X-path  in Chrome



	public static void main(String[] args) throws InterruptedException {
	//Launch the chrome  browser
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	// GO to URL https://www.google.com
	driver.get("https://login.yahoo.com/account/create");
	
	//Enter First name --Uses absolute xpath
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")).sendKeys("Nisha");
	Thread.sleep(1000);
			
	//Enter second name-- Relative xpath syntax1 //tagname[@locator1='value of the locator']
	driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("Lastname");
	Thread.sleep(1000);
					
	//Enter email id-- Relative xpath syntax3  //tagname[@locator1='value of the locator'  or @locator2='value of the locator']
	
	driver.findElement(By.xpath("//input[@name='yid' or id='usernamereg-yid']")).sendKeys("test51646");
	Thread.sleep(1000);
	//Enter password
	driver.findElement(By.xpath("//div[@id='account-attributes-challenge']//following::input[@type='password']")).sendKeys("Password545");
	Thread.sleep(1000);	
	//Enter mobile number
	driver.findElement(By.xpath("//form[@id='regform']//descendant::input[@id='usernamereg-phone']")).sendKeys("654654546545");
	Thread.sleep(1000);
	//Select drop down Birth Month
	Select Birth=new Select(driver.findElement(By.xpath("//button[@id='reg-submit-button']//parent::div//preceding::div//child::select[@name='mm']")));
	Birth.selectByIndex(1); 
	Thread.sleep(2000);
	//Enter day 
	driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("1");
	Thread.sleep(1000);
	//Enter year
	driver.findElement(By.xpath("(//input[@type='tel'])[3]")).sendKeys("2000");
	Thread.sleep(1000);
	//Enter Gender
	driver.findElement(By.xpath("//*[@name='freeformGender']")).sendKeys("F");
	Thread.sleep(1000);
		//Click on Continue button
	
	driver.findElement(By.xpath("//button[@id='reg-submit-button']")).click();
	Thread.sleep(4000);
	
	//Print the page title
	String pagetitle=driver.getTitle();
	System.out.println(pagetitle);
	//Close drive
	driver.close();
	
	
	
	}
}