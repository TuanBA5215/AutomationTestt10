package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day8_Practice2 extends CommonBase {
	
	@BeforeMethod
	public void openChromeDriver() {
		driver = initChromeDriver("https://bepantoan.vn/danh-muc/may-hut-mui");
	}
	
	@Test
	public void getLocatorByText() {
		WebElement linkMayRuaChen = driver.findElement(By.linkText("Máy Rửa Chén Bát" ));
		System.out.println("Locator cua link may rua chen la: "+linkMayRuaChen);
		
		WebElement textBepInventor = driver.findElement(By.partialLinkText("Cổ Điển"));
		System.out.println("Locator cua link may hut mui co dien la: "+textBepInventor);
	}
	
	@Test
	public void getLocatorByClassName_TagName() {
		System.out.println("Checkbox xuat xu la: " +driver.findElement(By.className("cursor-pointer")));
		System.out.println("So luong checkbox xuat xu la: " +driver.findElements(By.className("cursor-pointer")).size());
		
		System.out.println("The co ten input la: " +driver.findElement(By.tagName("input")));
	}
	
	@AfterMethod
	public void closeChromeBrower() {
		driver.close();
	}
}
