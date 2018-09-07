package CS510Exam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CoursesPage extends BasePage {
	
	public CoursesPage(WebDriver browser) {
	super(browser);	
	}

	private String ourCoursesXPath = "/html/body/div/div/div/span/div/div[1]/h2";

	public void WaitForPageLoad() {
		WaitForPageLoad(getOurCoursesXpathBy());
	}
	
	
	public WebElement getOurCourses() {
		return getBrowser().findElement(getOurCoursesXpathBy());
	}
	
	private By getOurCoursesXpathBy() {
		return By.xpath(ourCoursesXPath);
	}
}
