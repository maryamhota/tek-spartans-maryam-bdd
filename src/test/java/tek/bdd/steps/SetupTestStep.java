package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SetupTestStep extends SeleniumUtility{
        @Given("Open browser and navigate to retail app")
        public void openBrowserAndNavigate(){
            setupBrowser();
    }
    @Then("Validate top left corner is TEKSCHOOL")
    public void validateTopLeftLogo(){
            String topLeftCornerText = getElementText(By.className("top-nav__logo"));
        System.out.println(topLeftCornerText);
        // assertion is used to make sure the expectation is met, it takes 2 parameters
        Assert.assertEquals("TEKSCHOOL", topLeftCornerText);
    }
    @Then("Close the browser")
    public void closeBrowser(){
            quitBrowser();
    }
}
