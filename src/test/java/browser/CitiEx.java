package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CitiEx {
	public static void main(String[] args) {

		// Demo - getCurrentUrl

		// Step1: Open browser

		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.citi.com/");

		// Step2: Get URL from Application.
		String URL = driver.getCurrentUrl(); // get URL from application.

		System.out.println("actual URL : " + URL);
		
		// Verify URL contains citi.com
		if (URL.contains("citi.com/")) {
			System.out.println("PASS");

		} else {
			System.out.println("FAIL");
		}
		
		//close browser
		driver.close(); //driver.quit();
		
	}
}
