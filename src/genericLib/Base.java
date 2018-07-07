package genericLib;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Base {
		public static WebDriver driver ;
		
	
		@BeforeSuite
		public void setUp() {
			System.setProperty("webdriver.gecko.driver","./res/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			
		}
		
		@AfterSuite
		public void exit() {
		driver.quit();
		
			
		}
		
	}
