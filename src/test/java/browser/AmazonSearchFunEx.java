package browser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearchFunEx {
	
	@Test
	public void verifySearch() throws Exception {
		
		//import methods of other class.
		//1. object.
		//2. inheritance.
	
		BaseClass obj = new BaseClass();
		String appURL = obj.readProperty("url"); //calling method
		String userName = obj.readProperty("userName");
		String password = obj.readProperty("password");
		
		// Step1: Launch Browser - Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Step1: Open amazon.com
		driver.get(appURL); 
		
		
		//Step2: LOgin
		//login(userName, password);
		
		//Assert.
		
		
		
	}

}
