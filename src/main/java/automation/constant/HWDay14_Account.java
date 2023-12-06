package automation.constant;

import org.openqa.selenium.By;

public class HWDay14_Account {
	public static String ALADA_URL = "https://alada.vn/";
	public static By SIGN_UP_BUTTON = By.xpath("//a[text()='Đăng Ký']");
	public static By HO_VA_TEN = By.id("txtFirstname");
	public static By EMAIL = By.id("txtEmail");
	public static By NHAP_LAI_EMAIL = By.id("txtCEmail");
	public static By PASS_WORD = By.id("txtPassword");
	public static By NHAP_LAI_PW = By.id("txtCPassword");
	public static By SO_DIEN_THOAI = By.id("txtPhone");
	public static By DANG_KY = By.xpath("//button[@type='submit']");
	public static By SIGN_UP_PAGE = By.xpath("//p[@class='title_login' and text()='Đăng ký tài khoản mới']");
	public static By SIGN_IN_BUTTON = By.xpath("//a[text()='Đăng Nhập']");
	public static By EMAIL_LOGIN = By.id("txtLoginUsername");
	public static By PASS_WORD_LOGIN = By.id("txtLoginPassword");
	public static By SIGN_IN_SUCCES = By.id("thongbao");

	
}
