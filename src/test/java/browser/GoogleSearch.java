package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	@Test(groups="sanity")
	public void googleSearch() {
		
		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup();  //Setup browser driver.
		ChromeDriver driver = new ChromeDriver(); //selenium
				
		//Step2. Open Google.
		driver.get("https://www.google.com/");
		
		//Step3: Enter - Laptops keyword in Search box.
		//xpath
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Laptops");
		
		
	}
}
