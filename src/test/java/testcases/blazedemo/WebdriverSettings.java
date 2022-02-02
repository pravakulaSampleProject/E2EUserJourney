package testcases.blazedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\apravallika\\git\\EF_Petals_SetUp\\EF-Petals_FrameWork\\ui_automation\\drivers\\chromedriver_96.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
