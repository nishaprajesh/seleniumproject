package Assignments;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Mod3_assg5 {

	public static void main(String[] args) throws InterruptedException {

/*TC-1	Launch Chrome  Browser
TC-2	Go to Test URL  https://www.google.com
TC-3	Maximize the Browser Window
TC-4	Get the URL of Page
TC-5	Navigate to Test URL  https://www.selenium.dev/
TC-6	Get the URL of Page
TC-7	Navigate back to Test URL  https://www.google.com
TC-8    Get the URL of Page 
TC-8	Navigate one step forward to Test URL  https://www.selenium.dev/ 
TC-9    Get the URL of Page 
TC-10	Refresh the Current Page 
TC-11	Get the URL of Page 
TC-12   Close the Browser  */
		
		//TC-1	Launch Chrome  Browser
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//TC-2	Go to Test URL  https://www.google.com
		driver.get("https://www.google.com");
		
		//TC-3	Maximize the Browser Window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//TC-4	Get the URL of Page
		String URLofpage1= driver.getCurrentUrl();
		System.out.println(URLofpage1);
		Thread.sleep(3000);
		//TC-5	Navigate to Test URL  https://www.selenium.dev/
		driver.get("https://www.selenium.dev/");
		//TC-6	Get the URL of Page
		String URLofpage2= driver.getCurrentUrl();
		System.out.println(URLofpage2);
		Thread.sleep(3000);
		//TC-7	Navigate back to Test URL  https://www.google.com
		driver.navigate().back();
		//TC-8    Get the URL of Page 
		String URLofpage3= driver.getCurrentUrl();
		System.out.println(URLofpage3);
		//TC-8	Navigate one step forward to Test URL  https://www.selenium.dev/
		driver.navigate().forward();
		//TC-9    Get the URL of Page 
		String URLofpage4= driver.getCurrentUrl();
		System.out.println(URLofpage4);
		//TC-10	Refresh the Current Page 
		driver.navigate().refresh();
		//TC-11	Get the URL of Page 
		String URLofpage5= driver.getCurrentUrl();
		System.out.println(URLofpage5);
		//TC-12   Close the Browser  
		driver.close();
	}

}
