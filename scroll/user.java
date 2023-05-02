package scroll;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class user {
	
	
	public static void user1(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(507,1979)).release().perform();
	}
	public static void searchclick(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(992,215)).release().perform();
}
	
    public static void filterlist(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(430,480)).release().perform();
	}
    
    public static void close(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(992,196)).release().perform();
	}
    public static void alertpic(PerformsTouchActions driver) {
    	TouchAction action = new TouchAction(driver);
    	action.tap(PointOption.point(578, 450)).release().perform();
    }
    
}
