package login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class VerifyAmazonSearch {
	//scenario --manual team 
	
	@Test     //main
	public void verifyAmazonSearch() {
		
		System.out.println("Test search");
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		//driver.close
	}
	
}
