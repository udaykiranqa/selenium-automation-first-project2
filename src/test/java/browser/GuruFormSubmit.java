package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GuruFormSubmit {

	public static void main(String[] args) throws Exception {

	
		//initialize driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Sync
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step1: Open application.
		driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");

		// Step2: Click on a Link - Selenium Practcie page.
		//	driver.findElement(By.linkText("Selenium Practice page")).click();
		
		//Step3: Fill our the form.
		 driver.findElement(By.name("Name")).sendKeys("Computers");
		 
		 //check-box
		 driver.findElement(By.name("subscribe")).click();
		 driver.findElement(By.name("subscribe")).click();
		 
		 //enter comments
		 driver.findElement(By.name("comments")).sendKeys("COMMENTS laptops");
		
		 //Select a value from DropDwon---Selenium
		 WebElement contrydropDown = driver.findElement(By.name("countries"));
		 Select countriesdropDown = new Select(contrydropDown);
		 
		 Thread.sleep(2000);
		 countriesdropDown.selectByVisibleText("Afganistain");
		 countriesdropDown.selectByIndex(0);
		 
		 //List Box--
		 WebElement brandsdropDown = driver.findElement(By.name("computerbrands"));
		 Select branddropDown = new Select(brandsdropDown);
		 
		 Thread.sleep(2000);
		 branddropDown.deselectByVisibleText("DELL");
		 branddropDown.selectByVisibleText("IBM");
		 branddropDown.selectByVisibleText("HP");
		 branddropDown.selectByVisibleText("Sony");
		 
		 //Radio button.
		driver.findElement(By.xpath("//*[@value='excellent']")).click();
		 
		 //Submit
		 driver.findElement(By.xpath("//*[@value='Submit']")).click();

	}

}
