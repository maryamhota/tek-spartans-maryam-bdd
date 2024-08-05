package tek.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tek.bdd.utility.SeleniumUtility;

public class HooksSteps extends SeleniumUtility {
    // Hooks is a method that hooks our code to what we have already implanted in our Scenarios, it avoids repeatation
    // we need a method here and we need to annotate it with @Before tag, needs to be imported from cucumber not junit
    @Before
    public void beforeEachScenario(){
        setupBrowser();
    }
    @After
    public void afterEachScenario(){
        quitBrowser();
    }
}
