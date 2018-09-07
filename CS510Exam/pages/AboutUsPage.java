package CS510Exam.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsPage extends BasePage {
	
	public AboutUsPage(WebDriver browser) {
		super(browser);
	}
	
	private String ourMissionXPath = "/html/body/div/div/div/span/div/div[2]/div/div/h1";
	private String biasForActionXPath = "/html/body/div/div/div/span/div/div[3]/div/p/b[1]/font";
	private String customerObsessionXPath = "/html/body/div/div/div/span/div/div[3]/div/p/b[2]/font";
	private String resultOrientedXPath = "/html/body/div/div/div/span/div/div[3]/div/p/b[3]/font";
	private String humorXPath = "/html/body/div/div/div/span/div/div[3]/div/p/b[4]/font";
	private String loveToShareXPath = "/html/body/div/div/div/span/div/div[3]/div/p/b[5]/font";
	private String honestyXPath = "/html/body/div/div/div/span/div/div[3]/div/p/b[6]/font";
	private String dataDrivenXPath = "/html/body/div/div/div/span/div/div[3]/div/p/b[7]/font";
	private String loveTheCommunityXPath = "/html/body/div/div/div/span/div/div[3]/div/p/b[8]/font";

	public WebElement getElement(String xPath) {
		By byXPath = byXpath(xPath);
		return getBrowser().findElement(byXPath);
	}
	
	private By byXpath(String xPath) {
		return By.xpath(xPath);
	}
	
	public void WaitForPageLoad() {
		WaitForPageLoad(byXpath(ourMissionXPath));
	}
	
	public WebElement getBiasForAction() {
		return getElement(biasForActionXPath);
	}
	public WebElement getCustomerObsession() {
		return getElement(customerObsessionXPath);
	}
	public WebElement getResultOriented() {
		return getElement(resultOrientedXPath);
	}
	public WebElement getHumor() {
		return getElement(humorXPath);
	}
	public WebElement getLoveToShare() {
		return getElement(loveToShareXPath);
	}
	public WebElement getHonesty() {
		return getElement(honestyXPath);
	}
	public WebElement getDataDriven() {
		return getElement(dataDrivenXPath);
	}
	public WebElement getLoveTheCommunity() {
		return getElement(loveTheCommunityXPath);
	}
	
	
}