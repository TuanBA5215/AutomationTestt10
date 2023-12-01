package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.constant.CT_Account;
import automation.constant.HWDay13_Account;

public class HW_Day13 {
	private WebDriver driver;
	public HW_Day13(WebDriver _driver)
	{
		this.driver= _driver;
	}
	public void LoginFunction(String usernamelValue, String passValue) {
		
		WebElement username = driver.findElement(HWDay13_Account.TEXT_USERNAME);
		username.sendKeys(usernamelValue);
		
		WebElement pass = driver.findElement(HWDay13_Account.TEXT_PASSWORD);
		pass.sendKeys(passValue);
		
		WebElement submitButton = driver.findElement(HWDay13_Account.BUTTON_SUBMIT);
		if(submitButton.isEnabled()) {
			submitButton.click();
		}
		
		/*
		 * WebElement logoutButton = driver.findElement(HWDay13_Account.LOGOUT_BUTTON);
		 * if(logoutButton.isEnabled()) { logoutButton.click(); }
		 */
		
	}
	public void LogoutFunction() {
		WebElement logoutButton = driver.findElement(HWDay13_Account.LOGOUT_BUTTON);
		if(logoutButton.isEnabled()) {
			logoutButton.click();
	}

}
}