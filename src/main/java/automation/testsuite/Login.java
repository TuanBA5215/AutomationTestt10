package automation.testsuite;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.page.LoginPage;

public class Login extends CommonBase {
	
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_Account.RISE_URL);
	}
	
	@Test(priority =1)
	public void LoginSuccesfully() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("client@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Account.DASHBOARD_TEXT).isDisplayed());
	}
	
	@Test(priority =2)
	public void LoginFailIncorrectEmail() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("sai_client@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Account.LOGIN_FAIL).isDisplayed());
	}
	
	@Test(priority =3)
	public void LoginFailIncorrectPass() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("client@demo.com", "sai_riseDemo");
		assertTrue(driver.findElement(CT_Account.LOGIN_FAIL).isDisplayed());
	}

	@AfterMethod
	public void closeDriver() {
		driver.close();
	}
}
