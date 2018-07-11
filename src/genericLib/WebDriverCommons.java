package genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommons extends Base {

		public static void waitFor(WebElement element){
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
		
 		 public static void taskesScreeshot(String screenShotName) throws IOException {
		 TakesScreenshot obj = (TakesScreenshot)driver;
		 File src =  obj.getScreenshotAs(OutputType.FILE);
		 File des = new File(".//Screenshots/" + screenShotName + ".jpg");
		 FileUtils.copyFile(src,des);
		 }
}
