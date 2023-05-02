package browserstock;

import org.openqa.selenium.support.PageFactory;

import scroll.touch;
import scroll.zoominandzoomout;
import scroll.zoomout;

public class zoom extends stack{
	
	
	public static void zoom1() throws InterruptedException {
		PageFactory.initElements(getDriver(), pom.class); 
		pom.tradingroom.click(); 
		Thread.sleep(2000);
		pom.option1.click();
		Thread.sleep(2000);
		pom.enterroom.click();
		Thread.sleep(2000);
		pom.alert.click();
		Thread.sleep(2000);
		pom.searchclick.click();
		Thread.sleep(2000);
		pom.search.sendKeys("trendy");
	    touch.swipe1toclick(getDriver());
		pom.filtersearchlist(getDriver());
		Thread.sleep(5000);
	     zoominandzoomout.zoomin(getDriver());
		 zoomout.zoomou(getDriver());
		
}
}