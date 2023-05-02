package browserstock;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class search extends stack{
	
	
	public static void search1() throws InterruptedException {
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
	
		PageFactory.initElements(getDriver(), pom.class);
		ArrayList<String> names = new ArrayList<String>();
	    names.add("kody");
	    names.add("tendy");
	    names.add("ko  u");
	    names.add("@13as");
	    names.add("lee");
	    names.add("lou@");

		for (int i = 0; i < names.size(); i++) {
			
				
				pom.search.sendKeys(names.get(i));
				Thread.sleep(10000);
				List<WebElement> result1 = getDriver().findElements(By.xpath("//android.view.View[2]/android.view.View/android.view.View"));   
				
				
				System.out.println(result1.size());
				if(result1.size()==0)
				{
				    System.out.println("no search result for trading romm");
				}else {
					 System.out.println("REsults are found as Expected for trading room");	
				}
	            
			pom.search.clear();
	    }
		Thread.sleep(2000);
		pom.exit(getDriver());
		Thread.sleep(2000);
		pom.ok.click();
	}

}
