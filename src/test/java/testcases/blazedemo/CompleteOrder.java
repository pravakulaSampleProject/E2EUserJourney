package testcases.blazedemo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.List;

import objectRepository.blazedemo.BalzeDemoHomePage;
import objectRepository.blazedemo.BlazeDemoBillingAddressPage;
import objectRepository.blazedemo.BlazeDemoChooseFlightPage;
import objectRepository.blazedemo.BlazeDemoOrderConfirmationPage;

import testcases.blazedemo.BrowserSetting;

import org.openqa.selenium.support.ui.Select;



import static variables.blazedemo.UserVariables.*;

public class CompleteOrder {

	
	@Test
	public void endToEndOrder() {

		BrowserSetting bs = new BrowserSetting();

		WebDriver driver = bs.BrowserSettings();

		selectDepartureCityToTravel(driver, "Boston");
		selectDestinationCityToTravel(driver, "Rome");
		submit(driver);
		chooseFlight(driver, 2);
		fillBillingAddress(driver);
		readOrderId(driver);
	}

	private void selectDepartureCityToTravel(WebDriver driver, String value) {

		// home page access
		 BalzeDemoHomePage demo = new BalzeDemoHomePage(driver);
		Actions a = new Actions(driver);
		WebElement city = demo.departureCityPath();
		a.moveToElement(city).click().build().perform();
		Select selectWebelement = new Select(city);
		List<WebElement> allOptions = selectWebelement.getOptions();
		for (WebElement option : allOptions) {
			if (option.isEnabled() && option.getText().trim().equals(value)) {
				option.click();			
				break;
			}
		}

	}

	private void selectDestinationCityToTravel(WebDriver driver, String value) {
		// log in
		// home page access
		 BalzeDemoHomePage demo = new BalzeDemoHomePage(driver);
		Actions a = new Actions(driver);
		WebElement city = demo.destinationCityPath();
		a.moveToElement(city).click().build().perform();
		Select selectWebelement = new Select(city);
		List<WebElement> allOptions = selectWebelement.getOptions();
		for (WebElement option : allOptions) {
			if (option.isEnabled() && option.getText().trim().equals(value)) {
				option.click();				
				break;
			}
		}

	}

	private void submit(WebDriver driver) {
		 BalzeDemoHomePage demo = new BalzeDemoHomePage(driver);
		WebElement btnSubmit = demo.findFlightsPath();
		Actions ac = new Actions(driver);// creating Actions class's object to take actions
		ac.moveToElement(btnSubmit).click().build().perform();
	}

	private void chooseFlight(WebDriver driver, int index) {
		 BlazeDemoChooseFlightPage choose = new BlazeDemoChooseFlightPage(driver);
		WebElement flightBtn = choose.btnChooseFlight();
		Actions ac = new Actions(driver);
		ac.moveToElement(flightBtn).click().build().perform();
	}

	private void fillBillingAddress(WebDriver driver) {
		BlazeDemoBillingAddressPage address = new BlazeDemoBillingAddressPage(driver);		
		Actions ac = new Actions(driver);
		address.passenger_name().sendKeys(NAME);
		address.passenger_address().sendKeys(ADDRESS);
		address.passenger_city().sendKeys(CITY);
		address.passenger_state().sendKeys(STATE);
		address.passenger_zipCode().sendKeys(ZIPCODE);
		selectCardTypeToTravel(driver, "Visa");
		address.credit_cardNumber().sendKeys(CARD_NUMBER);
		address.credit_expirtyMonth().sendKeys(CARD_MONTH);
		address.credit_expiryYear().sendKeys(CARD_YEAR);
		address.credit_NameOnCard().sendKeys(NAME_ON_CARD);
		address.submitDetails().click();
	}

	private void selectCardTypeToTravel(WebDriver driver, String value) {
		BlazeDemoBillingAddressPage address = new BlazeDemoBillingAddressPage(driver);		
		Actions a = new Actions(driver);
		WebElement type = address.credit_cardType();
		a.moveToElement(type).click().build().perform();
		Select selectWebelement = new Select(type);
		List<WebElement> allOptions = selectWebelement.getOptions();
		for (WebElement option : allOptions) {
			if (option.isEnabled() && option.getText().trim().equals(value)) {
				option.click();				
				break;
			}
		}

	}

	private void readOrderId(WebDriver driver) {
		BlazeDemoOrderConfirmationPage orderPage = new BlazeDemoOrderConfirmationPage(driver);
		WebElement element = orderPage.confirmationId();
		String value = element.getText().trim();
		System.out.println("Order Confirmation Id:" + value);
	}

}
