package scroll;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class alert {
	public static void homealert(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(96,1979)).release().perform();
	}
	public static void alertfilter(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(588,542)).release().perform();
	}
	public static void alerback(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(92,192)).release().perform();
	}
	public static void bookmark(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(1003,196)).release().perform();
	}
}
