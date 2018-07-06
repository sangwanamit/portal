package genericLib;

import java.util.Random;

public class CommonLib extends Base{
	
	private static String portaURL  = "https://staging.privacy.zynga.com/portal/#/";
	private static String CompToolURL = "https://staging.admin.privacy.zynga.com/util/";
	
	public static void gotoportal() {
		driver.get(portaURL);
		driver.manage().window().maximize();
	}
	public static void gotoUtilTool() {
		driver.get(CompToolURL);
		driver.manage().window().maximize();
	}
	
	public static String appID = "5003092";

		
	}
	
	

