package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day8_Practice extends CommonBase {

	@BeforeMethod
	public void openChromeBrower() {
		driver = initChromeDriver("https://rise.fairsketch.com/signin");
	}
	
	@Test
	public void getLocatorById_Name_ClassName() {
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Email element is: "+email);
		//Tim password
		WebElement pass = driver.findElement(By.name("password"));
		System.out.println("Password element is: "+pass);
		
		WebElement btnSignin = driver.findElement(By.className("w-100"));
		System.out.println("Signin button element is: "+btnSignin);
	}
	
	@AfterMethod //TestNG annotation (chu thich) trong testNG
	public void closeChromeDriver() {
		driver.close();
	}
}
