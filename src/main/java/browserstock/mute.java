package browserstock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class mute extends stack{



public static void mute1() throws InterruptedException {
	PageFactory.initElements(getDriver(), pom.class);
	Thread.sleep(2000);
	pom.homemodule.click();
	Thread.sleep(4000);
	pom.homefiltersearchlist(getDriver());
	Thread.sleep(5000);
	
    

	List<WebElement>result=getDriver().findElements(By.xpath("//android.widget.TextView[@text='Premium Video']"));
	if(result.size()==0) {
		pom.play(getDriver());
		 Thread.sleep(2000);
		  pom.play(getDriver());
		 
		  pom.speaker(getDriver());
			pom.exit(getDriver());
			 
		
    
} else{
	 pom.play(getDriver());
	 Thread.sleep(2000);
	  pom.play(getDriver());
	  pom.unmute1(getDriver()); 
		pom.exit(getDriver());
		
}
}

}