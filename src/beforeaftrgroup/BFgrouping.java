package beforeaftrgroup;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BFgrouping {
//for security  
@BeforeGroups("Security")
  public void setupSecurity() {
	  System.out.println("setupSecurity");
  }
  @AfterGroups("Security")
  public void tearDownSecurity() {
	  System.out.println("tearDownSecurity");
  
  }
  
//for db  
@BeforeGroups("DB")
  public void setupDB() {
	  System.out.println("setupDB");
  }
  @AfterGroups("DB")
  public void teardownDB() {
	  System.out.println("tearDownDB");
  
  }
  //for 
  @BeforeGroups("UI")
  public void setupUI() {
	  System.out.println("setupUI");
  }
  @AfterGroups("UI")
  public void tearDownUI() {
	  System.out.println("tearDownUI");
  
  }
  
  //Real test cases @test
  //Security
  @Test(groups="Security")
  public void open() {
	  System.out.println("Testgroups=Securityopen()");
  }
  @Test(groups="Security")
  public void close() {
	  System.out.println("Testgroups=Security.close()");
  }
  
  //DB
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
  
  //UI
  @Test(groups="UI")
  public void homepage() {
	  System.out.println("homepage");
  }
  @Test(groups="UI")
  public void shippingpage() {
	  System.out.println("shippingpage");
 
  }
}
