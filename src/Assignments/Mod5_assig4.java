package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod5_assig4 {
	/*Module 5 Assignment-4
	Step-1 Launch Chrome Browser
	Step-2 Open Test URL https://www.jquery-az.com/javascript/demo.php?ex=151.1_1  in Chrome Browser
	Step-3 Click on  Click here to show confirm alert Button 
	Step-4 Get the text displayed on Alert into Console
	Step-5 Accept  the Web Alert to Delete Account  
	Step-6 Get the text displayed on Alert into Console 
	Step-6 Accept the Alert 
	Step-6 Close Browser
*/
	

	public static void main(String[] args) throws InterruptedException {
		//Step-1 Launch Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	
	//Step-2 Open Test URL https://www.jquery-az.com/javascript/demo.php?ex=151.1_1  in Chrome Browser
	driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
	
	//Step-3 Click on  'Click here' to show confirm alert Button 
	driver.findElement(By.xpath("//td[@class='indtd']//child::button")).click();
	Thread.sleep(2000);
	//Step-4 Get the text displayed on Alert into Console
	String targetalerttxt="Are you sure you want to close this account permanently";
		String alerttxt=driver.switchTo().alert().getText();
		if(alerttxt.equals(targetalerttxt))
		{
			System.out.print("Moved to target alert");
		}
		else
		{
			System.out.print("Wrong alert");
		}
		
		
	
	//Step-5 Accept  the Web Alert to Delete Account  
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
	//Step-6 Get the text displayed on Alert into Console 
		String Secondalert=driver.switchTo().alert().getText();
		 Thread.sleep(2000);
	//Step-6 Accept the second Alert 
		 
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.print("Second alert accepted" + Secondalert);
	
	//Close drive
	driver.close();
	
	
	
	}
}