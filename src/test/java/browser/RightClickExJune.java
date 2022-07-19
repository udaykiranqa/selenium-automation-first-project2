package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickExJune {
	
	public static void main(String[] args) {
		//open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// step1: open application.
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	
        //Step2: Right click on element.
		WebElement buttonRightClick = driver.findElement(By.xpath("//*[text()='right click me']"));
		
		Actions action = new Actions(driver);
		action.contextClick(buttonRightClick).perform();
		
		//Step3: Click on --Copy option.
		driver.findElement(By.xpath("//*[text()='Copy']")).click();
		
	    
		
		
	}

}
