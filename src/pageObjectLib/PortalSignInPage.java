package pageObjectLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PortalSignInPage {

	@FindBy (xpath = ".//input[@name='playerId']") WebElement pidEditBox ; 
	@FindBy (xpath = ".//input [@name ='pin']") WebElement pinEditBox ; 
	@FindBy (xpath = ".//button [@type = 'submit']") WebElement submitBtn ; 
	
	public void portalSignIn(String pid , String pin) {
		pidEditBox.sendKeys(pid);
		pinEditBox.sendKeys(pin);
		submitBtn.click();
		
	}
	
	
}
