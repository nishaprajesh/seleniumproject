package Assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Module_assig4 {
	/* Testcase
	 * Launch chrome browser
	 * Go to www.google.com
	 * specify wait time for 5 sec
	 * Maximize the window
	 * Close window
	 */

	public static void main(String[] args) throws InterruptedException {
	//Launch the edge  browser
		System.setProperty("webdriver.edge.driver","C:\\Automation\\Software\\Drivers\\edgedriver.exe");
	
	
	WebDriver driver=new EdgeDriver();
	
	// Go to URL https://www.google.com
	driver.get("https://www.google.com/");
	
	//Wait for 5 seconds
	Thread.sleep(5000);
	
	//Print the page title
	String pagetitle=driver.getTitle();
	System.out.println(pagetitle);
	
	Thread.sleep(2000);
	
	//Get the URL and print
	String pageURL=driver.getCurrentUrl();
	System.out.println(pageURL);
	
	// Maximize the window 
	driver.manage().window().maximize();
	Thread.sleep(4000);
	//Close the window
	driver.close();
	System.out.println("Test completed");
	
	
	
	}
	
}
