import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class swipeDemo extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		TouchAction t = new TouchAction(driver);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		
		
		//you can not use XPath if there are special characters in the class name
		
		//driver.findElementByAndroidUIAutomator("content-desc(\"9\")").click();
		
		//xpath with a star: take any tag name
		driver.findElement(By.xpath("//*[@content-desc='9']")).click();
		
		//with swipes, write down how you would do it manually first
		
		//CODE FOR SWIPE ACTION
		t.press(driver.findElement(By.xpath("//*[@content-desc='15']"))).waitAction(Duration.ofMillis(2000)).moveTo(driver.findElement(By.xpath("//*[@content-desc='45']"))).release().perform();
		
		



	}

}
