package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class HW_Day12 extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://demo.seleniumeasy.com/input-form-demo.html");
	}
	
	@Test
	public void SelectOneOptionFromDropdownlist() throws InterruptedException {
		WebElement selectTag = driver.findElement(By.name("state"));
		Select dropdownlist = new Select(selectTag);
		System.out.println("drop downlist.isMultiple "+dropdownlist.isMultiple());
		System.out.println("drop downlist size "+dropdownlist.getOptions().size());
		selectTag.click();
		dropdownlist.selectByIndex(1);
		System.out.println("Chon lan 1: "+dropdownlist.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		selectTag.click();
		dropdownlist.selectByIndex(2);
		System.out.println("Chon lan 2: "+dropdownlist.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		selectTag.click();
		dropdownlist.selectByVisibleText("New York");
		System.out.println("Chon lan 3: "+dropdownlist.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		}
	@Test
	public void testCheckbox() {
		
		WebElement radioYes = driver.findElement(By.xpath("//input[@value='yes']"));
		WebElement radioNo = driver.findElement(By.xpath("//input[@value='no']"));
		System.out.println("Status radio button yes: " +radioYes.isSelected());
		System.out.println("Status radio button no: " +radioNo.isSelected());
		
		if(radioYes.isEnabled()== true && radioYes.isSelected()== false) {
			radioYes.click();
		}
		else if(radioNo.isEnabled()== true && radioNo.isSelected()== false) {
			radioNo.click();
		}
	}

}
