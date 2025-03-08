package TestNGRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "/src/test/java/FeatureFiles/Login.feature",  // Path to feature files
    glue = "stepDefinitions",                  // Path to step definitions
    plugin = {"pretty", 
              "html:target/cucumber-reports.html", 
              "json:target/cucumber.json"
    }, 
    tags = "",                        			// Tags for selective execution
    dryRun = true,
    monochrome = true                           // Cleaner console output
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
}