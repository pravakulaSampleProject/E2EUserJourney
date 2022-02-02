package objectRepository.blazedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazeDemoBillingAddressPage {
	
	WebDriver driver;
	
	@FindBy(name="inputName")
	WebElement name;
	
	@FindBy(id="address")
	WebElement address;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="state")
	WebElement state;
	
	@FindBy(id="zipCode")
	WebElement zipCode;	
	
	@FindBy(xpath = "//select[@name='cardType']")
	WebElement cardType;	
	
	@FindBy(id="creditCardNumber")
	WebElement cardNumber;
	
	@FindBy(id="creditCardMonth")
	WebElement expirtyMonth;
	
	@FindBy(id="creditCardYear")
	WebElement expiryYear;
	
	@FindBy(id="nameOnCard")
	WebElement NameOnCard;
	
	@FindBy(xpath = "//input[contains(@value, 'Purchase Flight')]")
	WebElement btnSubmit;
			
	

	// constructor method
	public BlazeDemoBillingAddressPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement passenger_name() {
		return name;
	}
	
	public WebElement passenger_address() {
		return address;
	}
	
	public WebElement passenger_city() {
		return city;
	}
	
	public WebElement passenger_state() {
		return state;
	}
	
	public WebElement passenger_zipCode() {
		return zipCode;
	}
	
	public WebElement credit_cardType() {
		return cardType;
	}	
	
	public WebElement credit_cardNumber() {
		return cardNumber;
	}
	
	public WebElement credit_expirtyMonth() {
		return expirtyMonth;
	}
	
	public WebElement credit_expiryYear() {
		return expiryYear;
	}
	
	public WebElement credit_NameOnCard() {
		return NameOnCard;
	}
	
	public WebElement submitDetails() {
		return btnSubmit;
	}

}
