package CS510Exam.test.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import CS510Exam.pages.Header;
import CS510Exam.pages.HomePage;

import junit.framework.Assert;

public class HeaderSmokeTest {
	private WebDriver browser;
	HomePage homepage;
	Header header;
	
	public HeaderSmokeTest() {
		this.browser = new FirefoxDriver();
		this.homepage = new HomePage(browser);
		this.header = new Header(browser);
	}
	
	@BeforeSuite
	public void setupDriver() {
		browser.get("http://futurera.io/");
		homepage.WaitForPageLoad();
	}

	@AfterSuite
	public void clearDriver() {
		browser.quit();
	}
	
	@Test
	public void checkLanguage() {
		header.getLanguageButton().click();
		header.getChinese().click();
		Assert.assertEquals("首页", header.getHomeButton().getText());
	}
	
}
