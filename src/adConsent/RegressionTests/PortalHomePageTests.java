package adConsent.RegressionTests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.Base;
import genericLib.CommonLib;
import pageObjectLib.PortalHomePage;
import pageObjectLib.PortalSignInPage;

public class PortalHomePageTests extends Base {
	
	@Test
	public void launchPortal() {
		CommonLib.gotoportal();
		
	}
	
}
