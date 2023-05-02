package scroll;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class tap {
	 public static void tradingroom(PerformsTouchActions driver) {
	    	TouchAction action = new TouchAction(driver);
	    	action.tap(PointOption.point(342,1926)).release().perform();
	    } 
	    

	public static void option(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(427,457)).release().perform();
	} 
	public static void enterroom(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(500,1145)).release().perform();
	}
	
	public static void alerttab(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(234,1982)).release().perform();
	}
	
	
	
	
	public static void filterlist(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(430,480)).release().perform();
	}
	public static void close(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(992,196)).release().perform();
	}
	public static void files(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(653,1918)).release().perform();
	}
	public static void schedule(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(811,1929)).release().perform();
	}
	
	
	
}
