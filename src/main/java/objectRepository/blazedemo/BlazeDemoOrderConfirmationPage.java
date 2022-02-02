package objectRepository.blazedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazeDemoOrderConfirmationPage {

	WebDriver driver;

	@FindBy(xpath = "//td[text()='Id']/../td[2]")
	WebElement orderId;

	// constructor method
	public BlazeDemoOrderConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement confirmationId() {
		return orderId;
	}

}
