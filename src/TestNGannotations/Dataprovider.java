package TestNGannotations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Dataprovider {

	public WebDriver driver;
	String expURL, actualURL;
	
	@Test(dataProvider="testData")
	public void swaglogin(String uname,String pwd) throws InterruptedException
	{
		//Launch the chrome  browser
			System.setProperty("webdriver.chrome.driver","C:\\Automation\\Software\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("swaglogin Method");
		
			// GO to URL https://www.saucedemo.com//
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='login-button']")).click();
			Thread.sleep(3000);
			expURL = "https://www.saucedemo.com/inventory.html";
			actualURL = driver.getCurrentUrl();
			Assert.assertEquals(expURL,actualURL);
	
	}	
	@AfterMethod
	public void gettestresult(ITestResult testresult)
	{
		System.out.println("TCName:"+testresult.getName());
		System.out.println("TC Result"+testresult.getStatus());
		int status=testresult.getStatus();//REsult is 1 if passed
		if(status==1)
		{
			//Close the browser
			
		}
		else{
			//take screen shot and close browser
			File outfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(outfile, new File("C:\\Automation\\seleniumproject\\src\\TestNGannotations"+testresult.getParameters()[0]+"Defect.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.close();
			
		}
		
	}
	
@DataProvider(name="testData")
	public Object[][] readexcel() throws BiffException, IOException
	{
	
	File f=new File("C:\\Automation\\seleniumproject\\src\\TestNGannotations\\TestDataSel.xls");
	Workbook W= Workbook.getWorkbook(f);
	Sheet s=W.getSheet(0);
	int noofrows= s.getRows();
	System.out.println(s.getRows());
	int noofcol= s.getColumns();
	System.out.println(s.getColumns());
	
	//Create an array to store data of excel sheet
	String inputdata[][]=new String [noofrows-1][noofcol];
	int count=0;
	
	for(int i=1;i<=noofrows-1;i++)
	{
		for(int j=0;j<noofcol;j++)
		{
			Cell c=s.getCell(j,i);
			inputdata[count][j]=c.getContents();
		}
	
		count++;
	}
	return inputdata;
}
}

