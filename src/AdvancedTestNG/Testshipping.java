package AdvancedTestNG;

import org.testng.annotations.Test;

public class Testshipping {
 
	  @Test(groups="shipping")
	  public void pick() {
		  System.out.println("Testgroups=shipping.pick()");
	  }
	  @Test(groups="shipping")
	  public void stage() {
		  System.out.println("Testgroups=shipping.stage()");
  }
}

