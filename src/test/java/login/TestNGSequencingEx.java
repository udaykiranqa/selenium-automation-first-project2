package login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGSequencingEx {
	
	@Test(priority=0)
	public void verifyAmazonLogin() { //--NOT Successful
		
		System.out.println("verify Amazon Login");
		//Assert.fail(); // fail.
	}
	
	@Test(priority=1, dependsOnMethods="verifyAmazonLogin") //skip
	public void verifyEditProfile() {
		
		System.out.println("verify Edit Profile");
	}
	
	@Test(enabled=false) //skip
	public void verifyAmazonSearch() {
		
		System.out.println("verify Amazon Search");
	}
	
	@Test(priority=3)
	public void verifyAddToCart() {
		
		System.out.println("verify AddTo Cart");
	}
	
}
