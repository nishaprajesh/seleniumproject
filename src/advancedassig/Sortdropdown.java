package advancedassig;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sortdropdown {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.twoplugs.com/newsearchserviceneed");
	Thread.sleep(3000);
	
	WebElement drpele=driver.findElement(By.name("category_id"));
	//copy the list to a select
	Select drpsel =new Select(drpele);
	//add tht to a list 
	List<WebElement> options= drpsel.getOptions();
	// copy the list into 2 arraylists
	
	ArrayList originalist =new ArrayList();
	
	ArrayList templist =new ArrayList();
	for(WebElement option:options)
	{
		originalist.add(option.getText());
		templist.add(option.getText());
		
	}
	System.out.println("Original"+originalist);
	//sort the temp list 
	Collections.sort(templist);
	
	//compare with the original list
	if(originalist.equals(templist))
	{
		System.out.println("Sorted");
		
	}
	else 
	{
		System.out.println("NotSorted");
	}
	
	
	
}		
}
