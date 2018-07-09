package genericLib;

import java.util.Random;

public class CommonLib extends Base{
	
	private static String portaURL  = "https://staging.privacy.zynga.com/portal/#/";
	private static String CompToolURL = "https://staging.admin.privacy.zynga.com/util/";
	
	private static String ExcelworkbookName = "testData.xlsx";
	private static String ExcelSheetName = "CredentialsGenerated";
	//Getter Methods
	public static String getWorkbookName() {
		String workbook = ExcelworkbookName ;
		return workbook ; 
	}
	public static String getSheetName() {
		String sheet = ExcelSheetName ;
		return sheet ; 
	}
	
	public static void gotoportal() {
		driver.navigate().to(portaURL);
		driver.manage().window().maximize();
	}
	public static void gotoUtilTool() {
		driver.navigate().to(CompToolURL);
		driver.manage().window().maximize();
	}
	
	public static String appID = "5004584";

		
	}
	
	

