package automation.constant;

import org.openqa.selenium.By;

public class CT_Account {
	
	public static String TRIZEN_URL = "https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html";
	public static String RISE_URL = "https://rise.fairsketch.com/signin";
	public static By TEXT_EMAIL = By.id("email");
	public static By TEXT_PASSWORD = By.id("password");
	public static By BUTTON_SIGNIN = By.xpath("//button[text()='Sign in']");
	public static By DASHBOARD_TEXT = By.xpath("//span[text()='Dashboard' and @class='menu-text ']");
	public static By LOGIN_FAIL = By.xpath("//div[normalize-space()='Authentication failed!']");
}
