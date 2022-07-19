package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowsers {
	public static void main(String[] args) {
		
		//Open Chrome Rbrowser.
		String browser = "edge";
		WebDriver driver=null;
		
		if (browser=="Chrome") {
			// Step1: Launch Browser - Chrome
			WebDriverManager.chromedriver().setup();  //Setup browser driver.
			driver = new ChromeDriver(); //selenium
							
			//Step2: Open amazon.com
			driver.get("https://www.amazon.com/"); 
			
		}else if (browser=="Firefox") {
			// Step1: Launch Browser - Chrome
			WebDriverManager.firefoxdriver().setup();  //Setup browser driver.
			driver = new FirefoxDriver(); //selenium
							
			//Step2: Open amazon.com
			driver.get("https://www.amazon.com/"); 
			
		}else if (browser=="edge") {
			// Step1: Launch Browser - Chrome
			WebDriverManager.edgedriver().setup();  //Setup browser driver.
			driver = new EdgeDriver(); //selenium
							
			//Step2: Open amazon.com
			driver.get("https://www.amazon.com/"); 
			
		}else{
			System.out.println("Browser is not valid");
		}
		
		
		
		
		
		
		
	}

}
