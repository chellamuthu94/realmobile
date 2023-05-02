package scroll;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class settingtap {
	public static void setting(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(992,1922)).release().perform();
	}
	public static void pushnotification(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(907,530)).release().perform();
	}
	public static void audio(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(903,788)).release().perform();
	}
	public static void video(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(903,926)).release().perform();
	}
	public static void exitroom(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(81,215)).release().perform();
	}
	public static void ok(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(822,1176)).release().perform();
	}
	public static void filter(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(992,192)).release().perform();
	}
	
	public static void deselect(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(888,357)).release().perform();
	}
	
	public static void optionvideo(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(980,515)).release().perform();
	}
	
	public static void select(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(565,357)).release().perform();
	}
	
	
	public static void apply(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(515,1914)).release().perform();
	}
	
}
