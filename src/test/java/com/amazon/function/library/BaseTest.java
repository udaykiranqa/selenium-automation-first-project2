package com.amazon.function.library;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	//common class - common methods.
	WebDriver driver=null;
	
	public void startBrowser(String browser) {

		 if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
	}

	public void openApplication(String URL) {
		   driver.get(URL);
		
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void syncWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void add() {
		int a=10, b=20, c;
		c=a+b;
		System.out.println(c);
	}

	// read data from property file.
		public String readProperty(String key) throws Exception {
			String path = "C:\\workspace\\selenium-automation-first-project2\\src\\test\\resources\\constants.properties";
			FileInputStream file = new FileInputStream(path);

			// Properties --- Java
			Properties prop = new Properties();
			prop.load(file);
			String value = prop.getProperty(key);
			return value;
		}
	
	
}
