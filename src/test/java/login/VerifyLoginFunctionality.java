package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLoginFunctionality {

	WebDriver driver = null;

	@Test(groups="sanity")
	@Parameters({ "userName", "password", "browser" })
	public void verifyLoginFunctionality(String uName, String pwd, String browser) {

		// Initialize browser -- Nested If (switch Case).
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		// Login in HRM application.
		// Step1 : Open the website.
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		// Step2 : Enter User Name
		driver.findElement(By.id("txtUsername")).sendKeys(uName);

		// Step3 : Enter Password.
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);

		// Step4 : Click Login button.

		driver.findElement(By.className("button")).click();

		// verification

	}

}
