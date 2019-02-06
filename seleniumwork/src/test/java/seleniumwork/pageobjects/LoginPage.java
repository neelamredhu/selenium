package seleniumwork.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement usernameField;
	
	@FindBy(id="password")
	WebElement passwordField;
	
	@FindBy(id="submitButton")
	WebElement submitButton;
	
	public LoginPage(WebDriver webdriver) {
		this.driver = webdriver;
	}
	
	public static LoginPage navigateTo(WebDriver driver) {
		driver.get("https://login.xero.com/");
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
	public TwoFactorPage login(String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		
		submitButton.click();
		
		return PageFactory.initElements(driver, TwoFactorPage.class);
	}
}
