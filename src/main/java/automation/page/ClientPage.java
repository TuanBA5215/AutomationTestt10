package automation.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
	
	private WebDriver driver;
	@FindBy (xpath = "//span[text()='Clients']")
	WebElement clientLinks;
	
	@FindBy (xpath = "//a[@data-title='Add client']")
	WebElement clientButton;
	
	@FindBy (id ="type_person")
	WebElement radioPersion;
	
	@FindBy (id ="company_name")
	WebElement textboxClientName;
	
	@FindBy (id ="s2id_created_by")
	WebElement ownerDropdownlist;
	
	@FindBy (xpath = "//ul[@id='select2-results-3']//div[text()='Sara Ann']")
	WebElement ownerItem;
	
	@FindBy (xpath = "//button[@type ='submit' and normalize-space()='Save']" )
	WebElement buttonSave;
	
	@FindBy(xpath="//a[text()='Clients']") 
	WebElement clientsTab;
	  
	@FindBy(xpath="//input[@type='search' and @placeholder='Search']")
	WebElement textboxSearch;
	 
	

	public ClientPage(WebDriver driverCommonBase) {
		this.driver = driverCommonBase;
		PageFactory.initElements(driverCommonBase, this);
	}
	
	public void AddClientFunction(String companyName, String Owner) throws InterruptedException {
		//Pre-condition: Login
		clientLinks.click();
		clientButton.click();
		Thread.sleep(3000);
		radioPersion.click();
		textboxClientName.sendKeys(companyName);
		ownerDropdownlist.click();
		Thread.sleep(3000);
		ownerItem.click();
		buttonSave.click();
		//Assert client succesfully
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", clientsTab);
	    Thread.sleep(3000);
		textboxSearch.sendKeys(companyName);
	}

}

//org.openqa.selenium.ElementNotInteractableException: element not interactable
//org.openqa.selenium.ElementClickInterceptedException: element click intercepted