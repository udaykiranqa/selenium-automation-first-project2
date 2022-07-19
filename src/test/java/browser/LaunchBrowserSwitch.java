package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowserSwitch {
	
	public static void main(String[] args) {
		
		//declaration.
		WebDriver driver=null;
		String browser = "firefox";
		
		//methods -- switch
		  switch(browser) {
		  
		  case "chrome":
				WebDriverManager.chromedriver().setup();  //Setup browser driver.
				driver = new ChromeDriver(); //selenium
								
				//Step2: Open amazon.com
				driver.get("https://www.amazon.com/"); 
			  break;
			  
		  case "firefox":
			  
				// Step1: Launch Browser - Chrome
				WebDriverManager.firefoxdriver().setup();  //Setup browser driver.
				driver = new FirefoxDriver(); //selenium
								
				//Step2: Open amazon.com
				driver.get("https://www.amazon.com/"); 
				break;
		  
		  case "edge":
			// Step1: Launch Browser - Chrome
				WebDriverManager.edgedriver().setup();  //Setup browser driver.
				driver = new EdgeDriver(); //selenium
								
				//Step2: Open amazon.com
				driver.get("https://www.amazon.com/"); 
				break;
				
		 default: 
			 System.out.println("browser is invalid");
		  
		  
		  }
	}

}
