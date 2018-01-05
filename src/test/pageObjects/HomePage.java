package test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.utils.Context;

public class HomePage {

	private WebDriver driver;
	private String url = "https://www.bookdepository.com";

	public HomePage(Context context) {
		driver = context.getDriver();
	}

	public String getUrl()
	{
		return url;
	}


	public void Search(String searchTerm) {
		//WebElement searchBar = driver.findElement(By.name("search"));
		WebElement searchBar = driver.findElement(By.name("searchTerm"));
		searchBar.clear();
		searchBar.sendKeys(searchTerm);
		searchBar.sendKeys(Keys.ENTER);
	}

}