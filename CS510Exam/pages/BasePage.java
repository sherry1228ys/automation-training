package CS510Exam.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {
	private WebDriver browser;
	private int t= 10;
	
	public BasePage(WebDriver browser) {
		this.browser = browser;
	}
	public WebDriver getBrowser() {
		return browser;
	}
	
	protected void WaitForPageLoad(By by) {
		WebDriverWait wait = new WebDriverWait(getBrowser(), t);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
}
