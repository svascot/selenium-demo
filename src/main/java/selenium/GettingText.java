package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GettingText {

    public static void main(String[] args) {
        WebDriver driver = getDriver();
        driver.get("https://www.wikipedia.org/");
        String expectedTitle = "Wikipedia";

        // Store the web element in a WebElement object to perform operations.
        WebElement webPageTitle = driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-textlogo > h1 > span"));
        String webPageTitleText = webPageTitle.getText();

        System.out.println("Assert: " + webPageTitleText.equals(expectedTitle));

        driver.close();
    }

    private static WebDriver getDriver() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

}
