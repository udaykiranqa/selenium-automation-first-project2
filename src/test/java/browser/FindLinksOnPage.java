package browser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLinksOnPage {
	
	public static void main(String[] args) {
		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Step2: Open amazon.com
		driver.get("https://www.amazon.in/"); 
		
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
	    int count = links.size();
	    System.out.println(count);
	    
	    for (int i = 0; i < count; i++) {
	    	String linkName = links.get(i).getText(); //Gmail
	    	
	    	if (!linkName.isEmpty()) { //! --Not
	    		System.out.println(linkName);
			}
		
		}
		
	}

}
