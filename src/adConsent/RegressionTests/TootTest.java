package adConsent.RegressionTests;
import org.testng.annotations.Test;
import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.Base;
import genericLib.CommonLib;
import pageObjectLib.UtilsHomePage;

public class TootTest extends Base {
	
	static String AppID  ;
	static String PID ; 
	static String PIN ;
	
@Test
public void getCredentials() throws InterruptedException {
	 
	UtilsHomePage utilsTool = PageFactory.initElements(driver,UtilsHomePage.class);
 
	HashMap credentials = utilsTool.getCredentials(CommonLib.appID);
	
	this.PIN = credentials.get("gamePIN").toString() ;
	this.AppID = credentials.get("gameID").toString() ;
	this.PID = credentials.get("gamePID").toString() ;
	
	System.out.println("Game: " + credentials.get("gameName"));
	System.out.println("Game ID: "+credentials.get("gameID"));	
	System.out.println("Player ID: " + credentials.get("gamePID"));
	System.out.println("PIN: "+ credentials.get("gamePIN"));
	
	
 }

@Test
public void launchPortal() {
	CommonLib.gotoportal();
	
	
}



}