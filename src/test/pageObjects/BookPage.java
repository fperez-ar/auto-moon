package test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.utils.Context;

public class BookPage {
	private WebDriver driver;
	
	public BookPage (Context context) {
		driver = context.getDriver();
	}
	
	public String getTitle()
	{
		return driver.findElement(By.xpath("//h1[@itemprop='name']")).getText();
	}
	
	public String getPrice()
	{
		return driver.findElement(By.cssSelector("span.sale-price")).getText();
	}
}
