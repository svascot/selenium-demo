package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Kickoff {

    // Setting up the webdriver and open a web page.
    public static void main(String[] args) throws InterruptedException {

        // Open chrome and get santiagovasco.com
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.santiagovasco.com");
        TimeUnit.SECONDS.sleep(10);
        driver.close();
    }
}
