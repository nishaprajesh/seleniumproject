package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod4Assig5 {
	/*
	 * TC-1 Launch Chrome Browser 
	 * TC-2 Go to Oracle Registration Page 
	 * TC-3 Fill FirstName TextBox with Input
	 * TC-4 Clear the input from  FirstName TextBox
	 * TC-5 Again Fill the  FirstName TextBox with Input
	 * TC-6 Get the Input from TextBox  and display it in Console 
	 * TC-6 Close Browser 
		 */


	public static void main(String[] args) throws InterruptedException {
	//TC-1 Launch Chrome Browser

	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Software\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//TC-2 Go to Oracle Registration Page 
	driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
	Thread.sleep(2000);
	 //TC-3 Fill FirstName TextBox with Input
	
	WebElement E= driver.findElement(By.id("firstName::content"));
	E.sendKeys("Nisha");
	Thread.sleep(2000);
	
	//TC-4 Clear the input from  FirstName TextBox
	E.clear();
	Thread.sleep(2000);
	 // TC-5 Again Fill the  FirstName TextBox with Input
	E.sendKeys("Second Time");
	Thread.sleep(2000);
	 //TC-6 Get the Input from TextBox  and display it in Console 
	String txt = E.getAttribute("value");
	System.out.println(txt);
	  
   
    //TC-6 Close Browser
    driver.close();
    
    
	

	}

}
