import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorTest extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Appium interview question
		//driver.findElementByAndroidUIAutomator("attribute=("value")");
		//you need a backslash before the quotes if you use two double quotes
		
		//findElementByAndroidUIAutomator requires two sets of double quotes.
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Validate clickable feature for all options
		
		//driver.findElementByAndroidUIAutomator("new UISelector().property(value)");
		//prints out how many items are clickable...need to use plural
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
			
	}
}
