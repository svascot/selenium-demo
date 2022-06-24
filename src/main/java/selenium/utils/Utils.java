package selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Utils {

    // Could be placed in a properties file
    public static final String WIKIPEDIA_URL= "https://www.wikipedia.org/";

    // IDK if this is a good practice, I moved this out just to clean the main method.
    public static WebDriver getDriver(){
        WebDriver driver = new ChromeDriver();

        // Could be placed in a properties file
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }
}
