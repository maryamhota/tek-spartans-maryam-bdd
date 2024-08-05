package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.SignInPage;
import tek.bdd.utility.SeleniumUtility;

public class SecurityTestSteps extends SeleniumUtility {

    @When("user click on sign in link")
    public void user_click_on_sign_in_link() {
        clickElement(HomePage.SIGN_IN_LINK);

    }
    @Then("validate user is in sign in page")
    public void validate_user_is_in_sign_in_page() {
        String pageSubtitle = getElementText(SignInPage.PAGE_SUBTITLE);
        Assert.assertEquals("Sign in", pageSubtitle);
    }
    @When("user enter username and password and click on login")
    public void user_enter_username_and_password_and_click_on_login() {
        sendText(SignInPage.EMAIL_INPUT, "sawelai@yahoo.com");
        sendText(SignInPage.PASSWORD_INPUT, "password@123");
        clickElement(SignInPage.LOGIN_BUTTON);
    }
    @When("user enter {string} and {string}  and click login")
    public void userEnterUsernameAndPassword(String username, String password) {
        sendText(SignInPage.EMAIL_INPUT, username);
        sendText(SignInPage.PASSWORD_INPUT, password);
        clickOnElement(SignInPage.LOGIN_BUTTON);

    }

    private void clickOnElement(By loginButton) {
    }

    @Then("user should be able to see account link")
    public void user_should_be_able_to_see_account_link() {
    boolean isAccountDisplayed = isElementDisplayed  (By.id("accountLink"));
    }

}
