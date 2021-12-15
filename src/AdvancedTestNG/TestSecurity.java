package AdvancedTestNG;

import org.testng.annotations.Test;

public class TestSecurity {
  @Test(groups="Security")
  public void open() {
	  System.out.println("Testgroups=Security.open()");
  }
  @Test(groups="Security")
  public void close() {
	  System.out.println("Testgroups=Security.close()");
  }

}
