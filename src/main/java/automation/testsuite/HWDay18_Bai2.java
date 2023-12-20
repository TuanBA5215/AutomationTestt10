package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import automation.common.CommonBase;

public class HWDay18_Bai2 extends CommonBase {
	@Parameters("browser")
	@BeforeMethod
	public void openChrome(@Optional("chrome")String browser) {
		setupDriver(browser);
		driver.get("https://bepantoan.vn/");	
	}
	@Test
	public void testChat() {
		pause(5000);
		WebElement buttonchat = driver.findElement(By.xpath("//div[@class='widget-visible']//iframe"));
		driver.switchTo().frame(buttonchat);
		isElementPresent(By.xpath("//div[@class='tawk-form-wrapper tawk-margin-small']"));
		click(By.xpath("//button[@class='tawk-custom-color tawk-custom-border-color tawk-button']"));
		pause(5000);
		click(By.xpath("//div[@class='tawk-form-footer tawk-flex tawk-flex-middle tawk-flex-row tawk-flex-wrap tawk-margin-small-top']//button[text()=' I accept ']"));
		
		 type(By.xpath("//input[@name='email']"), "TuanBA");
		 type(By.xpath("//input[@name='tel']"), "0123456798");
		 type(By.xpath("//input[@name='email']"), "testweb@gmail.com");
		 click(By.xpath("//div[@class='tawk-form-footer']")); 
		 isElementPresent(By.xpath("//p[text()='Tin nhắn của bạn đã được gửi thành công!']"));
		 
	}
}
