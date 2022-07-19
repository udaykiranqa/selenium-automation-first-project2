package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrivrMethodsEx {
	
	public static void main(String[] args) {
		
		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//step1: Open Google
		driver.get("https://www.google.com/");
		
		//step2: perform Google search - selenium
		driver.findElement(By.name("q")).sendKeys("selenium");
		//submit
		driver.findElement(By.name("btnK")).click();
			
		//verify Title - getTitle
		String expectedTitle="selenium - Google Search";
		String actualTitle= driver.getTitle(); //get title from application.
		
		System.out.println("expectedTitle : " + expectedTitle);
		System.out.println("actualTitle : " + actualTitle);
		
		//verify
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("PASS - Title does match");
			
		}else {
			System.out.println("TFAIL - itle does not match");
		}
		
		
		
		//
		
		
		
		
		
	}

}
