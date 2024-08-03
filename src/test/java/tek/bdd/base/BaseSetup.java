package tek.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class BaseSetup {

    // no more main methods
    // we need to make it an instance variable not local variable, outside the methode
    private static WebDriver driver;// we need to make it static to make it shareable
    public void setupBrowser (){
        // Web driver instance then Navigation to retail app
        // maximize and implicitly wait
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    public void quitBrowser (){
        // null check to avoid exceptions
        if ( driver != null){ // ! = if it's not null, then we won't do anything
            driver.quit();
        }
    }

    // we need to encapsulate the code and give read only indirect access to driver
    public WebDriver getDriver (){
        return driver;// since its static we dont need to use the .this keyword
    }
}
