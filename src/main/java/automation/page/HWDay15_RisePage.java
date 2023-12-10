package automation.page;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HWDay15_RisePage {
	
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
	
	@FindBy(xpath = "//textarea[@id='address']")
	WebElement textboxAddress;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement textboxCity;
	
	@FindBy(xpath = "//input[@id='state']")
	WebElement textboxState;
	 
	@FindBy(xpath = "//input[@id='zip']")
	WebElement textboxZip;
	
	@FindBy(xpath = "//input[@id='country']")
	WebElement textboxCountry;
	
	@FindBy(xpath = "//input[@id='phone']")
	WebElement textboxPhone;
	
	@FindBy(xpath = "//input[@id='website']")
	WebElement textboxWebsite;
	
	@FindBy(xpath = "//input[@id='vat_number']")
	WebElement textboxVat_number;
	
	@FindBy(xpath = "//input[@id='gst_number']")
	WebElement textboxGst_number;
	
	@FindBy(xpath = "//input[@id='s2id_autogen2']")
	WebElement textboxClientgroup;
	
	@FindBy(xpath = "//*[@id=\"s2id_autogen1_search\"]")
	WebElement dropdownCurrency;
	
	@FindBy(xpath = "//*[@id=\"select2-result-label-360\"]")
	WebElement itemCurrency;
	
	@FindBy(xpath = "//div[@id='s2id_currency']")
	WebElement textboxCurrency;
	
	@FindBy(xpath = "//input[@id='currency_symbol']")
	WebElement textboxCurrency_symbol;
	
	@FindBy(xpath = "//input[@id='s2id_autogen2']")
	WebElement dropdownClientgroup;
	
	@FindBy(xpath = "//input[@id='s2id_autogen4']")
	WebElement textboxLabel;
	

	public HWDay15_RisePage(WebDriver driverCommonBase) {
		this.driver = driverCommonBase;
		PageFactory.initElements(driverCommonBase, this);
	}
	
	public void AddClientFunction(String companyName, String Owner, String Address, String City, String State, String Zip, String Country, String Phone, String webSite, String vatNumber, String gtsNumber, String Currency, String symbol) throws InterruptedException {
		//Pre-condition: Login
		clientLinks.click();
		clientButton.click();
		Thread.sleep(3000);
		radioPersion.click();
		textboxClientName.sendKeys(companyName);
		ownerDropdownlist.click();
		Thread.sleep(3000);
		ownerItem.click();
		textboxAddress.click();
		textboxAddress.sendKeys(Address);
		Thread.sleep(1000);
		textboxCity.click();
		textboxCity.sendKeys(City);
		Thread.sleep(1000);
		textboxState.click();
		textboxState.sendKeys(State);
		Thread.sleep(1000);
		textboxZip.click();
		textboxZip.sendKeys(Zip);
		Thread.sleep(1000);
		textboxCountry.click();
		textboxCountry.sendKeys(Country);
		Thread.sleep(1000);
		textboxPhone.click();
		textboxPhone.sendKeys(Phone);
		Thread.sleep(1000);
		textboxWebsite.click();
		textboxWebsite.sendKeys(webSite);
		Thread.sleep(1000);
		textboxVat_number.click();
		textboxVat_number.sendKeys(vatNumber);
		Thread.sleep(1000);
		textboxGst_number.click();
		textboxGst_number.sendKeys(gtsNumber);
		Thread.sleep(1000);
		/*
		 * textboxCurrency.click(); dropdownCurrency.click();
		 * dropdownCurrency.sendKeys(Currency); itemCurrency.click();
		 */
		
		
		Thread.sleep(1000); 
		textboxCurrency_symbol.click();
		textboxCurrency_symbol.sendKeys(symbol);
		 
		
		buttonSave.click();
		//Assert client succesfully
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", clientsTab);
	    Thread.sleep(3000);
		textboxSearch.sendKeys(companyName);
	}

}