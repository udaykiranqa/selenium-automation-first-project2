package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcplicitWaitExmp {

	public static void main(String[] args) throws Exception {
		// Step1: Open browser.
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Step2: implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step3: Open application.
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		// Step4: Click on Link --
		driver.findElement(By.id("alert")).click();
		
		//ExplicitWait (WebDriverWait).
		WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
		wait.until(ExpectedConditions.alertIsPresent()); //0.5 polling
		
		//Step5: Handle the Alert --
		Thread.sleep(2000); //2 sec
		driver.switchTo().alert().accept(); //OK button //500 m.sec
		//driver.switchTo().alert().dismiss(); //Cancel button

	}

}
