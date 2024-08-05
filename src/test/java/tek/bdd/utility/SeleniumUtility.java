package tek.bdd.utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;
import java.time.Duration;
public class SeleniumUtility extends BaseSetup {
    // utility class should extend the base setup class
    // instead of creating Webdriverwait multiple times, we create a method to call the wait every time, we created
    // webdriverwait.
    private WebDriverWait getWait (){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }
    public WebElement waitForVisibility(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    // create a method to click on a given locator
    public void clickElement(By locator) {
        // create a web driver wait
        //WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20)); removing this line and calling
        // the above method
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click(); // wait object
    }
    public void sendText(By locator, String value){
        //WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        // getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(value);
        waitForVisibility(locator).sendKeys(value);
        }
        // create a method for getting the text of an element
    public String getElementText(By locator) {
        return waitForVisibility(locator).getText();
    }
    }


