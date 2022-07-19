package browser;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CredicardsValication {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step1: 1. Open website
		driver.get("https://www.citi.com/");

		// Step2: Click on Credit cards link.
		driver.findElement(By.xpath("//app-lob-menu-version-a[@class='ng-star-inserted']//div//div[@class='flex-wrapper wrapper-text'][normalize-space()='Credit Cards']")).click();
		// Step3: Switch focus to New window --that is open
		// getwindowHandle --retuns single id of parent.
		String mainWinowId = driver.getWindowHandle();
		System.out.println("Main window Id: " + mainWinowId);

		// find all window ids
		// List
		Set<String> allwindowsIds = driver.getWindowHandles();
		int count = allwindowsIds.size();

		System.out.println("Windows Count: " + count);
		System.out.println("All window Ids: " + allwindowsIds);

		// convert Set into List type.
		List<String> windowIds = new ArrayList<String>(allwindowsIds);

		String mainWindowiD = windowIds.get(0);
		System.out.println(mainWindowiD);

		String newWindow = windowIds.get(1);
		System.out.println(newWindow);

		// Switch to New window.
		driver.switchTo().window(newWindow);

		// verify URL contains citi.com
		String URL = driver.getCurrentUrl();

		System.out.println(URL);
		// verify
		if (URL.contains("https://www.citi.com/")) {
			System.out.println("PASS - URL contains citi.com");
		} else {
			System.out.println("FAIL - URL contains doesn't citi.com");
		}

		// Step6. close Child window (new tab)
		driver.quit(); // new window

		// Step7: Close main window
	//	driver.switchTo().window(mainWinowId);
		//driver.close();

	}
}
