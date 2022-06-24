package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static selenium.utils.Utils.WIKIPEDIA_URL;
import static selenium.utils.Utils.getDriver;

public class ClickOnElement {

    // Click on a button and validate if it works.
    public static void main(String[] args) {
        WebDriver driver = getDriver();
        driver.get(WIKIPEDIA_URL);
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
}
