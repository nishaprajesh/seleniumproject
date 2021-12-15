package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Mod5_assig6 {
	/* Step-1 Launch ChromeBrowser
	Step-2 Open Test URL http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm  in Chrome Browser
	Step-3 Switch into 0th  Frame 
	Step-3 Get plain text into Console You've found my HTML tutorial site, which is my final year computing project.
	Step-4 Switch into 1st  Frame
	Step-5 Clear text from Browser and versions: Text box 
	Step-6 Send text into Browser and versions: Text box 
	Step-7 Get given input into Console from Browser and versions: Text Box 
    Step-8 Switch into 2nd  Frame
    Step-9 Get plain text into Console A Tag in HTML denotes certain.............
    Step-10 Close Browser  
*/
	public static void main(String[] args) throws InterruptedException {
	//Step-1 Launch ChromeBrowser
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//Step-2 Open Test URL http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm  in Chrome Browser
	driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
	Thread.sleep(2000);

	//Step-3 Switch into 0th  Frame
	driver.switchTo().frame(0);
	//Step-3 Get plain text into Console You've found my HTML tutorial site, which is my final year computing project.
	String text1=driver.findElement(By.xpath("//p[contains(text(),'found my HTML tutorial site')]")).getText();
	System.out.println(text1);
	//Step-4 Switch into 1st  Frame
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
		//Step-5 Clear text from Browser and versions: Text box
	WebElement name= driver.findElement(By.xpath("//input[@name='name']"));
	name.clear();
	WebElement brow= driver.findElement(By.xpath("//textarea[@name='browser']"));
	brow.clear();
	//Step-6 Send text into Browser and versions: Text box 
	name.sendKeys("Myname");
	brow.sendKeys("MyBrowser & MyVersion");
    
	//Step-7 Get given input into Console from Browser and versions: Text Box 
	String txtname=name.getAttribute("value");
	String txtbrow=brow.getAttribute("value");
	System.out.println("Name: "+ txtname + "Browser and Verion: " + txtbrow);
	// Step-8 Switch into 2nd  Frame
	driver.switchTo().defaultContent();
	driver.switchTo().frame(2);
	
	// Step-9 Get plain text into Console A Tag in HTML denotes certain.............
	String text2= driver.findElement(By.xpath("//p//font[contains(text(),'A Tag in HTML')]")).getText();
	System.out.println("Intro: "+ text2);
	//Close drive
	driver.close();
	
	
	
	}
}