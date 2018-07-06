package pageObjectLib;

 import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
 import java.util.Random;
 

 
import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.FindBy;
 import org.openqa.selenium.support.ui.Select;
  

import genericLib.Base;
import genericLib.CommonLib;
import genericLib.WebDriverCommons;

public class UtilsHomePage extends Base {
	public static String gameName ; 
	public static String gameID ;
	public static String gamePID ;
	public static String gamePIN ;
 
	
	static Select gameSelectDD ;
	
	@FindBy (xpath =".//input [@name='playerId']") public WebElement pidEditBox ;
    @FindBy (xpath = ".//button [(text()= \"Get PIN\")]") public WebElement getPinBtn ;
    @FindBy (xpath = ".//h3 [@class=\"alert-info  alert\"]") public WebElement pinArea ;
    @FindBy (xpath = ".//select [@name='appId']") public static WebElement dropdownElement ; 
    
    public static String gameDDSelect(String gameID) {
    	
    	gameSelectDD = new Select(dropdownElement);
    	List<WebElement> ls = gameSelectDD.getOptions();
     	Iterator<WebElement> itr = ls.listIterator();
    	
    	while(itr.hasNext()) {
    		String game = itr.next().getText();
     		if(game.contains(gameID)) {
     			return game ;
    		}
    	}
    	System.out.println("Game not available in the list!");
    	return null ; 	
    }

    public static void gameDDOptions() {

    	gameSelectDD = new Select(dropdownElement);
    	List<WebElement> ls = gameSelectDD.getOptions();
     	Iterator<WebElement> itr = ls.listIterator();
    	
    	while(itr.hasNext()) {
    	System.out.println(itr.next().getText());
    	}
    }
    
    public static void gameDDOptionCount() {
     	gameSelectDD = new Select(dropdownElement);
    	List<WebElement> ls = gameSelectDD.getOptions();
    	System.out.println("Total Number of games available: " + ls.size());
    }
    public static int PidGenerator() {				//Pid Generator
	Random random = new Random();
		while(true) {
			
		int pid = random.nextInt();
		
		if(pid > 1000000 && pid <999999999 )	
			return pid ;}
		}
		
    
    public HashMap getCredentials(String gameID) throws InterruptedException {			// Credentials Generator
    	
    	CommonLib.gotoUtilTool();
   	
    	Integer pid = new Integer(PidGenerator());
    	String gamePID = pid.toString();
    	pidEditBox.sendKeys(gamePID);
    	
    	WebDriverCommons.waitFor(dropdownElement);
    	
    	gameSelectDD = new Select(dropdownElement);
    	String gameName  = gameDDSelect(gameID);
    	gameSelectDD.selectByVisibleText(gameName);
    	
    	
    	getPinBtn.click();
     	 
    	WebDriverCommons.waitFor(pinArea);
    	String gamePIN = pinArea.getText().toString();

    	HashMap<String,String> credentials = new HashMap();
    	credentials.put("gameName",gameName);
    	credentials.put("gameID",gameID);
    	credentials.put("gamePID",gamePID);
    	credentials.put("gamePIN",gamePIN);
    	 
    	return credentials ; 
    	
         }
    
    
	}
