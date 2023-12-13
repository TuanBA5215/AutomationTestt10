package automation.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrizenPage {
	
	private WebDriver driver;
	@FindBy(xpath="(//label[text()='Departing'])[1]/following-sibling::div/input")
	WebElement textDepartingDate;
	
	@FindBy(xpath="(//label[text()='Passengers'])[1]/following-sibling::div/div")
	WebElement dropboxPassenger;
	
	@FindBy(xpath = "(//div[@class='qtyInc'])[1]/descendant::I")
	WebElement addAdult;

	public TrizenPage(WebDriver driverCommonBase) {
		this.driver = driverCommonBase;
		PageFactory.initElements(driverCommonBase, this);
}
	public void HandleDateTimeAndDropDownList() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('readonly', 'readonly')", textDepartingDate);
		textDepartingDate.clear();
		textDepartingDate.sendKeys("03072024");
		textDepartingDate.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		dropboxPassenger.click();
		addAdult.click();
	
	}
}