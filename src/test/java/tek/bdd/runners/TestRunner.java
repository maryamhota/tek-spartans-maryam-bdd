package tek.bdd.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/SecurityTest.feature", // Directory for Feature file
        glue = "tek.bdd.steps", // package for all the steps
        dryRun = true// this will scan and find the unimplemented steps when set to true and will
        // otherwise it needs to be set to false
)
public class TestRunner {

}

