package AdvancedTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestUI {
 

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Print @BeforeTest of UI ");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("Print  @AfterTest of UI ");
	  }

	  @Test(groups="UI")
	  public void homepage() {
		  System.out.println("homepage");
	  }
	  @Test(groups="UI")
	  public void shippingpage() {
		  System.out.println("shippingpage");
  }
}

