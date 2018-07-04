package genericLib;

public class CommonLib extends Base{
	
	private static String portaURL  = "https://staging.privacy.zynga.com/portal/#/";
	private static String CompToolURL = "https://staging.admin.privacy.zynga.com/util/";
	
	public static void gotoportal() {
		driver.get(portaURL);
		driver.manage().window().maximize();
	}
}
