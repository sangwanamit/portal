package adConsent.RegressionTests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.Base;
import pageObjectLib.PortalUserHomePage;

public class PortalUserHomePageTests extends Base{

	@Test(priority= 5 )
	public void navigateToFAQPageTest() throws Throwable {
 		
		PortalUserHomePage pf = PageFactory.initElements(driver,PortalUserHomePage.class);
		pf.navigateToFAQ();
		
		
	}

	
}
