package test.steps;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.pageObjects.BookPage;
import test.pageObjects.HomePage;
import test.pageObjects.SearchResultsPage;
import test.utils.Context;
import test.utils.DriverUtils;

public class Search {

	private HomePage homepage;
	private BookPage bookPage;
	private SearchResultsPage searchResultsPage;
	private Context context;

	public Search(Context context) {
		this.context = context;
	}

	@Before
	public void initializeTest() {

		this.context.initializeDriver();
		homepage = new HomePage(this.context);
	}

	@After
	public void tearDownTest(Scenario scenario) {

		if (scenario.isFailed()) {
			scenario.write("Failed in URL: " + context.getDriver().getCurrentUrl() );
		}


		scenario.write("* Cheapest price found: "+context.retrieveData("price") );
		scenario.write("* See "+context.getDriver().getCurrentUrl() );
		final byte[] screenshot = DriverUtils.takeScreenshotAsByteArray(context.getDriver());
		scenario.embed(screenshot, "image/png");
		
		context.getDriver().quit();
	}

	@Given("^User navigates to Homepage$")
	public void user_navigates_homepage() throws Throwable {
		homepage.navigateTo();
	}

	@When("^User searches: \"(.*)\"$")
	public void user_searches(String searchTerm) throws Throwable {

		homepage.Search(searchTerm);
	}

	@When("^User sorts results by: \"(.*)\"$")
	public void user_sorts_results_by(String sortCriteria) throws Throwable {

		new WebDriverWait(context.getDriver(), 5).until(ExpectedConditions.urlContains("/search?searchTerm"));

		searchResultsPage = new SearchResultsPage(context);
		searchResultsPage.sort(sortCriteria);
	}

	@Then("^cheapest title contains: \"(.*)\"$")
	public void cheapest_title_contains(String resultTitle) throws Throwable {

		searchResultsPage.getCheapest().click();
		bookPage = new BookPage(context);

		String price = bookPage.getPrice();
		context.storeData("price", price);

		Assert.assertTrue( bookPage.getTitle().contains(resultTitle) );
		//Assert.assertEquals(resultTitle, );

	}

	@Then("^author is: \"(.*)\"$")
	public void author_is(String resultAuthor) throws Throwable {

		Assert.assertEquals(resultAuthor, bookPage.getAuthor());
	}

}
