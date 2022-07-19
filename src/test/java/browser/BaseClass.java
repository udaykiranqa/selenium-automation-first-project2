package browser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseClass {

	// common methods.

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

	public void waitt() {
	//
}
}
