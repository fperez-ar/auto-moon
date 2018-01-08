package test.utils;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtils {

	public static enum DriverType {
		FIREFOX, CHROME,
	}

	private static String chromeDriverPath = "/src/test/resources/drivers/chromedriver";
	private static String firefoxDriverPath = "/src/test/resources/drivers/geckodriver";

	public static WebDriver getDriver(DriverType driverType) {
		switch (driverType) {
		case FIREFOX:
			setUpFirefox();
			return new FirefoxDriver();

		case CHROME:
			setUpChrome();
			return new ChromeDriver();

		}
		return null;
	}

	private static void setUpFirefox() {
		// TODO: Detect OS and select route
		String os = System.getProperty("os.name");
		String driverPath = null;

		if (os.contains("win")) {
			driverPath = System.getProperty("user.dir") + firefoxDriverPath + ".exe";

		} else if (os.contains("nix") || os.contains("nux")) {
			driverPath = System.getProperty("user.dir") + firefoxDriverPath;
		}
		System.out.println(driverPath);
		System.setProperty("webdriver.gecko.driver", driverPath);
	}

	private static void setUpChrome() {
		// TODO: Detect OS and select route
		String os = System.getProperty("os.name");
		String driverPath = null;

		if (os.contains("win")) {
			driverPath = System.getProperty("user.dir") + chromeDriverPath + ".exe";

		} else if (os.contains("nix") || os.contains("nux")) {
			driverPath = System.getProperty("user.dir") + chromeDriverPath;
		}
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath);
	}

	public static void takeScreenshot(WebDriver driver, String path) throws Exception {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtilities.copyFile(scrFile, new File(path));
		System.out.println("Screenshot taken, see: " + path);
	}

	public static byte[] takeScreenshotAsByteArray(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	public static boolean isPresent(WebDriver driver, By locator) {
		try {
			driver.findElement(locator);
		} catch (NotFoundException e) {
			return false;
		}
		return true;
	}

	public static boolean isChildPresent(WebDriver driver, WebElement parent, By locator) {
		try {
			parent.findElement(locator);
		} catch (NotFoundException e) {
			return false;
		}
		return true;
	}

}
