package browser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindNumberOfLinks {

	public static void main(String[] args) {

		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup(); // Setup browser driver.
		WebDriver driver = new ChromeDriver(); // selenium

		//wait- Sync (Selenium -- fast -----App - slow)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		// Step2: Open Google.com
		driver.get("https://www.amazon.com/"); // google.com
		
		//find number of Links ----??
		List<WebElement> links = driver.findElements(By.tagName("a")); //Links --a
	
		//count of Links
		int count = links.size();
	    System.out.println("Links of Amazon count is : " + count);
	    
	    //print Link name 1st or etc
	    for (int i = 0; i < count; i++) { //0+1 =1
	    	 
	    	if (!links.get(i).getText().isEmpty()) {
					    		
			    System.out.println(links.get(i).getText()); //get Link Name.

			}
	    	

		}
	   
	}

}
