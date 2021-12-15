package AdvancedTestNG;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Advtestng {
 
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Common@BeforeTest ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Common@AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Common@BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Common@AfterSuite");
  }

}
