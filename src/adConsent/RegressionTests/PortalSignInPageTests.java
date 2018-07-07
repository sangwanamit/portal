package adConsent.RegressionTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.Base;
import pageObjectLib.PortalHomePage;
import pageObjectLib.PortalSignInPage;

public class PortalSignInPageTests extends Base {


	@Test(priority = 3)
	public void gameSelectTest() {
		PortalHomePage pf = PageFactory.initElements(driver,PortalHomePage.class);
		
		UtilsTool.portalGameName = pf.portalGameSelect(UtilsTool.AppID);
		
	}
	
	@Test(priority = 4 )
	public void portalSingInTest(){
		PortalSignInPage pf = PageFactory.initElements(driver, PortalSignInPage.class);
		pf.portalSignIn(UtilsTool.PID,UtilsTool.PIN);
		
	}
	
}
