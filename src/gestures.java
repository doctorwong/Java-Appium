import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.lang.Thread;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class gestures extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODOAndroidElementd method stub
		
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		//driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Tap
		//use Touchactions if you need to perform a sequence of actions
		
		
		//simulating a tap
		TouchAction t = new TouchAction(driver);
		t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//long press
		t.longPress(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).release().perform();
		System.out.println(driver.findElementById("android:id/title").getText());
		
		//Tap, Press, and Release
	}

}
