import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragDropDemo extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		//CODE FOR DRAG AND DROP
		TouchAction t = new TouchAction(driver);
		t.longPress(driver.findElementById("io.appium.android.apis:id/drag_dot_1")).moveTo(driver.findElementById("io.appium.android.apis:id/drag_dot_3")).release().perform();
		
		
	}

}
