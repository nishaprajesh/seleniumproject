package Assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class module1assignment1 {
	/* Assignment:-1
	https://www.moneycontrol.com/
	Click on Search textbox */ 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com");
		Thread.sleep(2000);
		driver.findElement(By.id("search_str")).click();
		//Close the driver
		driver.close();
		Select de =new Select(element);
				de.selectByIndex(index);
				de.selectByValue(arg0);
				de.selectByVisibleText(arg0);
				
				
				de.deselectAll();
				de.deselectByValue(arg0);
				de.deselectByVisibleText(arg0);
				
	
		
	}

}
