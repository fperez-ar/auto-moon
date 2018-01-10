package test.pageObjects;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test.utils.Context;
import test.utils.DriverUtils;
import test.utils.RegexUtilities;

public class SearchResultsPage {

	private WebDriver driver;
	public By searchSortLocator = By.xpath("//select[@name='searchSortBy']");
	// By.name("searchSortBy"); //doesn't work because there is another element by the same name

	By bookItemLocator = By.cssSelector("div.book-item");
	//only to be used as a child of book-item
	By priceChildLocator = By.xpath("div[@class='item-info']//p[@class='price']");

	public SearchResultsPage(Context context) {
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

		return driver.findElements(bookItemLocator).get(0);
	}


	public WebElement getCheapest() {

		List<WebElement> searchResults = driver.findElements(bookItemLocator);

		int min = Integer.MAX_VALUE;
		WebElement minElement = null;

		for (int i = 0; i < searchResults.size(); i++) {

			//System.out.println( searchResults.get(i).getText() );
			if ( ! DriverUtils.isChildPresent(driver, searchResults.get(i), priceChildLocator)) continue;

			String rawPrice = searchResults.get(i).findElement(priceChildLocator).getText();

			String processedPrice = RegexUtilities.ApplyRegex(rawPrice, "ARS\\$([\\d*\\.*]*,\\d*)");

			// GERMAN format 1.234,56 = (mil ciento veintitres con cincuenta y seis centavos)
			int currentPrice = parsePrice(processedPrice, Locale.GERMAN);

			if (currentPrice < min) {
				min = currentPrice;
				minElement = searchResults.get(i);
			}
			/*
			System.out.println("raw:" + rawPrice);
			System.out.println("processed(str):" + processedPrice + " (int):" + currentPrice);
			System.out.println( "_________________________________" );
			*/
		}

		System.out.println("Final min price :" + min);
		return minElement;
	}

	private int parsePrice(String price, Locale locale) {
		int currentPrice = Integer.MAX_VALUE;

		NumberFormat formatter = NumberFormat.getNumberInstance(locale);

		try {
			currentPrice = formatter.parse(price).intValue();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return currentPrice;
	}
}
