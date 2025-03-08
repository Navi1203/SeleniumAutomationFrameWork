package junitTestRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/FeatureFiles/Login.feature",   // Path to your feature files
    glue = "StepDefinition",                   // Step definition package
    plugin = {
        "pretty",                                // Clean console output
        "html:target/cucumber-reports",         // HTML report generation
        "json:target/cucumber.json"             // JSON report for integration with tools
    },
    dryRun = false,                             // true = Checks mapping without executing tests
    tags = ""      // Execute tests with specified tags
)
public class JunitTestRunner {
}

