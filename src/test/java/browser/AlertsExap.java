package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsExap {

	public static void main(String[] args) throws Exception {
		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Sync.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step2: Open Google.com
		driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html"); // 10 sec

		// Submit a Form.
		System.out.println("------- Execution Started -----------");
		// Enter some information.
		driver.findElement(By.name("Name")).sendKeys("SELENIUM");

		Thread.sleep(2000); // 2 sec wait.
		// Click on Checkbox.
		driver.findElement(By.name("subscribe")).click(); // Uncheck checkbox.
		Thread.sleep(2000); // 2 sec wait.
		driver.findElement(By.name("subscribe")).click(); // Check the checkbox.

		// Enter comments.
		driver.findElement(By.name("comments")).sendKeys("COMMENTS");

		// Handle Drop-down.
		// Select a value from drop-down.
		WebElement countries = driver.findElement(By.name("countries"));
		Select countryDropDown = new Select(countries);
		countryDropDown.selectByVisibleText("Albania");
		
		//click on radio button - Excellent!!
		driver.findElement(By.xpath("//*[@value='excellent']")).click();
		
		//Click on Submit button.
		driver.findElement(By.xpath("//*[@value='Submit']")).click();
		
		//Handle Alert/ pop-up.
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert(); //alert - popup.
		String alertText = alert.getText(); //read text from alert.
		System.out.println("alert Text is :" + alertText);
		alert.accept();  //accept.

		System.out.println("----- Execution complete ---------");
	}

}
