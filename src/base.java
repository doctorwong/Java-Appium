import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;




public class base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//best practice for people who put this file in different folders
		File f = new File("src");
		
		//pull file name from source folder and saving it as fs
		File fs = new File(f, "ApiDemos-debug.apk");
		
		//Prerequisites:
		//Make sure your Appium server is started
		//Make sure your emulator is open
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		
		//What orientation you want to start your emulator, etc...
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		
		//127.0.0.1 is common to every windows machine as local host
		//Java.net
		//throws MalformedURLException
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
		//Infrastructure setup is the hardest thing to do in Appium. After that it is cakewalk
		
		//Connection and Session
		//Session takes 60 seconds to close
		//Close the connection and then start it again
		//You can also hit control+C to close the connection
		//might need to hit ctrl+C after starting appium
		
		
		//AndroidUIAutomator
		//How do I get the object name of a button?
		//Use UIAutomator Viewer tool to take a screenshot and get details about buttons
		//Firebug, dev tools, qtp
	}
		

		
		
		
		
		
		
		
		
		
		//My desired capabilities:
		//I want to open an emulator, Demo?
		
		//Appium Code
		
		//Capabilities: Android, iOS
		
		//Xyz App - 
		
		//connection step to server
		
		//Code
		

	}

