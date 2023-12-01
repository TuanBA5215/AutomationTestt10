package automation.testsuite;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day12_CheckkBox extends CommonBase{
	
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	}

	@Test
	public void ClickOnCheckBox() {
		
		//Kiem tra rang sau khi page duoc mo thi default checked da duoc check
		WebElement defaultChecked = driver.findElement(By.xpath("(//div[@class='checkbox']/descendant::input)[2]"));
		boolean status = defaultChecked.isSelected();
		System.out.println("Status is: "+ status);
		
		//Kiem tra checkbox ten Click on this checkbox chua duoc selected thi se click
		WebElement clickOnThisChb = driver.findElement(By.xpath("(//div[@class='checkbox']/descendant::input)[1]"));
		if(clickOnThisChb.isSelected() == false) {
			clickOnThisChb.click();
			System.out.println("Checkbox Click on this checkbox was checked");
		}
		//Lay xpath cua default Disable, tim element nay: element.isEnable(); element.isDisplay;
		
	}
	
	@Test
	public void ClickOnMultipleCheckbox() throws InterruptedException {
		
		Thread.sleep(2000);
		List<WebElement> listCheckbox;
		//Lay tong so checkbox
		listCheckbox = driver.findElements(By.xpath("//div[text()='Multiple Checkbox Demo']/following-sibling::div[@class='panel-body']/child::div[@class='checkbox']//input"));
		for(int i=0; i<listCheckbox.size(); i++)
		{
			WebElement checkbox = listCheckbox.get(i);
			if(checkbox.isSelected() == false)
			{
				checkbox.click();
				System.out.println("Checkbox thu "+(i+1)+" da duoc check");
			}
		}
	}
}
