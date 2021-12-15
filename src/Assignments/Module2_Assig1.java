package Assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Write a Test Script to open  Test URL  in  Chrome Browser 
Write a Test Script to open  Test URL  in  Firefox Browser 
Write a Test Script to open  Test URL  in  Edge  Browser  */

public class Module2_Assig1 {
	
	public static void main(String[] args) throws InterruptedException {
	//Launch the chrome  browser and close it
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	// GO to URL https://www.google.com
	driver.get("https://www.google.com/");
	
	//Close the drive
	driver.close();
	System.out.println("Chrome browser closed");
	
	//Launch the FF  browser and close it
	System.setProperty("webdriver.gecko.driver","C:\\Automation\\Software\\Drivers\\geckodriver.exe");
	WebDriver FFdriver=new FirefoxDriver();
		
		// GO to URL https://www.google.com
		FFdriver.get("https://www.google.com/");
		
		//Close the drive
		FFdriver.close();
		System.out.println("Firefox browser closed");
		
		//Launch the Edge  browser and close it
		System.setProperty("webdriver.edge.driver","C:\\Automation\\Software\\Drivers\\edgedriver.exe");
		WebDriver Edgdriver=new EdgeDriver();
			
			// GO to URL https://www.google.com
			Edgdriver.get("https://www.google.com/");
			
			//Close the drive
			Edgdriver.close();
			System.out.println("Firefox browser closed");
	
	
	}
	
}
