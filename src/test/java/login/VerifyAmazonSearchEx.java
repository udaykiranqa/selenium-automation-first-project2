package login;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAmazonSearchEx {

	// -- initialize driver.
	WebDriver driver=null;
	String expectedTile="Amazon";
	
	@Test 
	@Parameters("keyword")
	public void verifyAmazonLogin(String searchTerm) {
		
		//Launch browser
		WebDriverManager.chromedriver().setup(); //calling driver
		driver = new ChromeDriver();

		// Launch amazon.
		driver.get("https://www.amazon.com/");

		// Search for a keyword - Laptops
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchTerm);
		
		// Click on Submit.
		driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
