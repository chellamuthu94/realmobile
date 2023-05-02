package browserstock;

import org.openqa.selenium.support.PageFactory;
import scroll.touch;

public class homepage extends stack{
	
	

	public static void homepage1 () throws InterruptedException  {
		PageFactory.initElements(getDriver(), pom.class);
		Thread.sleep(6000);
	touch.swipetoclick(getDriver());
	pom.search.sendKeys("pus");	
	pom.filterclick.click();
	Thread.sleep(2000);
	pom.deselect.click();
	Thread.sleep(2000);
	pom.option.click();
	Thread.sleep(2000);
	pom.apply.click();
	Thread.sleep(2000);
	pom.filterclick.click();
	Thread.sleep(2000);
	pom.select.click();
	Thread.sleep(2000);
	pom.option.click();
	Thread.sleep(2000);
  //  touch.bookmark(getDriver());
pom.apply.click();
Thread.sleep(2000);
touch.swipeUp(4, getDriver());
	}


	
	

	

	

	

}
