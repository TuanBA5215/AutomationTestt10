package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day16_AlertPractice extends CommonBase {
	
	@BeforeMethod
	public void initChromeDriver() {
		driver = initChromeDriver("https://demo.guru99.com/test/delete_customer.php");
	}
	
	@Test
	public void deleteCustomerSucces() {
		type(By.xpath("//input[@name='cusid']"), "123456");
		click(By.xpath("//input[@name='submit']"));
		String msgConfirm = driver.switchTo().alert().getText();
		assertEquals(msgConfirm, "Do you really want to delete this Customer?");
		driver.switchTo().alert().accept();
		String msgDelete = driver.switchTo().alert().getText();
		assertEquals(msgDelete, "Customer Successfully Delete!");
		driver.switchTo().alert().accept();
	}
	
	@AfterMethod
	public void quitDriver() {
		driver.close();
	}

}
