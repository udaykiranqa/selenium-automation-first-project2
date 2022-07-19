package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronization {

	public static void main(String[] args) {

		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Sync.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step2: Open Google.com
		driver.get("https://www.facebook.com/"); // 10 sec

		// Step3: click on Create account button

		driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click(); // 10 sec

		//Explicit wait.
		
		// Step4: Enter firstname as - Uday
		driver.findElement(By.name("firstname")).sendKeys("Uday"); //10 sec
		
	
	}

}
