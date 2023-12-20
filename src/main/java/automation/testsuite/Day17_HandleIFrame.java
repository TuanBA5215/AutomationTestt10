package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day17_HandleIFrame extends CommonBase{
	
	@Parameters("browser")
	@BeforeMethod
	public void openChrome(@Optional("chrome")String browser) {
		setupDriver(browser);
		driver.get("https://mediamart.vn/");
	}
	
	@Test
	public void test_DangKy_iframe() {
		pause(5000);
	int totalIIframe = 	driver.findElements(By.tagName("iframe")).size();
	for(int i = 0; i < totalIIframe; i++) {
		//Phuong phap tim index cua iframe
		driver.switchTo().frame(i);
		int totalButtonGuiNgay = driver.findElements(By.xpath("//button[text()='Gửi ngay']")).size();
		System.out.println("totalButtonGuiNgay: " + totalButtonGuiNgay);
		
		//Nếu tottalButtonGuiNgay khác 0 thì đang đứng tại iframe chứa element mong muốn
		//cần thực hiện test
		
		if(totalButtonGuiNgay != 0)
		{
			type(By.id("account_phone"), "097845425");
			click(By.xpath("//button[text()='Gửi ngay']"));
			isElementPresent(By.xpath("//button[text()='Gửi ngay']"));
			// đóng iframe trước khi chuyển sang iframe kế tiếp
			driver.switchTo().defaultContent();			
		}
		else //k thực thi lệnh, đóng iframe trước khi chuyển sang iframe kế tiếp
		driver.switchTo().defaultContent();
		
		}
	}
	
	@Test
	public void test_DangKyNgay_iframe() {
		pause(5000);
		int tong_iframe = 	driver.findElements(By.tagName("iframe")).size();
		for(int i = 0; i < tong_iframe; i++) {
			
			driver.switchTo().frame(i);
			int totalButtonDangKyNgay = driver.findElements(By.xpath("//button[text()='Đăng ký ngay']")).size();
			System.out.println("totalButtonDangKyNgay: " + totalButtonDangKyNgay);
			
			if(totalButtonDangKyNgay != 0)
			{
				type(By.name("account_name"), "TuanBA");
				type(By.id("account_phone"), "0987456321");
				click(By.xpath("//button[text()='Đăng ký ngay']"));
				isElementPresent(By.xpath("//button[text()='Đăng ký ngay']"));
				
				driver.switchTo().defaultContent();			
			}
			else 
			driver.switchTo().defaultContent();
			
			}
	}

}
