package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static selenium.utils.Utils.getDriver;

public class ActionsExample {

    // This actions allows to perform operation like drag and drops element,
    // press keys, right click, etc.
    public static void main(String[] args) {
        WebDriver driver = getDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.cssSelector("#content > iframe")));

        // Getting the objects
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        // Drag and Drop action.
        Actions dragAndDropAction = new Actions(driver);
        dragAndDropAction.dragAndDrop(draggable, droppable).build().perform();

        // Right click
        Actions rightClick = new Actions(driver);
        rightClick.contextClick().build().perform();

        driver.close();
    }
}
