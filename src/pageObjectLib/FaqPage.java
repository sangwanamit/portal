package pageObjectLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FaqPage {
@FindBy (xpath = ".//h3[text()='FAQ']") WebElement pageTitle  ; 

public String PageTitle() {
	
	String actTitle = pageTitle.getText();
	return actTitle ; 

}



}
