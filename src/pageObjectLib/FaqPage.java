package pageObjectLib;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import genericLib.Base;

public class FaqPage extends Base{
	
@FindBy (xpath = "//div [@class='faq']/h3") WebElement pageTitle  ; 

static String actLink1 = "What data does Canak Okey Plus collect?";
static String actLink2 = "How long will it take to get my data after I make a data copy request?";
static String actLink3 = "How do I delete my Canak Okey Plus account, including my game account data?";
static String actLink4 = "How long does it take to process a deletion request?";
static String actLink5 = "How will I know when my deletion or data copy request is complete?";
static String actLink6 = "Can I cancel a deletion request?";
static String actLink7 = "What if I want to download or delete data for other Zynga games?";
static String actLink8 = "How do I stop receiving Canak Okey Plus marketing email?";
static String actLink9 = "What if I have additional questions about data requests and account deletion?";





public static List<WebElement> link() {

List<WebElement> links =  driver.findElements(By.xpath(".//dt"));
	
	return links ;
}

public static List<WebElement> des() {

List<WebElement> des =  driver.findElements(By.xpath(".//dd/div"));
	
	return des ;
}


public static List  getlinkTextList() {
List linkText = new LinkedList<>();

linkText.add(actLink1);
linkText.add(actLink2);
linkText.add(actLink3);
linkText.add(actLink4);
linkText.add(actLink5);
linkText.add(actLink6);
linkText.add(actLink7);
linkText.add(actLink8);
linkText.add(actLink9);

return linkText;
}
public boolean linkTextTest(int ind) {
	
	WebElement element = link().get(ind);
	String resLink = element.getText();
	String actLink = (String) getlinkTextList().get(ind);
	if(resLink.equals(actLink)) {
		System.out.println("Verified Link "+ (ind+1) + ": " + resLink );
		return true ; 
	}
	System.out.println(actLink+": NOT EQUALS:" +resLink+"<<ends here!");
	return false ;
}

public boolean linkClickableAndVisibleTest(int index) {
	WebElement link = link().get(index);
	boolean enable =  link.isEnabled();
	boolean visible = link.isDisplayed();
	if(enable && visible) {
		return true ; 
	}else 
		System.out.println("Link enabled: " + enable );
		System.out.println("Link displayed: " + visible );
	
	return false;
		


}

public boolean linkOpen(int index) {
	
	while(des().get(index).isDisplayed()) {
		System.out.println("Link already open");
		return false ;
	}
	
	WebElement link = link().get(index);
	link.click();
	if(des().get(index).isDisplayed()) {
		return true ; 
	}
	System.out.println("Description status " + des().get(index).isDisplayed());
	return false;
	
}


public boolean linkClose(int index) throws InterruptedException {
	WebElement link = link().get(index);
	if(des().get(index).isDisplayed())
	{
	link.click();
	Thread.sleep(1000);
		if (des().get(index).isDisplayed()) {
			return false;
		}else return true ;
	}
	
	System.out.println("Skipped if block! link seems to be already closed!");
	return false ;

}
}
