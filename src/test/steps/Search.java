package test.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.pageObjects.HomePage;
import test.pageObjects.SearchResults;
import test.utils.Context;
import test.utils.DriverUtils;

public class Search {

	private HomePage homepage;
	private SearchResults searchResults;
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
			scenario.write( context.getDriver().getCurrentUrl() );
			scenario.embed(screenshot, "image/png");
		}

		context.getDriver().close();
		context.getDriver().quit();
	}

	@Given("^User navigates to Homepage$")
	public void user_navigates_homepage() throws Throwable {
		context.getDriver().get(homepage.getUrl());
	}

	// @When("^User searches: \"(.*)\"$")
	@When("^User searches: \"([^\"]*)\"$")
	public void user_searches(String searchTerm) throws Throwable {

		homepage.Search(searchTerm);
	}

	@When("^User sorts results by: \"(.*)\"$")
	// @When("^User sorts results by: \"([^\"]*)\"$")
	public void user_sorts_results_by(String sortCriteria) throws Throwable {

		new WebDriverWait(this.context.getDriver(), 5).until(ExpectedConditions.urlContains("/search?searchTerm"));

		searchResults = new SearchResults(context);
		searchResults.sort(sortCriteria);
	}

	@Then("^topmost result is: \"(.*)\"$")
	public void topmost_result_is(String result) throws Throwable {
		searchResults.getCheapest().click();
		
		//TODO CREATE SearchResult (singular) to wrap the following:
		// Assert result is present
		WebElement title = context.getDriver().findElement(By.xpath("//h1[@itemprop='name']"));
		
		Assert.assertTrue( title.getText().equalsIgnoreCase( "Sailor Moon 7") );
		
		// take screenshot
		DriverUtils.takeScreenshot(context.getDriver(), System.getProperty("user.dir") + "/sailormoon7.png");
	}

}
