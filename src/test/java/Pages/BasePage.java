package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class BasePage {
	
	public BasePage(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public BasePage(IOSDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
