package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day12_RadioButton extends CommonBase {
	
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
	}
	
	@Test
	public void testCheckbox() {
		//Kiem tra gia tri mac dinh cua radio Male vaf Female la chua check
		WebElement radioMale = driver.findElement(By.xpath("//input[@value='Male']"));
		WebElement radioFemale = driver.findElement(By.xpath("//input[@value='Female']"));
		System.out.println("Trang thai cua radio Male la: " +radioMale.isSelected());
		System.out.println("Trang thai cua radio Female la: " +radioFemale.isSelected());
		//Kiem tra radio chua duoc check thi click vao
		if(radioMale.isEnabled()== false && radioMale.isSelected()== false) {
			radioMale.click();
		}
		else if(radioFemale.isEnabled()== false && radioFemale.isSelected()== false) {
			radioFemale.click();
		}
	}

}
