package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameExx {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// sync
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// maximize
		driver.manage().window().maximize();

		// step1: open application
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		// Handle iframe --Method#1 -------by index
		//driver.switchTo().frame(1);
		
		//method # 2     -----------------by using Name or Id.
		// driver.switchTo().frame("packageFrame");

		//Method-3   -------WebElement
		WebElement thirdFrame = driver.findElement(By.className("rightIframe"));
		driver.switchTo().frame(thirdFrame);
		
		//wait
		Thread.sleep(3000);
		
		// Step2: Click on Link ---Actions
		// driver.findElement(By.linkText("Actions")).click();
		
		//Click on - NO FRAMES (3rd frame)
		driver.findElement(By.linkText("NO FRAMES")).click();
		
		

	}

}
