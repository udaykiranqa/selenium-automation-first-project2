package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {

	public static void main(String[] args) {

		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Step2: Open amazon.com
		driver.get("https://www.amazon.com/"); 

		//step3: enter any input in search box.
		driver.findElement(By.cssSelector("[id='twotabsearchtextbox']")).sendKeys("Laptops");


	}

}
