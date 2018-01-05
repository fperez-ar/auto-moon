package test.runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
					plugin = {"pretty", "html:target/custom-reports"},
					features = "src/test/features",
					glue = "test.steps",
					tags = "~@ignore")



public class RunCukesTest extends AbstractTestNGCucumberTests{

}
