package automation.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientPage {
	@FindBy (xpath = "//span[text()='Client'");
	WebElement clientLinks;
	
	@FindBy (xpath = "//a[@data-title='Add client']");
	WebElement clientButton;
	
	@FindBy (id ="'type-persion'");
	WebElement radioPersion;
	
	@FindBy (id ="'type-persion'");
	WebElement radioPersion;
	
	@FindBy (id ="'type-persion'");
	WebElement radioPersion;
}
