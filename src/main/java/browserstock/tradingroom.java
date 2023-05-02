package browserstock;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class tradingroom  extends stack {

	
public static  void  test1() throws InterruptedException, IOException {
	PageFactory.initElements(getDriver(), pom.class);
	Thread.sleep(2000);
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
	pom.search.sendKeys("sam");
	Thread.sleep(2000);
	pom.filtersearchlist(getDriver());
		
		Thread.sleep(4000);
		pom.copylink(getDriver());
		Thread.sleep(2000);
	    pom.exit(getDriver());
		

		 PageFactory.initElements(getDriver(), pom.class); 
		 Thread.sleep(2000);
	     pom.usertab.click();
	
	
	
		 

		 PageFactory.initElements(getDriver(), pom.class); 
		 Thread.sleep(2000);
		 pom.searchclick.click();
		 Thread.sleep(2000);
		 pom.search.sendKeys("da");
		 
		pom.filtersearchlist(getDriver());
		

	
		 PageFactory.initElements(getDriver(), pom.class); 
		 Thread.sleep(4000);
		pom.closetab(getDriver());
		
	
		 PageFactory.initElements(getDriver(), pom.class); 
		 Thread.sleep(2000);
		 pom.files.click();
		
		 

		 PageFactory.initElements(getDriver(), pom.class);
		 Thread.sleep(2000);
		pom.schedule.click();
	
		pom.seting.click();
		Thread.sleep(2000);
		pom.pushnotification.click();
		pom.audio.click();
		pom.video.click();
		
		pom.exitroom.click();
		Thread.sleep(2000);
		pom.ok.click();
	}

}
