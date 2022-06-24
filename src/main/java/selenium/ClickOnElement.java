package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClickOnElement {

    // Click on a button and validate if it works.
    public static void main(String[] args) {
        WebDriver driver = getDriver();
        driver.get("https://www.wikipedia.org/");
        String expectedEnglishWebPageTitle = "Welcome to Wikipedia,";

        // Get the button and click it.
        WebElement englishButton = driver.findElement(By.id("js-link-box-en"));
        englishButton.click();

        // Getting the text of the english webpage.
        WebElement englishWebPageTitle = driver.findElement(By.id("mp-welcome"));
        String englishWebPageTitleText = englishWebPageTitle.getText();

        System.out.println("Assert: " + expectedEnglishWebPageTitle.equals(englishWebPageTitleText));

        driver.close();
    }

    private static WebDriver getDriver(){
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

}
