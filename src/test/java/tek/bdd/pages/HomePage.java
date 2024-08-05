package tek.bdd.pages;

import org.openqa.selenium.By;

public class HomePage {

    public static final By SIGN_IN_LINK = By.id("signinLink");
    public static final By ACCOUNT_LINK = By.id("accountLink");

}
// POM is design pattern where class contains all the elements of a web app page
// each page should have respective java class to store its elements
// in the home page wer are storing all the elements of the home page of our app