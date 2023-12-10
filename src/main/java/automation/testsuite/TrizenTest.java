package automation.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.page.TrizenPage;

public class TrizenTest extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.TRIZEN_URL);
	}
	
	@Test
	public void TestDateTimeAndDropDownList() throws InterruptedException {
		
		TrizenPage trizen = new TrizenPage(driver);
		trizen.HandleDateTimeAndDropDownList();
}
}