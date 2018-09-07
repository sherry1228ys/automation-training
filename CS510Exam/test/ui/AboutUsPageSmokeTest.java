package CS510Exam.test.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import CS510Exam.pages.AboutUsPage;
import CS510Exam.pages.Header;

public class AboutUsPageSmokeTest {
	private WebDriver browser;
	AboutUsPage aboutUsPage;
	Header header;
	
	public AboutUsPageSmokeTest() {
		this.browser = new FirefoxDriver();
		this.aboutUsPage = new AboutUsPage(browser);
		this.header = new Header(browser);
	}
	
	@BeforeSuite
	public void setupDriver() {
		browser.get("http://futurera.io/");
		header.getAboutUsButton().click();
		aboutUsPage.WaitForPageLoad();
	}

	@AfterSuite
	public void clearDriver() {
		browser.quit();
	}
	@Test
	public void checkDisplay() {
		Assert.assertEquals("Bias for Action", aboutUsPage.getBiasForAction().getText());
		Assert.assertEquals("Customer obsession", aboutUsPage.getCustomerObsession().getText());
		Assert.assertEquals("Result-oriented", aboutUsPage.getResultOriented().getText() );
		Assert.assertEquals("Humor", aboutUsPage.getHumor().getText());
		Assert.assertEquals("Love to share", aboutUsPage.getLoveToShare().getText());
		Assert.assertEquals("Honesty", aboutUsPage.getHonesty().getText());
		Assert.assertEquals("Data-driven", aboutUsPage.getDataDriven().getText());
		Assert.assertEquals("Love the community", aboutUsPage.getLoveTheCommunity().getText());
	}

}
