package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropJune {

	public static void main(String[] args) {

		// open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open application.
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//Step2: SwitchTo iFrame.
		driver.switchTo().frame(0); //1 st frame.
		
		//Step3: Perform drag and drop.
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
		
		
	}

}
