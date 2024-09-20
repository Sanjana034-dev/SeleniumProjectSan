package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"features\\VerifyGreetingmessage.feature"},
		glue = {"StepDefinition"},
		plugin = {"html:htmlreport/cucumber-test-report.html"}
		)

public class GreetingRunner extends AbstractTestNGCucumberTests {

}
