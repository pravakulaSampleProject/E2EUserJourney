package objectRepository.blazedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazeDemoChooseFlightPage {

	WebDriver driver;

	@FindBy(xpath = "(//input[contains(@class, 'btn-small')])[2]")
	WebElement chooseFlightBtn;	
	

	// constructor method
	public BlazeDemoChooseFlightPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement btnChooseFlight() {
		return chooseFlightBtn;
	}
	
}
