package test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test.utils.Context;

public class BookPage {
	private WebDriver driver;

	private By titleLocator = By.xpath("//h1[@itemprop='name']");
	private By priceLocator = By.cssSelector("span.sale-price");
	

	public BookPage (Context context) {
		driver = context.getDriver();
	}

	public String getTitle()
	{
		return driver.findElement(titleLocator).getText();
	}

	public String getPrice()
	{
		return driver.findElement(priceLocator).getText();
	}


}
