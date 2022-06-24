package selenium.kickoff;

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

        // Amount of time the webdriver will wait for an element if it is not present.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Maximize the window could help to find elements that are hidden by de css on small screens.
        driver.manage().window().maximize();

        driver.get("http://www.santiagovasco.com");

        // Just to see the webpage in the screen for 10s. :)
        TimeUnit.SECONDS.sleep(10);

        driver.close();
    }
}
