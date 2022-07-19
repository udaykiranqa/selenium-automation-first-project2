package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitExx {

	public static void main(String[] args) {

		// Step1: Open browser.
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Step2: implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step3: Open application.
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		// Step4: Click on Link --
		driver.findElement(By.xpath("//button[@id='alert']")).click();

		// Step5: Explicit wait.
		WebDriverWait wait = new WebDriverWait(driver, 10); // 5 sec
		wait.until(ExpectedConditions.alertIsPresent());

		// Step6: Handle the alert.
		driver.switchTo().alert().accept();

		
	}

}
