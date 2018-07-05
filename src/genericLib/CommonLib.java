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
	
	public static int PidGen() {
	Random random = new Random();
		while(true) {
			
		int pid = random.nextInt();
		
		if(pid > 1000000 && pid <999999999 )	
			return pid ;
		}
		
	}
	
	
}
