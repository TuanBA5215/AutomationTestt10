package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day16_AlertPractice2 extends CommonBase {
	
	@BeforeMethod
	public void initChromeDriver() {
		driver = initChromeDriver("https://demo.automationtesting.in/Alerts.html");
	}
	
	@Test (priority = 1)
	public void ArletWithOK() {
		click(By.xpath("//button[@class='btn btn-danger']"));
		String msgAlert1 = driver.switchTo().alert().getText();
		assertEquals(msgAlert1, "I am an alert box!");
		driver.switchTo().alert().accept();
	}
	
	@Test (priority = 2)
	public void AlertWithOkAndCancel() {
		click(By.xpath("(//a[@class='analystic'])[2]"));
		click(By.xpath("//button[@class='btn btn-primary']"));
		String msgAlert2 = driver.switchTo().alert().getText();
		assertEquals(msgAlert2, "Press a Button !");
		driver.switchTo().alert().accept();
	}
	
	@Test (priority = 3)
	public void AlertWithTextbox() {
		click(By.xpath("(//a[@class='analystic'])[3]"));
		click(By.xpath("//button[@class='btn btn-info']"));
		String msgAlert3 = driver.switchTo().alert().getText();
		assertEquals(msgAlert3, "Please enter your name");
		driver.switchTo().alert().sendKeys("Tuan hoc dot");
		driver.switchTo().alert().accept();
		assertTrue(driver.findElement(By.xpath("//p[@id='demo1']")).isDisplayed());
	}

}
