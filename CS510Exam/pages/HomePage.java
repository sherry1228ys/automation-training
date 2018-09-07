package CS510Exam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	private String imageXPath = "/html/body/div/div/div/span/div/div[1]/section";
	
	
	public HomePage(WebDriver browser) {
		super(browser);
		
	}
	

	public void WaitForPageLoad() {
		WaitForPageLoad(getImageXpathBy());
	}
	
	private By getImageXpathBy() {
		return By.xpath(imageXPath);
	}
	
} 


