package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class HWDay17_Bai2 extends CommonBase {
	
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://mediamart.vn");
	}
	
	@Test
	public void test_iframe_zalo() {
		pause(10000);
		WebElement iframeZalo = driver.findElement(By.xpath("//div[@class='zalo-chat-widget']//iframe"));
		driver.switchTo().frame(iframeZalo);
		click(By.xpath("//div[@class='logo']"));
		isElementPresent(By.xpath("//div[text()='Chat nhanh']"));
		click(By.xpath("//div[text()='Chat nhanh']"));
		isElementPresent(By.xpath("//div[@class='chat-wrapper za-chat__wrapper']"));

		}

	
}