package guru99;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DrapandDrop {
	
	AndroidDriver driver;
	
	@BeforeTest
	
	public void setUp() throws MalformedURLException {
		
		
	File classpathRoot = new File (System.getProperty("user.dir"));
	
	File appDir = new File (classpathRoot, "/Apps");
	
	File app = new File (appDir, "com.mobeta.android.demodslv-0.5.0-3_APKdot.com.apk");
	
	
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("deviceName", "Neelu Verma");
	caps.setCapability("udid", "32085d4f88db71c1"); //Give Device ID of your mobile phone
	caps.setCapability("platformName", "Android");
	caps.setCapability("platformVersion", "6.0.1");
	caps.setCapability("appPackage", "com.appy.store.lite");
	caps.setCapability("appActivity", "com.appy.store.lite.MainActivity");
	caps.setCapability("noReset", "true");
	
	caps.setCapability("app", app.getAbsolutePath());	
	caps.setCapability("appPackage", "com.mobeta.android.demodslv");	
	caps.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
	
	driver = new AndroidDriver (new URL("http://0.0.0.0:4723/wd/hub"), caps);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	
	@Test
	
	public void drapdrop(){
		
		driver.findElementByName("Basic usage playground").click();
		WebElement ele1 = (WebElement) driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(2);
		WebElement ele2 = (WebElement) driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(5);
		
		TouchAction action = new TouchAction((MobileDriver) driver);
		
		action.longPress(ele1).moveTo(ele2).release().perform();
		
		 System.out.println("Element has been droped at destination successfully.");
				
	}
	
	 @AfterTest
	 public void End() {
	  // Quit
	  driver.quit();
	
	}

}
