package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	
	public static void main(String[] args) {
		
		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//wait --smart wait - Implicit wait.
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//step1 : access the site 
		driver.get("https://www.facebook.com/"); //10 sec
		
		//Step2: click on Create account button. //10 sec
		driver.findElement(By.xpath("//*[contains(@id, 'u_0_0_')]")).click();
	
		//step3: enter first name - Uday //10 sec
		driver.findElement(By.name("firstname")).sendKeys("Uday");
		
		
	}

}
