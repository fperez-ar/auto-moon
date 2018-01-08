package test.utils;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import test.utils.DriverUtils.DriverType;

public class Context {
	private WebDriver driver;
	HashMap<String, String> data;

	public void initializeDriver() {
		data = new HashMap<String, String>();

		driver = DriverUtils.getDriver(DriverType.CHROME);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void storeData(String key, String value){
		data.put(key, value);
	}

	public String retrieveData(String key){
		return data.get(key);
	}

}
