package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", // Generates readable console output with colored text
                "html:target/cucumber-reports/cucumber.html", // Creates HTML report at specified path
                "json:target/cucumber-reports/cucumber.json", // Generates JSON report for integration with other tools
                "junit:target/cucumber-reports/cucumber.xml" // Creates JUnit XML report for CI/CD systems
        },
        publish = true,
        features = "src/test/resources/features",
        glue = {"stepDefinitions","hooks"},
        tags = "@charValidation",
        dryRun = false
)
public class Runner {
}
