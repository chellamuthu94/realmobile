package browserstock;

import org.openqa.selenium.support.PageFactory;

public class filesdownloadvalidation extends stack{
	
	
	public static void files1() throws InterruptedException {
		PageFactory.initElements(getDriver(), pom.class);
		Thread.sleep(2000);
		pom.tradingroom.click(); 
		Thread.sleep(2000);
		pom.option1.click();
		Thread.sleep(2000);
		pom.enterroom.click();
		Thread.sleep(2000);
		pom.files.click();
		Thread.sleep(4000);
		pom.downloadlink.click();
		Thread.sleep(2000);
		pom.allow.click();
		Thread.sleep(4000);
	String test=pom.completd.getText();
	System.out.println(test);
	Thread.sleep(2000);
		if (test.contentEquals("Download Complete") ) {
			System.out.println("files completed");
			
		}else {     
			System.out.println("files not completed");
		}
		Thread.sleep(2000);
		pom.ok1.click();
		Thread.sleep(2000);
		pom.exit(getDriver());
		Thread.sleep(2000);
		pom.ok.click();
	}


}
