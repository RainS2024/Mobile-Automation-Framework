package Pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage extends BasePage {
	
	public HomePage(AndroidDriver driver) {
		super(driver);
	}
	public HomePage(IOSDriver driver) {
		super(driver);
	}
	
	
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(xpath = "(//android.widget.TextView[text(),'Samsung Galaxy S10 - Black'])[3]")
	public WebElement firstItem;
	
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(id = "com.solodroid.solomerce:id/product_image")
	public WebElement image;
	
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(id = "com.solodroid.solomerce:id/action_bar_root")
	public WebElement productImage;
	
	@AndroidFindBy(uiAutomator = "")
	public WebElement justforex;
	
	

}
