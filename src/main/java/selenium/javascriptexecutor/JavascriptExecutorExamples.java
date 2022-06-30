package selenium.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static selenium.utils.Utils.WIKIPEDIA_URL;
import static selenium.utils.Utils.getDriver;

public class JavascriptExecutorExamples {

    // The idea is to perform functions that could not be able with the webDriver for some reason.
    public static void main(String[] args) {
        WebDriver driver = getDriver();
        driver.get("http://www.santiagovasco.com");

        // Click on element; this is useful when an element is not clickable, for example
        // a span or a div could act as a button.
        WebElement themeButton = driver.findElement(By.id("theme-button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", themeButton);

        // Scrolling by pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");

        // Setting up timeouts; this will wait for 2 seconds.
        ((JavascriptExecutor) driver).executeAsyncScript("window.setTimeout(arguments[arguments.length-1],2000);");

        // Changing the webpage; "window.location='http://wikipedia.com'"
        ((JavascriptExecutor) driver).executeScript("window.location='"+ WIKIPEDIA_URL+"'");

        // Waiting again for 2s
        ((JavascriptExecutor) driver).executeAsyncScript("window.setTimeout(arguments[arguments.length-1],2000);");

        driver.close();
    }
}
