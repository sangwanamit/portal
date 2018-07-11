package adConsent.RegressionTests;

import org.testng.annotations.Test;
 import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Base;
import pageObjectLib.FaqPage;

public class FaqPageTests extends Base{
	FaqPage pf = PageFactory.initElements(driver,FaqPage.class);

	@Test (priority =0)
	public void verifyFaqPageTitle() {
	Assert.assertEquals("FAQ1",pf.PageTitle());
	}
	
	@Test (priority = 1) 
	public void linkText1(){
		System.out.println(pf.link1());
	}
	
	@Test (priority = 2) 
	public void linkText2(){
		System.out.println(pf.link2());
	}
	
	@Test (priority = 3) 
	public void linkText3(){
		System.out.println(pf.link3());
	}
	@Test (priority = 4) 
	public void linkText4(){
		System.out.println(pf.link4());
	}
	
	@Test (priority = 5) 
	public void linkText5(){
		System.out.println(pf.link5());
	}
	
	@Test (priority = 6) 
	public void linkText6(){
		System.out.println(pf.link6());
	}
	@Test (priority = 7) 
	public void linkText7(){
		System.out.println(pf.link7());
	}
	
	@Test (priority = 8) 
	public void linkText8(){
		System.out.println(pf.link8());
	}
	
	
	@Test (priority = 17)
	public void link1() {
		pf.link1Open();
	}
	
	@Test (priority = 10)
	public void link2() {
		pf.link2Open();
	}
	
	@Test (priority = 11)
	public void link3() {
		pf.link3Open();
	}
	
	@Test (priority = 12)
	public void link4() {
		pf.link4Open();
	}
	
	@Test (priority = 13)
	public void link5() {
		pf.link5Open();
	}
	
	@Test (priority = 14)
	public void link6() {
		pf.link6Open();
	}
	
	@Test (priority = 15)
	public void link7() {
		pf.link7Open();
	}
	
	@Test (priority = 16)
	public void link8() {
		pf.link8Open();
	}
	
	
	
	
}
