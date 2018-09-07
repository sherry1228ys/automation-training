package CS510Exam.test.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import CS510Exam.pages.CoursesPage;
import CS510Exam.pages.Header;
import junit.framework.Assert;

public class CoursesPageSmokeTest {
	
	private WebDriver browser;
	Header header;
	CoursesPage coursesPage;
	
	public CoursesPageSmokeTest() {
		this.browser = new FirefoxDriver();
		this.coursesPage = new CoursesPage(browser);
		this.header = new Header(browser);
	}
	
	@BeforeSuite
	public void setupDriver() {
		browser.get("http://futurera.io/");
		header.getCoursesButton().click();
		coursesPage.WaitForPageLoad();
	}

	@AfterSuite
	public void clearDriver() {
		browser.quit();
	}
	@Test
	public void checkDisplay() {
		String text = coursesPage.getOurCourses().getText();
		Assert.assertEquals("Our courses", text );
	}
}
