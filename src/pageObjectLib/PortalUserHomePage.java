package pageObjectLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.ExpectedExceptions;

import genericLib.Base;

public class PortalUserHomePage extends Base {

	@FindBy (xpath= ".//a[text()=\"More Options - Visit Our FAQ\"]") WebElement moreOptionsFAQBtn ;
	
	public void navigateToFAQ() throws Throwable {
		
 		WebDriverWait wait = new WebDriverWait(Base.driver, 15);
		wait.until(ExpectedConditions.visibilityOf(moreOptionsFAQBtn));
		

		moreOptionsFAQBtn.submit();
		
	}
	
}
