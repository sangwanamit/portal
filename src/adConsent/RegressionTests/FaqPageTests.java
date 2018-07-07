package adConsent.RegressionTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Base;
import pageObjectLib.FaqPage;

public class FaqPageTests extends Base{

	@Test
	public void verifyFaqPageTitle() {
	FaqPage pf = PageFactory.initElements(driver,FaqPage.class);
	AssertJUnit.assertEquals("FAQ1",pf.PageTitle());

	}
	
}
