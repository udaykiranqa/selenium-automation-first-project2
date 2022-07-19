package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amaxon {
	
	public static void main(String[] args) {
		
		// 1. Open Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// sync
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//open site
		//driver.get("https://www.amazon.com/");
		
		//Enter - value into search box --CSS
		//driver.findElement(By.cssSelector("[id='twotabsearchtextbox']")).sendKeys("laptops");
		
		//Open facebook.
		driver.get("https://www.facebook.com/");
		
		//dynamic CSS
		driver.findElement(By.cssSelector("[id*='u_0_0_']")).click();
		
		
	}

}
