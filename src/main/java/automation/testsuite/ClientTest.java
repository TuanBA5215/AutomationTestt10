package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.page.ClientPage;
import automation.page.LoginPage_Factory;
import automation.page.LoginPage;

public class ClientTest extends CommonBase{
	
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.RISE_URL);
	}
	
	@Test
	public void AddClientSuccesfully() throws InterruptedException {
		LoginPage_Factory login = new LoginPage_Factory(driver);
		login.LoginFunction("admin@demo.com", "riseDemo");
		
		ClientPage client = new ClientPage(driver);
		client.AddClientFunction("Demo company", "Sara Ann");
		//Assert Tuan's company visible
		//assertTrue(driver.findElement(By.xpath("//a[text()='Demo company']")).isDisplayed());
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		isElementPresent(By.xpath("//a[text()='Demo company']"));
	
	}

}
