package browserstock;

import org.openqa.selenium.support.PageFactory;

import scroll.touch;

public class alerts extends stack {
	
	
	public static void alerts2() throws InterruptedException {
		PageFactory.initElements(getDriver(), pom.class);
	Thread.sleep(3000);
	 pom.alerthome.click();
	  touch.swipeUp(15, getDriver());
		Thread.sleep(2000);
		pom.search.sendKeys("ko");
	Thread.sleep(2000);
	   pom.filtersearchlist(getDriver());
	Thread.sleep(2000);
	  pom.bookmarkalerthome.click();
	  Thread.sleep(2000);
		pom.exitalert.click();
		Thread.sleep(2000);
		pom.search.clear();
	}


}
	