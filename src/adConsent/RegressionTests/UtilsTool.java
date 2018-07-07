package adConsent.RegressionTests;

import org.testng.annotations.Test;
import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.Base;
import genericLib.CommonLib;
import pageObjectLib.UtilsToolPage;

public class UtilsTool extends Base{

	static String AppID  ;
	static String PID ; 
	static String PIN ;
	static String gameName ;
	static String portalGameName ;
	

	@Test (priority = 1)
	public void getCredentials() throws InterruptedException {
		 
		UtilsToolPage utilsTool = PageFactory.initElements(driver,UtilsToolPage.class);
	 
		HashMap credentials = utilsTool.getCredentials(CommonLib.appID);
		
		this.PIN = credentials.get("gamePIN").toString() ;
		this.AppID = credentials.get("gameID").toString() ;
		this.PID = credentials.get("gamePID").toString() ;
		this.gameName = credentials.get("gameName").toString();
		
		System.out.println("Game: " + credentials.get("gameName"));
		System.out.println("Game ID: "+credentials.get("gameID"));	
		System.out.println("Player ID: " + credentials.get("gamePID"));
		System.out.println("PIN: "+ credentials.get("gamePIN"));
		
	}
}
