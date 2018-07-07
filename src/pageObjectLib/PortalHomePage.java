package pageObjectLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PortalHomePage {
	
	@FindBy (xpath = ".//select [@name='selectedGameId']") WebElement portalDD  ;
	@FindBy (xpath = ".//button [text() = \"Next\"]") WebElement nextBtn ;
	
	public String portalGameSelect(String appID) {
		
		Select gameSelectDD = new Select(portalDD);
		gameSelectDD.selectByValue(appID);
		String gameName = gameSelectDD.getFirstSelectedOption().getText();
		nextBtn.click();
		return gameName ; 
		
	}
	
	
}
