package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HWDay14_LoginPage {
	private WebDriver driver;
	
	@FindBy(id = "txtEmail")
	WebElement textEmail;
	
	@FindBy(id = "txtFirstname")
	WebElement textHoten;
	
	@FindBy(id = "txtCEmail")
	WebElement textReemail;
	
	@FindBy(id = "txtPassword")
	WebElement textMatkhau;
	
	@FindBy(id = "txtPhone")
	WebElement textDienthoai;
	
	@FindBy(id = "txtCPassword")
	WebElement textRematkhau;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement buttonSignup;
	
	@FindBy(xpath = "//i[@class='fa fa-caret-down']")
	WebElement buttonUser;
	
	@FindBy(xpath = "//a[text()='Đăng Nhập']")
	WebElement buttonSignin;
	
	@FindBy(id = "txtLoginUsername")
	WebElement emailLogin;
	
	@FindBy(id = "txtLoginPassword")
	WebElement passWordLogin;
	
	@FindBy(xpath = "//a[@class='fs14']")
	WebElement buttonChangePW;
	
	@FindBy(id = "txtpassword")
	WebElement textpwhientai;
	
	@FindBy(id = "txtnewpass")
	WebElement textpwmoi;
	
	@FindBy(id = "txtrenewpass")
	WebElement textnhaplaipwmoi;
	
	
	public HWDay14_LoginPage(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void SigninFunction (String hoten, String email, String nhaplaiemail, String matkhau, String nhaplaimatkhau, String dienthoai) {
		textHoten.sendKeys(hoten);
		textEmail.sendKeys(email);
		textReemail.sendKeys(nhaplaiemail);
		textMatkhau.sendKeys(matkhau);
		textRematkhau.sendKeys(nhaplaimatkhau);
		textDienthoai.sendKeys(dienthoai);
		buttonSignup.click();
	}
	
	public void LoginFunction (String email1, String matkhau1 ) {
		emailLogin.sendKeys(email1);
		passWordLogin.sendKeys(matkhau1);
		
	}
	public void ChangePWFunction(String pwhientai, String pwmoi, String nhaplaipwmoi) {
		buttonUser.click();
		buttonChangePW.click();
		textpwhientai.sendKeys(pwhientai);
		textpwmoi.sendKeys(pwmoi);
		textnhaplaipwmoi.sendKeys(nhaplaipwmoi);
		
	}
	
	public void LoginWithNewPW (String email1, String pwmoi ) {
		emailLogin.sendKeys(email1);
		passWordLogin.sendKeys(pwmoi);
	}
	
	public void LogoutFunction(String email, String password){
			
		}
	}


