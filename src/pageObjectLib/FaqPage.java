package pageObjectLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import genericLib.Base;

public class FaqPage extends Base{
@FindBy (xpath = "//h3[text()='FAQ']") WebElement pageTitle  ; 
@FindBy (xpath = "//dt[contains(text(),'What data does')]") WebElement link1 ;
@FindBy (xpath = "//dt[contains(text(),'How long will')]") WebElement link2 ;
@FindBy (xpath = "//dt[contains(text(),'How do I delete')]") WebElement link3 ;
@FindBy (xpath = "//dt[contains(text(),'How will I know')]") WebElement link4 ;
@FindBy (xpath = "//dt[contains(text(),'Can I cancel')]") WebElement link5 ;
@FindBy (xpath = "//dt[contains(text(),'What if I want')]") WebElement link6 ;
@FindBy (xpath = "//dt[contains(text(),'How do I stop')]") WebElement link7 ;
@FindBy (xpath = "//dt[contains(text(),'What if I have')]") WebElement link8 ;

public void link1Open() {
	action.click(link1);
	
}

public void link2Open() {
	action.click(link2);
	
}

public void link3Open() {
	action.click(link3);
	
}
public void link4Open() {
	action.click(link4);
	
}
public void link5Open() {
	action.click(link5);
	
}

public void link6Open() {
	action.click(link6);
}

public void link7Open() {
	action.click(link7);
	
}
public void link8Open() {
	action.click(link8);
	
}



public String PageTitle() {
	
	String actTitle = pageTitle.getText();
	return actTitle ; 

}

public String link1() {
	
	String text = link1.getText();
	return text ; 

}
public String link2() {
	
	String text = link2.getText();
	return text ; 

}
public String link3() {
	
	String text = link3.getText();
	return text ; 

}
public String link4() {
	
	String text = link4.getText();
	return text ; 

}
public String link5() {
	
	String text = link5.getText();
	return text ; 

}
public String link6() {
	
	String text = link6.getText();
	return text ; 

}
public String link7() {
	
	String text = link7.getText();
	return text ; 

}
public String link8() {
	
	String text = link8.getText();
	return text ; 

}


}
