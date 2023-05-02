package scroll;

import static java.time.Duration.ofMillis;
import static org.openqa.selenium.interactions.PointerInput.Kind.TOUCH;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class touch {
	
	
	 private final static PointerInput FINGER = new PointerInput(TOUCH, "finger");

	    public static void doSwipe(AppiumDriver driver, Point start, Point end, int duration) {
	        Sequence swipe = new Sequence(FINGER, 1)
	                .addAction(FINGER.createPointerMove(ofMillis(0), viewport(), start.getX(), start.getY()))
	                .addAction(FINGER.createPointerDown(LEFT.asArg()))
	                .addAction(FINGER.createPointerMove(ofMillis(duration), viewport(), end.getX(), end.getY()))
	                .addAction(FINGER.createPointerUp(LEFT.asArg()));
	        driver.perform(Arrays.asList(swipe));
	    }

	    public static void doTap(AppiumDriver driver, Point point, int duration) {
	        Sequence tap = new Sequence(FINGER, 1)
	                .addAction(FINGER.createPointerMove(ofMillis(0), viewport(), point.getX(), point.getY()))
	                .addAction(FINGER.createPointerDown(LEFT.asArg()))
	                .addAction(new Pause(FINGER, ofMillis(duration)))
	                .addAction(FINGER.createPointerUp(LEFT.asArg()));
	        
	        driver.perform(Arrays.asList(tap));
	    }

	
	
	

	public static void swipeUp(int numberOfTimes, AndroidDriver driver) {
		Dimension dimension = driver.manage().window().getSize();
		Point start = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.9));
		Point end = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.1));
		for (int i = 0; i < numberOfTimes; i++) {
		doSwipe(driver, start, end, 1000); // with duration 1s
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	
	public static void tap(AndroidDriver driver) {
		
		Dimension dimension = driver.manage().window().getSize();
		Point forTap = new Point((int)(dimension.width*0.5), (int)(dimension.height*0.9));
		doTap(driver, forTap, 200); //with duration 200ms
	}
	

	

	public static void swipeDown(int numberOfTimes, AndroidDriver driver) {
		Dimension dimension = driver.manage().window().getSize();

		Point start = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.2));
		Point end = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.8));
		for (int i = 0; i < numberOfTimes; i++) {
		doSwipe(driver, start, end, 1000); // with duration 1s
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	
	public static void swipeLeft(int numberOfTimes, AndroidDriver driver) {
		Dimension dimension = driver.manage().window().getSize();
		Point start = new Point((int) (dimension.width * 0.9), (int) (dimension.height * 0.5));
		Point end = new Point((int) (dimension.width * 0.1), (int) (dimension.height * 0.5));
		for (int i = 0; i < numberOfTimes; i++) {
		doSwipe(driver, start, end, 1000); // with duration 1s
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	
	public static void swipeRight(int numberOfTimes, AndroidDriver driver) {
		Dimension dimension = driver.manage().window().getSize();
		Point start = new Point((int) (dimension.width * 0.1), (int) (dimension.height * 0.5));
		Point end = new Point((int) (dimension.width * 0.8), (int) (dimension.height * 0.5));
		for (int i = 0; i < numberOfTimes; i++) {
		doSwipe(driver, start, end, 1000); // with duration 1s
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	
	
	//Tap to an element for 250 milliseconds
    
    
    public static void swipeUpAppium(int numberOfTimes, AppiumDriver driver) {
		Dimension dimension = driver.manage().window().getSize();
		Point start = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.9));
		Point end = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.1));
		for (int i = 0; i < numberOfTimes; i++) {
		doSwipe(driver, start, end, 1000); // with duration 1s
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

    public static void swipetoclick(PerformsTouchActions driver) {
    	TouchAction action = new TouchAction(driver);
    	Dimension size =((RemoteWebDriver) driver).manage().window().getSize();
    	int width=size.width;
    	int height=size.height;
    	int middleOfX=width/2;
    	int startYCoordinate= (int)(height*.6);
    	int endYCoordinate= (int)(height*.9);

    	    action.press(PointOption.point(middleOfX, startYCoordinate)) .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
    	            .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
    }
    public static void bookmark(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(559,2006)).release().perform();
	}
    public static void swipe1toclick(PerformsTouchActions driver) {
    	
    	TouchAction action = new TouchAction(driver);
    	Dimension size =((RemoteWebDriver) driver).manage().window().getSize();
    	int width=size.width;
    	int height=size.height;
    	int middleOfX=width/2;
    	int startYCoordinate= (int)(height*.3);
    	int endYCoordinate= (int)(height*.6);

    	    action.press(PointOption.point(middleOfX, startYCoordinate)) .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
    	            .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
   


}
}