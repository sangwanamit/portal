package adConsent.RegressionTests;
import genericLib.Base;
import genericLib.CommonLib;

public class Test extends Base {
 @org.testng.annotations.Test
 public void testTest() {
	 CommonLib.gotoportal() ;
	 System.out.println("Test Executed!");
	 System.out.println(driver.getTitle());
 }

	
}
