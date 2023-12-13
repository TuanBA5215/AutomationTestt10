package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class HWDay16_Alert extends CommonBase {
	
	@BeforeMethod
	public void initChromeDriver() {
		driver = initChromeDriver("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
	}
	
	@Test
	public void AlertShow() throws InterruptedException{
		
		click(By.xpath("//button[text()='Try it']"));
		Thread.sleep(11000);
	    String Alert = driver.switchTo().alert().getText();
		assertEquals(Alert, "Welcome to Selenium WebDriver Tutorials");
		driver.switchTo().alert().accept();
}
}