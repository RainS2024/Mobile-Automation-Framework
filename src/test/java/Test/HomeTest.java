package Test;

import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import Pages.HomePage;

public class HomeTest extends BaseTest{
	
	@Test
	public void firstTest() throws MalformedURLException, InterruptedException {
		AndroidDriver driver = (AndroidDriver) BaseTest.getDriver("android");
		
//		IOSDriver iosDriver =  (IOSDriver) BaseTest.getDriver("ios");
		HomePage hp = new HomePage(driver);
		hp.firstItem.click();
		Thread.sleep(2000);
		hp.image.click();
		Thread.sleep(2000);
		
		RemoteWebElement image = (RemoteWebElement) driver.findElement(AppiumBy.id("com.solodroid.solomerce:id/action_bar_root"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("mobile: doubleClickGesture", ImmutableMap.of("elementId", image.getId()));
		
		
		
	}

}
