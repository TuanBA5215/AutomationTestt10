package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day12_Dropdownlist extends CommonBase {
	
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	}
	
	@Test
	public void SelectOneOptionFromDropdownlist() throws InterruptedException {
		WebElement selectTag = driver.findElement(By.id("select-demo"));
		Select dropdownlist = new Select(selectTag);
		System.out.println("drop downlist.isMultiple "+dropdownlist.isMultiple());
		System.out.println("drop downlist size "+dropdownlist.getOptions().size());
		//Chon Sunday bang cach value
		selectTag.click();
		dropdownlist.selectByValue("Sunday");
		System.out.println("drop downlist 1st option is: "+dropdownlist.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		//Chon Monday bang cach VisibleText
		selectTag.click();
		dropdownlist.selectByVisibleText("Monday");
		System.out.println("drop downlist 1st option is: "+dropdownlist.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		//Chon Tuesday bang cach index
		selectTag.click();
		dropdownlist.selectByIndex(3);
		System.out.println("drop downlist 1st option is: "+dropdownlist.getFirstSelectedOption().getText());
	}

}
