package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static selenium.utils.Utils.WIKIPEDIA_URL;
import static selenium.utils.Utils.getDriver;

public class SendText {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get(WIKIPEDIA_URL);
        String searchFor = "Selenium webdriver";

        // As an input I can call the method submit, the oder way to perfom this is finding the "search" button and click it.
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys(searchFor);
        searchInput.submit();

        driver.close();
    }
}
