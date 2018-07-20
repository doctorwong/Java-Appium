import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class basics extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//automatically executes "Capabilities" 
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//run as Java Application
		
		//xpath id className, androidUIautomator
		// xpath Syntax:
		// //tagName[@attribute = 'value']
		// class in uiAutomater is tagName
		//use unique identifiers
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text = '3. Preference dependencies']").click();
		
		//here Id is synonymous with resource-id in UI-Automator Viewer
		driver.findElementById("android:id/checkbox").click();
		
		//will move control into the second option
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		
		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		
		//findElements finds all results; follow up with get to select the one you want
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
		//how to click, how to send keys
		
		
		//to use the UIAutomatorViewer, go to:
		//C:\Users\wwong\AppData\Local\Android\Sdk\tools\bin
		

	}

}
