package CS510Exam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header  {
	private WebDriver browser;
	private String languageButtonXPath = "/html/body/div/div/div/div[1]/div/div[2]/div/div/div/div";
	private String chineseXPath = "/html/body/div/div/div/div[1]/div/div[2]/div/div/div[2]/div[1]";
	private String englishXPath = "/html/body/div/div/div/div[1]/div/div[2]/div/div/div[2]/div[2]";
	private String homeButtonXPath = "/html/body/div/div/div/div[1]/div/div[3]/ul/li[1]/a/h3";
	private String coursesButtonXPath = "/html/body/div/div/div/div[1]/div/div[3]/ul/li[2]/a/h3";
	private String aboutUsButtonXPath = "/html/body/div/div/div/div[1]/div/div[3]/ul/li[3]/a/h3";
	
	public Header(WebDriver browser) {
		this.browser = browser;
		
	}
	public WebDriver getBrowser() {
		return browser;
	}
	
	public WebElement getElement(String xPath) {
		By byXPath = byXpath(xPath);
		return getBrowser().findElement(byXPath);
	}
	
	private By byXpath(String xPath) {
		return By.xpath(xPath);
	}

	
	public WebElement getLanguageButton() {
		return getElement (languageButtonXPath);
	}
	
	public WebElement getChinese() {
		return getElement (chineseXPath);
	}
	public WebElement getEnglish() {
		return getElement (englishXPath);
	}
	
	public WebElement getHomeButton() {
		return getElement (homeButtonXPath);
	}
	
	public WebElement getCoursesButton() {
		return getElement (coursesButtonXPath);
	}
	public WebElement getAboutUsButton() {
		return getElement (aboutUsButtonXPath);
	}
	
}