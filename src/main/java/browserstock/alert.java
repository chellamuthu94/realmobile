package browserstock;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class alert extends stack{
	
	
	
public static void alert1() throws InterruptedException {
	 PageFactory.initElements(getDriver(), pom.class);
      Thread.sleep(2000);
	    pom.classes.click();
		Thread.sleep(2000);
		pom.internal.click();
		Thread.sleep(2000);
		pom.enterroom.click();
		Thread.sleep(2000);
		pom.alert.click();
		Thread.sleep(4000);
		
		
	   getDriver().findElement(By.xpath("//android.widget.EditText[@checkable='false']")).sendKeys("hi test");
	 Thread.sleep(2000);
	getDriver().findElement(By.xpath("//android.view.View[2]/android.widget.Button")).click();
		
Thread.sleep(2000);
pom.exitroom.click();
Thread.sleep(2000);
pom.ok.click();
Thread.sleep(2000);
pom.alerthome.click();

Thread.sleep(4000);
pom.filtersearchlist(getDriver());
Thread.sleep(2000);
String we=getDriver().findElement(By.xpath("//android.widget.TextView[@index='2']")).getText();
String test1="hi test";
assertEquals(we,test1);
Thread.sleep(2000);
pom.exit(getDriver());
	
		
		Thread.sleep(2000);
		pom.tradingroom.click(); 
		Thread.sleep(2000);
		pom.option1.click();
		Thread.sleep(2000);
		pom.enterroom.click();
		Thread.sleep(2000);
		pom.alert.click();
		Thread.sleep(5000);
		pom.filtersearchlist(getDriver());
		
		String we1=getDriver().findElement(By.xpath("//android.widget.TextView[@index='2']")).getText();
		assertEquals(we1,we1);  
		Thread.sleep(2000);
		pom.exit(getDriver());
		Thread.sleep(2000);
		pom.exit(getDriver());
		Thread.sleep(2000);
		pom.ok1.click();
	}

}
