package testcases.blazedemo;

import static variables.blazedemo.UrlVariables.BASE_URL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BrowserSetting {
	
	public WebDriver BrowserSettings() {
		//driver
		WebdriverSettings wds = new WebdriverSettings();
		WebDriver driver = wds.driverSettings();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(BASE_URL);
		return driver;
	}

}
