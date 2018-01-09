package test.steps;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
			final byte[] screenshot = DriverUtils.takeScreenshotAsByteArray(context.getDriver());
			//scenario.write("Failed in URL: " context.getDriver().getCurrentUrl() );
			scenario.embed(screenshot, "image/png");
		}


		scenario.write("* Cheapest price found: "+context.retrieveData("price") );
		scenario.write("* See "+context.getDriver().getCurrentUrl() );
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


	@Then("^cheapest result contains: \"([^\"]*)\"$")
	public void cheapest_result_contains(String result) throws Throwable {

		searchResultsPage.getCheapest().click();

		BookPage bookPage = new BookPage(context);

		String price = bookPage.getPrice();
		context.storeData("price",price);
		
		System.out.println(bookPage.getAuthor());
		// take screenshot
		DriverUtils.takeScreenshot(context.getDriver(), System.getProperty("user.dir") + "/sailormoon7.png");
	}

}
