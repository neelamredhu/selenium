package seleniumwork.tests;

import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import seleniumwork.pageobjects.DashboardPage;
import seleniumwork.pageobjects.LoginPage;
import seleniumwork.pageobjects.TwoFactorPage;

public class XeroTests {
	
	private ChromeDriver driver;

	private TestUtils testUtils;
	private HashMap<String, String> prop = null;
	
	@BeforeSuite
	public void setupSelenium() {
		System.setProperty("webdriver.chrome.driver", "BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		//Instantiating TestUtils
		testUtils = new TestUtils();
		
		//Loading properties into a HashMap
		prop = testUtils.loadProperties();
	}
	
	@AfterSuite
	public void closeSelenium() {
//		driver.close();
//		driver.quit();
	}
	
	@Test
	public void login_xero() {
		LoginPage loginPage = LoginPage.navigateTo(driver);
		
		TwoFactorPage twoFactorPage = loginPage.login(prop.get("xero.login.username"), 
				prop.get("xero.login.passwd"));
		
		twoFactorPage.loginWithTwoFactorCode(testUtils.generateTwoFactorCode());
	}
}
