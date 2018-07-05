package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;


public class Base {
		public static WebDriver driver ;
		@BeforeClass
		public void setUp() {
			System.setProperty("webdriver.gecko.driver","./res/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			
		}
		
		
		
	}
