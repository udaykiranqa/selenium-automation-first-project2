package login;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.amazon.function.library.BaseTest;

public class PerformEditProfile extends BaseTest {

	@Test
	public void verifyPerformEditProfile() throws Exception {
		// Step1: Open browser.
		//read property.
		String url = readProperty("url");
		
		startBrowser("chrome");
		openApplication(url);
		syncWait(10);
	//	switchToFrame(0);
		
		//handle alert.
		
		
		closeBrowser();
		
		//add();
		
		//close browser
		
		
		
		

	}

}
