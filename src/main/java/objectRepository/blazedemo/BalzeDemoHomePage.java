package objectRepository.blazedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BalzeDemoHomePage {

	WebDriver driver;

	@FindBy(xpath = "//select[@name='fromPort']")
	WebElement fromPort;
	
	@FindBy(xpath = "//select[@name='toPort']")
	WebElement toPort;	

	@FindBy(xpath = "//input[contains(@class, 'btn-primary')]")
	WebElement btnSubmit;
	
	
	// constructor method
	public BalzeDemoHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement departureCityPath() {
		return fromPort;
	}

	public WebElement destinationCityPath() {
		return toPort;
	}
	
	public WebElement findFlightsPath() {
		return btnSubmit;
	}	
	
}
