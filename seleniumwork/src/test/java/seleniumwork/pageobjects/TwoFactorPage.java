package seleniumwork.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TwoFactorPage extends LoadableComponent<TwoFactorPage>{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"auth-splashpage\"]/div/div/form/label[1]/div/input")
	WebElement twoFactorInputField;
	
	@FindBy(xpath="//*[@id=\"auth-splashpage\"]/div/div/form/button[1]")
	WebElement logInButtonField;
	
	public TwoFactorPage(WebDriver driver) {
		this.driver = driver;
		isLoaded();
	}
	
	public DashboardPage loginWithTwoFactorCode(String twoFactorCode) {
		twoFactorInputField.sendKeys(twoFactorCode);
		logInButtonField.click();

		return PageFactory.initElements(driver, DashboardPage.class);
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void isLoaded() throws Error {
		waitForVisibility(logInButtonField);
	}
	
	private void waitForVisibility(WebElement element) throws Error{
           new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOf(element));
    }
}
