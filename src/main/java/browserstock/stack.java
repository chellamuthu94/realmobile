package browserstock;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;
  
public class stack {
	static AndroidDriver driver = null;
public static DesiredCapabilities de = new DesiredCapabilities();
	

	@SuppressWarnings("deprecation")
	@Test
	
	@Parameters({"browser"})
	public void test(String browser) throws InterruptedException, IOException {
		
		
		
		
	
	if (browser.contentEquals("samsung")) {
    
		de.setCapability("platformName", "ANDROID");
		de.setCapability("platformVersion", "13");
	    de.setCapability("udid", "192.168.0.132:5555");
	    de.setCapability("deviceName", "Galaxy S20 FE 5G");     
     
   //192.168.0.132:5555
	}
	else if(browser.contentEquals("googlepixel")) {
		de.setCapability("platformName", "android");
		de.setCapability("platformVersion", "13.0");
	     de.setCapability("deviceName", "Google Pixel 7 Pro");  
	    
		}
	else if(browser.contentEquals("oneplus")) {
de.setCapability("platformName", "android");
de.setCapability("platformVersion", "11.0");
de.setCapability("deviceName", "OnePlus 9");  
	     
	   
		}
	de.setCapability("appPackage", "com.bellesoft.stprotradingroom");
	de.setCapability("appActivity", "com.bellesoft.stprotradingroom.MainActivity");
	de.setCapability("databaseEnabled", false);
    URL url = new java.net.URL(" http://0.0.0.0:4723/wd/hub ");
	driver= new AndroidDriver(url,de);

 //driver= new AndroidDriver(new URL(url),de);
PageFactory.initElements(driver, pom.class);
	
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

   //pom.allow1.click();
   pom.username.sendKeys("roomtest1@simplertrading.com");
   //pom.touch.click();

  pom.password.sendKeys("4IW6i8vINHxWD@1upABBOqxG");
 // pom.touch.click();

 pom.login.click();
 homepage.homepage1();
 
}
	
public static AndroidDriver getDriver()
	{
		
	    return driver;
	}	

	
}