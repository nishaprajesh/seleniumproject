package AdvancedTestNG;

import org.testng.annotations.Test;

public class TestDatabase {
  @Test(groups="DB")
  public void testinsert() {
	  System.out.println("testinsert.close()");
  }
  @Test(groups="DB")
  public void testdel() {
	  System.out.println("testinsert.testdel(");
  }
  @Test(groups="DB")
  public void testupdate() {
	  System.out.println("testinsert.testupdate");
  }
 
}
