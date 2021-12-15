package Assignments;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Mod3_assg3 {

	public static void main(String[] args) throws InterruptedException {

/*TC-1	Launch Firefox Browser
TC-2	Go to Test URL   https://login.yahoo.com/account/create
TC-3	Maximize the Browser Window
TC-4	Get the Title of Page
TC-5	Click on Privacy Link  Text 
TC-6	Switch from 0th   Window to 1st   Window
TC-7	After Switching Get the Title of Page 
TC-8	Switch from 1sr   Window to 0th  Window
TC-9    After Switching Get the Title of Page 
TC-10	Close all windows of Browser 
 */
		
		//TC-2	Go to Test URL  https://login.yahoo.com/account/create
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Software\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/account/create");
		
		//TC-3	Maximize the Browser Window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//TC-4	Get the Title of Page
		String title =driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		//TC-5	Click on Privacy Link  
		driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
		
		
		ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs);
		Thread.sleep(3000);
		
		//Switch from 0th   Window to 1st   Window
		
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
		//TC-7	After Switching Get the Title of Page 
		String URLofpage= driver.getCurrentUrl();
		System.out.println(URLofpage);
		String title2 =driver.getTitle();
		System.out.println(title2);
		Thread.sleep(3000);
		
		
		//TC-8	Switch from 1st   Window to 0th  Window
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(3000);
		String URLofpage2= driver.getCurrentUrl();
		System.out.println(URLofpage2);
		//TC-9    After Switching Get the Title of Page 
		String title3 =driver.getTitle();
		System.out.println(title3);
		Thread.sleep(3000);
		
		//TC-10	Close all windows of Browser
		driver.quit();
	}

}
