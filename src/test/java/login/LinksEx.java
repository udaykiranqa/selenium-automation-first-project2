package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksEx {
	
	@Test
	public void linksVerification() {
		
		//launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		
		//Sync
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Step1: Open Google.com
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		//name
		driver.findElement(By.name("btnK")).click();
		
	}

}
