package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"features\\VerifyURL.feature"},
		glue = {"StepDefinition"},
		plugin = {"html:htmlreport/cucumber-test-report.html"}
		)
public class OpenUrlRunner extends AbstractTestNGCucumberTests {

}
