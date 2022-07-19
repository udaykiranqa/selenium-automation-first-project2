package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBokAccount {
	
	public static void main(String[] args) {
		
		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup();  //Setup browser driver.
		ChromeDriver driver = new ChromeDriver(); //selenium
				
		//Step2. Open Facebook.
		driver.get("https://www.amazon.com/");
		
		//enter value -- laptops //xpath - AND
		driver.findElement(By.xpath("//*[@class='nav-input nav-progressive-attribute' and @name='field-keywords']")).sendKeys("Laptops");
	}

}
