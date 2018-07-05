package pageObjectLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import genericLib.Base;
import genericLib.CommonLib;
import genericLib.WebDriverCommons;

public class UtilsHomePage extends Base {
	
	@FindBy (xpath =".//input [@name='playerId']") public WebElement pidEditBox ;
    @FindBy (xpath = ".//button [(text()= \"Get PIN\")]") public WebElement getPinBtn ;
    @FindBy (xpath = ".//h3 [@class=\"alert-info  alert\"]") public WebElement pinArea ;
    @FindBy (xpath = ".//select [@name='appId']") public WebElement dropdownElement ; 
    
    public String getPIN() throws InterruptedException {
    	CommonLib.gotoUtilTool();
    	
    	int pid = CommonLib.PidGen();
    	Integer strConvert = new Integer(pid);
    	String strpid = strConvert.toString();
    	
    	pidEditBox.sendKeys(strpid);

    	WebDriverCommons.waitFor(dropdownElement);

     		JavascriptExecutor js = (JavascriptExecutor) driver ;
    		js.executeScript("driver.getElementByXpath('.//button [(text()= \\\"Get PIN\\').click();");
    		System.out.println("ScriptExecuted!");
        	
   
    		
    
    	WebDriverCommons.waitFor(pinArea);

    	String pin = pinArea.getText().toString();

    	System.out.println("Pin generated for ZID: " + pid + " is " + pin);
    	return pin;
    }
	
}
