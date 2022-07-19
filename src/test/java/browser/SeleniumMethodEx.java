package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumMethodEx {

	public static void main(String[] args) throws Exception {

		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Get 
		driver.get("https://www.google.com");
		
		//verify ---getTitle
		String expectedTitle="Google";
		String actualTitle = driver.getTitle(); //get the tile from application
		
		//verify
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("PASS - Title does match ");
		}else{
			System.out.println("FAIL - Title does not match ");

		}

		//step3: Search for Laptops
		driver.findElement(By.name("q")).sendKeys("Laptops");
		
		//getCurrentUrl
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//verify
		if (url.contains("google")) {
			System.out.println("PASS");
			
		}else {
			System.out.println("FAIl");
		}
		
		//Close vs Quit.
		//close / quit -- close the browser.
		
		//driver.close(); //current session
		//driver.quit(); //all the opened sessions by selenium webdriver.
		
		driver.findElement(By.linkText("Gmail")).click();
		
		Thread.sleep(10000); //10 sec (1 sec)
		
		//Navigation methods.
		
		driver.navigate().back();
		//wait
		Thread.sleep(2000); //2 sec 1000 msec =1 sec
		
		
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		//refresh
		driver.navigate().refresh();
		
	}

}
