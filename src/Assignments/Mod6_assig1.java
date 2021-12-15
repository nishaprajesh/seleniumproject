package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mod6_assig1 {
	/* Step-1 Launch Chrome Browser
Step-2 Open Test URL https://www.flipkart.com/ 
Step-3 If found any screen hiding actual page Close the Screen
Step-4  Move mouse Pointer  towards Women
Step-5  Click on Shoes
Step-6 Close Browser
  
*/
	public static void main(String[] args) throws InterruptedException {
	//Step-1 Launch ChromeBrowser
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//Step-2 Open Test URL https://www.flipkart.com/ 
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);

	//Step-3 If found any screen hiding actual page Close the Screen
	WebElement xbutton= driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::*[15]"));
    if (xbutton.isDisplayed()==true) 
    {
     xbutton.click();
    }
   
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[text()='Fashion']")).click();
	Thread.sleep(1000);
	//Step-4  Move mouse Pointer  towards Women
	WebElement e=driver.findElement(By.xpath("(//div[@id='container']//following::span)[6]"));
	Actions a =new Actions(driver);
	a.moveToElement(e).build().perform();
	Thread.sleep(1000);
	//Step-5  Click on Shoes
	WebElement Shoes=driver.findElement(By.xpath("//div[@id='container']//following::a[@title='Shoes']"));
	Actions b=new Actions(driver);
	b.click(Shoes).build().perform();
	Thread.sleep(1000);
	//Close drive
	driver.close();
	
	
	
	}
}