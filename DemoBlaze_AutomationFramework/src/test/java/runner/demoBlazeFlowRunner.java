package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/FeatureFiles/purchaseE2E.feature", glue = "stepdefinitions", plugin = {"pretty", "html:target/cucumberReport.html"})
public class demoBlazeFlowRunner extends AbstractTestNGCucumberTests {

}
