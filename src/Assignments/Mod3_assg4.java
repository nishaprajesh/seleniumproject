package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Mod3_assg4 {

	public static void main(String[] args) throws InterruptedException {

/*1.	Write a Test Script to get no of links available on Yahoo Page 
     https://www.yahoo.com/	
 */
		
		//TC-2	Go to Test URL  https://login.yahoo.com/account/create
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Software\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yahoo.com");
		//Import import java.util.List; 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
	      System.out.println("The number of links is " + links.size());
	      driver.close();
		
		//Close the window 
		driver.close();
	}

}
