package browser;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyCreditcardsPageURLCiti {

	public static void main(String[] args) throws Exception {

		// Launch Browser - Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Sync.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step1: Open Google.com
		driver.get("https://officedepot.com/"); // 10 sec

		// Step2: Click on LInk - Credit Cards
		driver.findElement(By.linkText("Credit Cards")).click();
		
		//Verify the landing page - header text.
		
		String expectedHeaderText = "Compare Credit Cards";
		String actualText = driver.findElement(By.xpath("//h1[text()='Compare Credit Cards']")).getText();
		
		//verify header TEXT
		if (expectedHeaderText.equalsIgnoreCase(actualText)) {
			System.out.println("PASS - User landing on Credit cards page");
			
		}else {
			System.out.println("FAIL - User is not landing on Credit cards page");

		}
		
		//Step3: Click on - Apply Now button.
		driver.findElement(By.xpath("//a[@href='https://www.officedepot.com/business-credit-account-apply?cm_sp=credit_promotions-_-BUSINESS-ACCOUNT_apply-now_-_-&promo_name=credit_promotions&promo_id=credit_promotions-BUSINESS-ACCOUNT-apply-now&promo_creative=BUSINESS-ACCOUNT_apply-now'][normalize-space()='Apply Now']")).click();

		//Switch To new window (or) child window.
		//getWindow Handle
		String parentWindowId = driver.getWindowHandle();
		System.out.println("parent Window Id is : " + parentWindowId);
		
		//getWindow Handles
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println("all Window Ids are: " + allWindowIds);
		
		//Fetch --get - convert Set to List.
		List<String> allwindows = new ArrayList<String>(allWindowIds);
		String mainWindowId = allwindows.get(0);
		String newWindowId = allwindows.get(1);
		
		//Switch To ---New window.
		driver.switchTo().window(newWindowId);
		
       //Step4: Ensure url contains - citibankonline.com -- Child window.
		String URL = driver.getCurrentUrl();
		System.out.println("URL is : " + URL);
		
		//verify url - citi
		if (URL.contains("citibankonline.com")) {
			System.out.println("PASS - URL contains citi");
			
		}else {
			System.out.println("FAIL - URL does not contains citibank");
			
		}
		
		//Step5: Close browser- New tab -----Child window
		driver.close();
		
		//wait
		Thread.sleep(5000); //5 sec
		
		
		//Step6: Switch back to Main window.
        driver.switchTo().window(mainWindowId);
        
        //Step7: Close Main browser ----------||Parent||
        driver.close();
		
        
        //driver.quit();
		
	}

}
