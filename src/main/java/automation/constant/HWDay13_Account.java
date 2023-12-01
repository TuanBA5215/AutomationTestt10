package automation.constant;


import org.openqa.selenium.By;

public class HWDay13_Account {
	
	public static String TESTLOGIN_URL = "https://practicetestautomation.com/practice-test-login/";
	public static By TEXT_USERNAME = By.id("username");
	public static By TEXT_PASSWORD = By.id("password");
	public static By BUTTON_SUBMIT = By.xpath("//button[text()='Submit']");
	public static By LOGINSUCCES_TEXT = By.xpath("//h1[text()='Logged In Successfully' and @class='post-title']");
	public static By LOGIN_FAIL = By.xpath("//div[@id='error']");
	public static By LOGOUT_SUCCESS = By.xpath("//button[text()='Submit']");
	public static By LOGOUT_BUTTON = By.xpath("//a[text()='Log out']");
}