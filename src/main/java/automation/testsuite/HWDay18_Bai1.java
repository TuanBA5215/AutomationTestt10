package automation.testsuite;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class HWDay18_Bai1 extends CommonBase{

	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://dienmaynhapkhaugiare.com.vn/");
	}
	
	@Test
	public void testZaloButton() {
		click(By.xpath("//div[@id='zalo-vr']"));
		Set<String> listWindows = driver.getWindowHandles();
		String mainWindow = driver.getWindowHandle();
		for(String childWindow : listWindows) {
			if(!childWindow.equalsIgnoreCase(mainWindow)) {
				driver.switchTo().window(childWindow);
				assertEquals(driver.getCurrentUrl(),"https://zalo.me/0988169282");
				isElementPresent(By.xpath("//h1[text()='ĐIỆN MÁY HÙNG ANH']"));
				driver.close();
			}
		}
		
		driver.switchTo().window(mainWindow);
		assertEquals(driver.getCurrentUrl(),"https://dienmaynhapkhaugiare.com.vn/");
	}
}
