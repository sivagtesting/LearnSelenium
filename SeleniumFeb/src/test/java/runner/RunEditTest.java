package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/java/features/EditLead.feature",glue="steps2",monochrome=true)
public class RunEditTest extends AbstractTestNGCucumberTests {
	
}
