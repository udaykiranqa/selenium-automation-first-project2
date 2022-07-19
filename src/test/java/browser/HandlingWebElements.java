package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebElements {

	public static void main(String[] args) {

		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup(); // Setup browser driver.
		WebDriver driver = new ChromeDriver(); // selenium

		// Step2: Open Google.com
		driver.get("http://softwaretesting-guru.blogspot.com/p/main-page.html"); // google.com

		// step3: click on Link - Selenium Practice page.
		driver.findElement(By.linkText("Selenium Practice page")).click();

		// Submit form.
		driver.findElement(By.name("Name")).sendKeys("Computers");

		// checkbox
		driver.findElement(By.name("subscribe")).click(); // uncheck
		driver.findElement(By.name("subscribe")).click(); // checked.

		// comments -textbox
		driver.findElement(By.name("comments")).sendKeys("COMMENTS");

		// drop down-
		Select countryDropDown = new Select(driver.findElement(By.name("countries")));
		// countryDropDown.selectByVisibleText("Afganistain");
		countryDropDown.selectByIndex(3);

		// computers drop down
		Select computerDropDown = new Select(driver.findElement(By.name("computerbrands")));

		// deselect
		computerDropDown.deselectByVisibleText("DELL");
		
		//select
		computerDropDown.selectByVisibleText("IBM");
		computerDropDown.selectByVisibleText("HP");
		computerDropDown.selectByVisibleText("Sony");
		
		//radio button --button
		driver.findElement(By.xpath("//*[@value='excellent']")).click();
		
		//Submit--Click
		driver.findElement(By.xpath("//*[@value='Submit']")).click();
		

	}

}
