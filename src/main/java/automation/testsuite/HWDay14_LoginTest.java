package automation.testsuite;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import automation.common.CommonBase;
import automation.constant.HWDay14_Account;
import automation.page.HWDay14_LoginPage;
import automation.page.LoginPage_Factory;

public class HWDay14_LoginTest extends CommonBase{
	@BeforeMethod
	public void openChorme() {
		driver = initChromeDriver(HWDay14_Account.ALADA_URL);
	}
	
	@Test(priority = 1)
	public void SigninSuccessfully() {
		WebElement Signup = driver.findElement(By.xpath("//a[text()='Đăng Ký']"));
		Signup.click();
		HWDay14_LoginPage signin = new HWDay14_LoginPage(driver);
		signin.SigninFunction("Anh Tuan","testauto5254@gmail.com","testauto5254@gmail.com","123456","123456","0917763289");
		assertTrue(driver.findElement(HWDay14_Account.SIGN_IN_SUCCES).isDisplayed());
		}
	
	@Test(priority = 2)
	public void ChangePW() {
		WebElement Login = driver.findElement(By.xpath("//a[text()='Đăng Nhập']"));
		Login.click();
		HWDay14_LoginPage login = new HWDay14_LoginPage(driver);
		login.LoginFunction("testauto5254@gmail.com", "123456");
		WebElement Login1 = driver.findElement(By.xpath("//button[@type='submit']"));
		Login1.click();
		WebElement Change1 = driver.findElement(By.xpath("//i[@class='fa fa-caret-down']"));
		Change1.click();
		HWDay14_LoginPage change = new HWDay14_LoginPage(driver);
		change.ChangePWFunction("123456","1234567","1234567");
		WebElement changepw = driver.findElement(By.xpath("//button[text()='Lưu mật khẩu mới']"));
		changepw.click();
	}
	
	@Test(priority = 3)
	public void LoginWithNewPW() {
		WebElement Login = driver.findElement(By.xpath("//a[text()='Đăng Nhập']"));
		Login.click();
		HWDay14_LoginPage login = new HWDay14_LoginPage(driver);
		login.LoginFunction("testauto5254@gmail.com", "1234567");
		WebElement Login1 = driver.findElement(By.xpath("//button[@type='submit']"));
		Login1.click();
		assertTrue(driver.findElement(HWDay14_Account.SIGN_IN_SUCCES).isDisplayed());
	}
	
		/*
		 * @AfterMethod public void closeChrome() { closeDriver(); }
		 */

}
