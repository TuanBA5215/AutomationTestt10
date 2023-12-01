package automation.testsuite;

import automation.common.CommonBase;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class Day8_HW extends CommonBase {
	@BeforeMethod
	public void openChromeDriver() {
		driver = initChromeDriver("https://automationfc.github.io/basic-form/index.html");
	}
	
	@Test
	public void getLocatorHW() {
		//Name
		System.out.println("Locator user name: "+driver.findElement(By.name("name")));
		
		//Address
		System.out.println("Locator user address: "+driver.findElement(By.name("address")));
		
		//Email
		System.out.println("Locator user email: "+driver.findElement(By.id("email")));
		
		//Password
		System.out.println("Locator user password: "+driver.findElement(By.id("password")));
	}
}
