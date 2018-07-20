import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class KeyEvents extends base {
	
	

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		System.out.print(driver.getOrientation());
		System.out.println(driver.isLocked());
		
		//hides the keyboard
		//driver.hideKeyboard();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		visibilityWaitOfElement(driver, 15, driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']"));
		driver.pressKeyCode(AndroidKeyCode.BACK);
	}

	private static void visibilityWaitOfElement(AndroidDriver<AndroidElement> driver, int i,
			AndroidElement findElementByXPath) {
		// TODO Auto-generated method stub
		
	}
	
	public static WebElement visibilityWaitOfElement(
            AndroidDriver<AndroidElement> driver,
 int timeoutInSeconds, WebElement element) {
     return new FluentWait<>(driver).
             withTimeout(timeoutInSeconds, TimeUnit.SECONDS).
             pollingEvery(500, TimeUnit.MILLISECONDS).
             ignoring(NotFoundException.class).ignoring(NoSuchElementException.class).
             until(ExpectedConditions.visibilityOf(element));
 }


}
