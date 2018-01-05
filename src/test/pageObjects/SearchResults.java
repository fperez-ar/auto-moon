package test.pageObjects;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test.utils.Context;

public class SearchResults {

	private WebDriver driver;
	public By searchSortLocator = By.xpath("//select[@name='searchSortBy']");// By.name("searchSortBy");

	public SearchResults(Context context) {
		driver = context.getDriver();
	}

	public void sort(String sortCriteria) {

		Select sort = new Select(driver.findElement(searchSortLocator));
		if (sortCriteria.equals("Price, low to high")) {
			sort.selectByValue("price_low_high");

		} else if (sortCriteria.equals("Price, high to low")) {
			sort.selectByValue("price_high_low");

		} else if (sortCriteria.equals("Publication date, old to new")) {
			sort.selectByValue("pubdate_low_high");

		} else if (sortCriteria.equals("Publication date, new to old")) {
			sort.selectByValue("pubdate_high_low");

		} else if (sortCriteria.equals("Most popular ")) {
			sort.selectByValue("popularity");
		}
	}

	public WebElement getFirst() {

		return driver.findElements(By.cssSelector("div.book-item")).get(0);
	}

	public WebElement getCheapest() {
		// 		  ARS$270,78 
		// REGEXd ARS\$(\d*,\d{2})

		List<WebElement> ws = driver.findElements(By.cssSelector("div.book-item"));
		HashMap<WebElement, Integer> elementPrice = new HashMap<WebElement, Integer>(ws.size());

		for (int i = 0; i < ws.size(); i++) {

			String rawPrice = ws.get(i).findElement(By.className("item-info"))
					.findElement(By.className("price-wrap"))
					.findElement(By.className("price"))
					.getText();

			System.out.println(rawPrice);
			//parse the initial price (first element of capture group)
			// store in hashmap with webelement reference
			// sort by price
			// get first
			// ????
			// Success!
			//System.out.println(processedPrice);

			System.out.println("....");
		}

		return null;
	}
}
