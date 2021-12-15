package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mod5_assig3 {
	//Module 5 Assignment-3
//	1.	Automate Yahoo Login Page  using Relative X-path  in Edge



	public static void main(String[] args) throws InterruptedException {
	//Launch the Edge  browser
	System.setProperty("webdriver.edge.driver","C:\\Automation\\Software\\Drivers\\edgedriver.exe");
	
	WebDriver driver=new EdgeDriver();
	
	// GO to URL https://login.yahoo.com/
	driver.get("https://login.yahoo.com/");
	
	//Enter Username
	driver.findElement(By.xpath("//ul[@class='auto-fill-overlay hide']//ancestor::div//following::input[@name='username']")).sendKeys("withlovenisha@yahoo.com");
	Thread.sleep(1000);
			
	//click on Next button
	driver.findElement(By.xpath("//div[@id='username-country-code-field']//following-sibling::div//child::input[@id='login-signin']")).click();
	
	Thread.sleep(2000);
	
	//Close drive
	driver.close();
	
	
	
	}
}