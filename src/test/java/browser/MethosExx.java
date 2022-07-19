package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethosExx {
	
	public static void main(String[] args) throws Exception {
		
		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Step2: Open Google.com
		driver.get("https://www.google.com/"); //loadeded enough.

		//Step3: Click on Gmail Link.
		driver.findElement(By.linkText("Gmail")).click();
		
		//Navigation commands
		//navigate
		//driver.navigate().to("https://www.amazon.com/");
		
		//Step4: Navigate Back
		driver.navigate().back();
		//Step4: Navigate forward
		Thread.sleep(5000);  // 5 sec
		driver.navigate().forward();
		
		//naviage back and forth again
		driver.navigate().back();
		Thread.sleep(5000);  // 5 sec //hard wait.
		driver.navigate().forward();
		
		Thread.sleep(5000);  // 5 sec
		 //10 sec (10 sec -----30 sec)
		
		//refresh
		driver.navigate().refresh(); // f5 --refresh
		
		// I go to traffic ---- 60 sec (5 sec)	
	}

}
