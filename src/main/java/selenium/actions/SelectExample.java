package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static selenium.utils.Utils.getDriver;

public class SelectExample {

    public static void main(String[] args) {
        WebDriver driver = getDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
        driver.switchTo().frame("iframeResult");

        WebElement selectable = driver.findElement(By.id("cars"));
        Select select = new Select(selectable);
        // Select one option, starts by 0.
        select.selectByIndex(1);

        // Print all the options
        select.getOptions().stream().map(WebElement::getText).forEach(System.out::println);

        driver.close();
    }
}
