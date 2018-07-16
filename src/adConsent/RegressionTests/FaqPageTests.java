package adConsent.RegressionTests;

import org.testng.annotations.Test;
 import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Base;
import pageObjectLib.FaqPage;

public class FaqPageTests extends Base{
	
	FaqPage pf = PageFactory.initElements(driver,FaqPage.class);
	@Test (priority = 0)
	public void verifyLinkText_01() {
		
		
		Assert.assertTrue(pf.linkTextTest(0));
	
	}

	@Test (priority =1)
	public void verifyLinkText_02() {
		
		Assert.assertTrue(pf.linkTextTest(1));
	
	}
	@Test (priority =2)
	public void verifyLinkText_03() {
		
		Assert.assertTrue(pf.linkTextTest(2));
	
	}
	@Test (priority =3)
	public void verifyLinkText_04() {
		
		Assert.assertTrue(pf.linkTextTest(3));
	
	}
	@Test (priority =4)
	public void verifyLinkText_05() {
		
		Assert.assertTrue(pf.linkTextTest(4));
	
	}
	@Test (priority =5)
	public void verifyLinkText_06() {
		
		Assert.assertTrue(pf.linkTextTest(5));
	
	}
	@Test (priority =6)
	public void verifyLinkText_07() {
		
		Assert.assertTrue(pf.linkTextTest(6));
	
	}
	@Test (priority =7)
	public void verifyLinkText_08() {
		
		Assert.assertTrue(pf.linkTextTest(7));
	
	}
	@Test (priority =8)
	public void verifyLinkText_09() {
		
		Assert.assertTrue(pf.linkTextTest(8));
	
	}

	@Test 
	public void linkVisibleAndEnableTest_01() {
		
		Assert.assertTrue(pf.linkClickableAndVisibleTest(0));
	
	}
	@Test 
	public void linkVisibleAndEnableTest_02() {
		
		Assert.assertTrue(pf.linkClickableAndVisibleTest(1));
	
	}@Test 
	public void linkVisibleAndEnableTest_03() {
		
		Assert.assertTrue(pf.linkClickableAndVisibleTest(2));
	
	}@Test 
	public void linkVisibleAndEnableTest_04() {
		
		Assert.assertTrue(pf.linkClickableAndVisibleTest(3));
	
	}@Test 
	public void linkVisibleAndEnableTest_05() {
		
		Assert.assertTrue(pf.linkClickableAndVisibleTest(4));
	
	}@Test 
	public void linkVisibleAndEnableTest_06() {
		
		Assert.assertTrue(pf.linkClickableAndVisibleTest(5));
	
	}@Test 
	public void linkVisibleAndEnableTest_07() {
		
		Assert.assertTrue(pf.linkClickableAndVisibleTest(6));
	
	}@Test 
	public void linkVisibleAndEnableTest_08() {
		
		Assert.assertTrue(pf.linkClickableAndVisibleTest(7));
	
	}
	
	@Test 
	public void linkVisibleAndEnableTest_09() {

		
		Assert.assertTrue(pf.linkClickableAndVisibleTest(8));
	
	}
	
	@Test (priority = 10)
	public void linkOpenTest_01() {
		Assert.assertTrue(pf.linkOpen(0));
	}
	@Test (priority = 11)
	public void linkOpenTest_02() {
		Assert.assertTrue(pf.linkOpen(1));
	}
	
	@Test (priority = 12)
	public void linkOpenTest_03() {
		Assert.assertTrue(pf.linkOpen(2));
	}
	
	@Test (priority = 13)
	public void linkOpenTest_04() {
		Assert.assertTrue(pf.linkOpen(3));
	}
	
	@Test (priority = 14)
	public void linkOpenTest_05() {
		Assert.assertTrue(pf.linkOpen(4));

	}
	
	@Test (priority = 15)
	public void linkOpenTest_06() {
		Assert.assertTrue(pf.linkOpen(5));

	}
	
	@Test (priority = 16)
	public void linkOpenTest_07() {
		Assert.assertTrue(pf.linkOpen(6));

	}
	
	@Test (priority = 17)
	public void linkOpenTest_08() {
		Assert.assertTrue(pf.linkOpen(7));

	}
	
	@Test (priority = 18)
	public void linkOpenTest_09() {

		Assert.assertTrue(pf.linkOpen(8));

	}
	
	@Test (priority = 19)
	public void linkCloseTest_01() throws InterruptedException {
		Assert.assertTrue(pf.linkClose(0));
		
	}
	
	@Test (priority = 20)
	public void linkCloseTest_02() throws InterruptedException {
		Assert.assertTrue(pf.linkClose(1));
		
	}
	@Test (priority = 21)
	public void linkCloseTest_03() throws InterruptedException {
		Assert.assertTrue(pf.linkClose(2));
		
	}
	
	@Test (priority = 22)
	public void linkCloseTest_04() throws InterruptedException {
		Assert.assertTrue(pf.linkClose(3));
		
	}
	@Test (priority = 23)
	public void linkCloseTest_05() throws InterruptedException {
		Assert.assertTrue(pf.linkClose(4));
		
	}
	
	@Test (priority = 24)
	public void linkCloseTest_06() throws InterruptedException {
		Assert.assertTrue(pf.linkClose(5));
		
	}
	@Test (priority = 25)
	public void linkCloseTest_07() throws InterruptedException {
		Assert.assertTrue(pf.linkClose(6));
		
	}
	
	@Test (priority = 26)
	public void linkCloseTest_08() throws InterruptedException {
		Assert.assertTrue(pf.linkClose(7));
		
	}
	
	@Test (priority = 27)
	public void linkCloseTest_09() throws InterruptedException {
		Assert.assertTrue(pf.linkClose(8));
		
	}
	
}
