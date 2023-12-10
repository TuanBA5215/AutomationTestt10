package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.page.HWDay15_RisePage;
import automation.page.LoginPage_Factory;

public class HWDay15_RiseTest extends CommonBase {


	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.RISE_URL);
	}
	
	@Test
	public void AddClientSuccesfully() throws InterruptedException {
		LoginPage_Factory login = new LoginPage_Factory(driver);
		login.LoginFunction("admin@demo.com", "riseDemo");
		
		HWDay15_RisePage client = new HWDay15_RisePage(driver);
		client.AddClientFunction("Demo company", "Sara Ann","Truong Dinh", "Ha Noi", "Hoang Mai", "10000", "Viet Nam", "0123456789", "testdemo.com.vn", "05022015", "12101995", "VND", "Dong" );
		
		
		//Assert Tuan's company visible
		//assertTrue(driver.findElement(By.xpath("//a[text()='Demo company']")).isDisplayed());
		Thread.sleep(3000);
		isElementPresent(By.xpath("//a[text()='Demo company']"));
	
	}

}

