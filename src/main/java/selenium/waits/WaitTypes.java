package selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import static selenium.utils.Utils.WIKIPEDIA_URL;
import static selenium.utils.Utils.getDriver;

public class WaitTypes {

    public static void main(String[] args) {
        WebDriver driver = getDriver();
        driver.get(WIKIPEDIA_URL);

        // Implicit Wait
        // Time the web driver will wait for an element before throwing an element not found exception.
        // Is a good practice set this at the beginning to prevent some useless webElement not found Exceptions.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element = driver.findElement(By.id("js-link-box-en"));

        // Explicit Wait
        // Used to wait for an amount of time for a webElement before throwing an exception.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));

        // Fluent Wait
        // Used to wait an amount of time and ignore the exception
        // Declaration:
        Wait fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15)) // Timeout to throw the exception.
                .pollingEvery(Duration.ofSeconds(5)) // Check every 5 seconds ignoring the exception until reach the 15 seconds.
                .ignoring(NoSuchElementException.class);
        // How to use it:
        fluentWait.until(
                new Function<WebDriver, WebElement>(){
                    public WebElement apply(WebDriver webDriver) {
                        return webDriver.findElement(By.id("js-link-box-en"));
                    }
                }
        );
        // How to use it more nice :)
        fluentWait.until((Function<WebDriver, WebElement>) webDriver -> webDriver.findElement(By.id("js-link-box-en")));

        driver.close();
    }
}
