package browser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFRAMEEx {

	public static void main(String[] args) {

		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Sync.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open application.
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		// Handle iFrame - SwitchTo -1st approach.
		// driver.switchTo().frame(1); //1 means - 2nd frame.

		// 2nd approach:
		// driver.switchTo().frame("classFrame"); //Name or ID.

		// Click on NO FRAMES
		// driver.findElement(By.linkText("NO FRAMES")).click();

		// Click on Link - Actions
		// driver.findElement(By.linkText("Actions")).click();

		// 3rd approach.
		// WebElement thirdFrame =
		// driver.findElement(By.xpath("//*[@class='rightIframe']"));
		// driver.switchTo().frame(thirdFrame);
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		// collection --0-1-2 index
		System.out.println(iframes.size());
		
		driver.switchTo().frame(iframes.get(2));
		driver.findElement(By.linkText("NO FRAMES")).click();

	}

}
