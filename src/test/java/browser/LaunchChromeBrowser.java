package browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup(); //Chrome
		
		//ChromeDriver uday = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver uday = new FirefoxDriver();
		
		//Step1: Open Chrome browser -amazon.com.
		uday.get("https://www.amazon.com/"); // open browser.
		
		//Step2: Close Browser.
	//	uday.close(); //close browser.
		
		//drop-down xyz
		
		
	}
	

}
