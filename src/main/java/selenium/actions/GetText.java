package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static selenium.utils.Utils.WIKIPEDIA_URL;
import static selenium.utils.Utils.getDriver;
public class GetText {

    public static void main(String[] args) {
        WebDriver driver = getDriver();
        driver.get(WIKIPEDIA_URL);
        String expectedTitle = "Wikipedia";

        // Store the web element in a WebElement object to perform operations.
        WebElement webPageTitle = driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-textlogo > h1 > span"));
        String webPageTitleText = webPageTitle.getText();

        System.out.println("Assert: " + webPageTitleText.equals(expectedTitle));

        driver.close();
    }
}
