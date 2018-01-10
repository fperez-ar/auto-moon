package test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.utils.Context;

public class HomePage {

	private WebDriver driver;
	private String url = "https://www.bookdepository.com";
	private By searchBarLocator = By.name("searchTerm")


	public HomePage(Context context) {
		driver = context.getDriver();
	}

	public String getUrl()
	{
		return url;
	}

	public void navigateTo()
	{
		//navigate to keeps the browser History and cookies
		driver.navigate().to(url);
		//get doesn't maintain the browser History and cookies
		//driver.get(url);
	}

	public void Search(String searchTerm) {	
		WebElement searchBar = driver.findElement(searchBarLocator);
		searchBar.clear();
		searchBar.sendKeys(searchTerm);
		searchBar.sendKeys(Keys.ENTER);
	}

}
