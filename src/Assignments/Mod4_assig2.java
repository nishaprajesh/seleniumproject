package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*1.	Automate  Oracle  Registration Page in Chrome Browser   
    https://profile.oracle.com/myprofile/account/create-account.jspx
2.	Automate  dropdowns part of Oracle  Registration Page in Firefox Browser  
    https://profile.oracle.com/myprofile/account/create-account.jspx */

public class Mod4_assig2 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
Thread.sleep(2000);

//Enter the email id 
driver.findElement(By.name("email")).sendKeys("nisha4test@gmail.com");
Thread.sleep(2000);

//Enter the password //How to encrypt
driver.findElement(By.name("password")).sendKeys("Test@123");
Thread.sleep(2000);

//Enter the retype password
driver.findElement(By.id("retypePassword::content")).sendKeys("Test@123");
Thread.sleep(4000);

//Select country from the drop down
Select country= new Select(driver.findElement(By.id("country::content")));
country.selectByIndex(1);
//country.selectByValue("Bhutan");
Thread.sleep(3000);

//Enter First name 
driver.findElement(By.id("firstName::content")).sendKeys("Nisha");
Thread.sleep(2000);

//Enter last name
driver.findElement(By.id("lastName::content")).sendKeys("P");
Thread.sleep(2000);

//Enter Job title
driver.findElement(By.id("jobTitle::content")).sendKeys("QA");
Thread.sleep(2000);

//Enter Work Phone
driver.findElement(By.id("workPhone::content")).sendKeys("87687678687");
Thread.sleep(2000);

//Enter the company
driver.findElement(By.id("companyName::content")).sendKeys("Testcompany");
Thread.sleep(2000);

//Enter address

driver.findElement(By.id("address1::content")).sendKeys("123 Street");
Thread.sleep(2000);

//Enter city
driver.findElement(By.id("city::content")).sendKeys("Franklin");
Thread.sleep(4000);
//Select state
Select state=new Select(driver.findElement(By.id("state::content")));
//state.selectByVisibleText("Arkansas");
state.selectByIndex(1);
Thread.sleep(4000);

//Enter Postal code
driver.findElement(By.id("postalCode::content")).sendKeys("37064");
Thread.sleep(3000);
//Click on the Button
driver.findElement(By.linkText("Create Account"));
Thread.sleep(4000);

System.out.println("Success");

//Close the driver
driver.close();


	}

}
