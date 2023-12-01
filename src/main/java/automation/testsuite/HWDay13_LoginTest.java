package automation.testsuite;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.HWDay13_Account;
import automation.page.HW_Day13;

public class HWDay13_LoginTest extends CommonBase {
	
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(HWDay13_Account.TESTLOGIN_URL);
	}
	
	@Test(priority =1)
	public void LoginSuccesfully() {
		HW_Day13 login = new HW_Day13(driver);
		login.LoginFunction("student", "Password123");
		assertTrue(driver.findElement(HWDay13_Account.LOGINSUCCES_TEXT).isDisplayed());
	}
	
	@Test(priority =2)
	public void LoginFailIncorrectUserName() {
		HW_Day13 login = new HW_Day13(driver);
		login.LoginFunction("studentsai", "Password123");
		assertTrue(driver.findElement(HWDay13_Account.LOGIN_FAIL).isDisplayed());
	}
	
	@Test(priority =3)
	public void LoginFailIncorrectPass() {
		HW_Day13 login = new HW_Day13(driver);
		login.LoginFunction("student", "Password123sai");
		assertTrue(driver.findElement(HWDay13_Account.LOGIN_FAIL).isDisplayed());
	}
	
	@Test(priority =4)
	public void LoginFailIncorrectUserNameAndPass() {
		HW_Day13 login = new HW_Day13(driver);
		login.LoginFunction("studentsai", "Password123sai");
		assertTrue(driver.findElement(HWDay13_Account.LOGIN_FAIL).isDisplayed());
	}
	
	 @Test(priority =5) 
	 public void SignOut() throws InterruptedException { 
	 	HW_Day13 login = new HW_Day13(driver); 
	 	login.LoginFunction("student", "Password123");
	 	assertTrue(driver.findElement(HWDay13_Account.LOGINSUCCES_TEXT).isDisplayed());
	 	Thread.sleep(2000);
	 	login.LogoutFunction();
	 	assertTrue(driver.findElement(HWDay13_Account.LOGOUT_SUCCESS).isDisplayed()); }
	 

	@AfterMethod
	public void closeDriver() {
		driver.close();
	}
}
