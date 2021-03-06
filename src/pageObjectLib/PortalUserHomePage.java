package pageObjectLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.ExpectedExceptions;

import genericLib.Base;

public class PortalUserHomePage extends Base {

	@FindBy (xpath= ".//a[text()=\"More Options - Visit Our FAQ\"]") WebElement moreOptionsFAQBtn ;
	
	public void navigateToFAQ() throws Throwable {
		
 		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(moreOptionsFAQBtn));

		Actions act = new Actions(driver);
		
		int flag = 0 ; 
		while(flag<1) {
		act.doubleClick(moreOptionsFAQBtn).perform();
		System.out.println("Attemped to click on Faq Button.Checkpoint Archieved!");
		Thread.sleep(2000);

		String currURL = driver.getCurrentUrl();
	
		if (currURL.contains("faq")){
			flag++ ;
		}
 		}
	
	}
	
}
