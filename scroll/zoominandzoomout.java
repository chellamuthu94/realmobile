package scroll;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.android.AndroidDriver;

public class zoominandzoomout {
	
	public static void zoomin(AndroidDriver driver){
		
		
	
	 WebElement ele01 = driver.findElement(By.xpath("//android.widget.Image[@text='54QTxTS']"));

     //Get the centre of the element on the horizontal axis
     int centerX = ele01.getRect().x + (ele01.getSize().width/2);
     int centerY = ele01.getRect().y + (ele01.getSize().height/2);
System.out.println(centerX);
System.out.println(centerY);
     //Determine our movement in the pixels on the horizontal axis
     int xMovement = 300;

   //Set the starting position for both fingers
     //Don't start at the exact center move x pixels to the left/right from the center
     int finger1Start = centerX - xMovement;
     int finger2Start = centerX + xMovement;

     //Set the end position for the both fingers we already moved Xpx from the center to start, now Xpx again to the left/right
     int finger1End  = centerX - (2*xMovement);
     int finger2End  = centerX + (2*xMovement);


     //Finger 1
     //Type of Pointer Input
     PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH,"finger1");
     //Creating Sequence object to add actions
     Sequence swipe01 = new Sequence(finger1,1);
     //Move finger into starting position
     swipe01.addAction(finger1.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(),finger1Start,centerY));
     //Finger comes down into contact with screen
     swipe01.addAction(finger1.createPointerDown(0));
     //Finger moves to end position
     swipe01.addAction(finger1.createPointerMove(Duration.ofMillis(500),
             PointerInput.Origin.viewport(),finger1End, centerY));
     //Get up Finger from Screen
     swipe01.addAction(finger1.createPointerUp(0));


     //Finger 2
     //Type of Pointer Input
     PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH,"finger2");
     //Creating Sequence object to add actions
     Sequence swipe02 = new Sequence(finger2,1);
     //Move finger into starting position
     swipe02.addAction(finger2.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(),finger2Start,centerY));
     //Finger comes down into contact with screen
     swipe02.addAction(finger2.createPointerDown(0));
     //Finger moves to end position
     swipe02.addAction(finger2.createPointerMove(Duration.ofMillis(500),
             PointerInput.Origin.viewport(),finger2End, centerY));
     //Get up Finger from Screen
     swipe02.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

     //Perform the actions
     driver.perform(Arrays.asList(swipe01,swipe02));

     try {
         Thread.sleep(3000);
     }catch (Exception ex){
         ex.printStackTrace();
     }

}
}