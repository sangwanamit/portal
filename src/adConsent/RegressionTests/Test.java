package adConsent.RegressionTests;
import org.openqa.selenium.support.PageFactory;

import genericLib.Base;
import genericLib.CommonLib;
import pageObjectLib.UtilsHomePage;

public class Test extends Base {
 @org.testng.annotations.Test
 public void testTest() throws InterruptedException {
	 
	UtilsHomePage pf = PageFactory.initElements(driver,UtilsHomePage.class);
	pf.getPIN();

	 System.out.println(driver.getTitle());
 }

	
}
