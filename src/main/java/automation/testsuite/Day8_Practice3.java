package automation.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day8_Practice3 extends CommonBase{
	
	@BeforeMethod
	public void openChromeDriver() {
		driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
	}
	
	@Test
	public void getLocatorOnThePage() {
		//User Email
		System.out.println("Locator User email: "+ driver.findElement(By.id("userId")));
		
		//Password
		System.out.println("Locator Password: "+driver.findElement(By.name("Password")));
		
		//Company
		System.out.println("Locator Company: "+driver.findElement(By.name("company")));
		
		//MobileNumbe
		System.out.println("Locator Mobile number: "+driver.findElement(By.name("mobile number")));
		
	}
}
