package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*https://www.yahoo.com/
-Click on  CreateNew Account Button
-Click on DataPolicy Linktext */

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.yahoo.com/");
Thread.sleep(2000);
driver.findElement(By.linkText("Mail")).click();
Thread.sleep(2000);

System.out.println("Success");

//Close the driver
driver.close();


	}

}
