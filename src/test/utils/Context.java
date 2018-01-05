package test.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import test.utils.DriverUtils;
import test.utils.DriverUtils.DriverType;

public class Context {
	private WebDriver driver;

	public void initializeDriver() {

		driver = DriverUtils.getDriver(DriverType.CHROME);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}




}
