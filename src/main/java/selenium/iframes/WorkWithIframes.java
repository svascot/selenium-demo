package selenium.iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static selenium.utils.Utils.getDriver;

public class WorkWithIframes {

    public static void main(String[] args) {
        // The way to work with iFrames is switching between them, is like and index and starts with 0,
        // is a good practice just switch ones per script.
        // A common problem is if the driver loads faster than the iframe, it won't be able to see it. That's why
        // we have to work switching through the iFrames.
        usingIndex();
        usingWebElement();
    }

    private static void usingIndex() {
        WebDriver driver = getDriver();
        driver.get("https://www.w3schools.com/html/html_iframe.asp");

        // switch using index, like an Array it starts in 0, which is the parent, so index 1 will be the first iframe.
        // if the iFrame has name or id we can use them too.
        var title = driver.switchTo().frame(1).findElement(By.cssSelector("#main > h1")).getText();
        System.out.println("Title using index: " + title);

        driver.close();
    }

    private static void usingWebElement() {
        WebDriver driver = getDriver();
        driver.get("https://www.w3schools.com/html/html_iframe.asp");

        // Using webElement
        WebElement iframe = driver.findElement(By.cssSelector("#main > div:nth-child(7) > iframe"));
        var titleTwo = driver.switchTo().frame(iframe).findElement(By.cssSelector("#main > h1")).getText();
        System.out.println("Title using WebElement: " + titleTwo);

        driver.close();
    }
}
