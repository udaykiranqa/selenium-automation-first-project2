package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseEvntsEx {
	
	public static void main(String[] args) throws Exception {
		
		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup(); // Setup browser driver.
		WebDriver driver = new ChromeDriver(); // selenium

		// Step2: Open Google.com
		driver.get("https://www.myntra.com/"); // google.com
		
		//Step3: Hover over Mens section.
		Actions uday = new Actions(driver);
		WebElement menSection = driver.findElement(By.xpath("//*[text()='Men' and @data-group='men']"));
		uday.moveToElement(menSection).perform();
		
		//Step4: Click on Sweaters.
		Thread.sleep(5000);

		driver.findElement(By.linkText("Sweaters")).click();
		
		
		
	}

}
