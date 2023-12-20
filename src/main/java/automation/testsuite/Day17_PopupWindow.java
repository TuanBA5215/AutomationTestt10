package automation.testsuite;

import static org.testng.Assert.assertEquals;

import java.util.*;

import org.openqa.selenium.By;
import org.testng.annotations.*;


import automation.common.CommonBase;

public class Day17_PopupWindow extends CommonBase {
	
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://demo.guru99.com/popup.php");
	}
	
	@Test
	public void testDemoGuru() {
		//Sau khi vao website, an vao button click here
		click(By.xpath("//a[text()='Click Here']"));
		Set<String> listWindows = driver.getWindowHandles();
		String mainWindow = driver.getWindowHandle();
		for(String childWindow : listWindows) {
			if(!childWindow.equalsIgnoreCase(mainWindow)) {
				driver.switchTo().window(childWindow);
				assertEquals(driver.getCurrentUrl(),"https://demo.guru99.com/articles_popup.php");
				type(By.xpath("//input[@name='emailid']"), "test@gmail.com");
				click(By.name("btnLogin"));
				isElementPresent(By.xpath("//h2[text()='Access details to demo site.']"));
				driver.close();
			}
		}
		
		driver.switchTo().window(mainWindow);
		assertEquals(driver.getCurrentUrl(),"https://demo.guru99.com/popup.php");
	}
}
