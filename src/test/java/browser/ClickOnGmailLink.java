package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnGmailLink {
	
	public static void main(String[] args) {
		
		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup();  //Setup browser driver.
		ChromeDriver driver = new ChromeDriver(); //selenium
				
		//Step2: Open Google.com
		driver.get("https://www.google.com"); // google.com
		
		//Step3: Click on GMAIL - Links // Linktext
		
		//driver.findElement(By.linkText("Gmail")).click();
		
		//partial Linktext
		driver.findElement(By.partialLinkText("Gma")).click();
		
	
		          
		
		
		
		
		
		
	}

}
