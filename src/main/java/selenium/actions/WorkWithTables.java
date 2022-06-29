package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static selenium.utils.Utils.getDriver;

public class WorkWithTables {

    public static void main(String[] args) {
        WebDriver driver = getDriver();
        driver.get("http://www.santiagovasco.com/assets/study/table.html");

        // Get one element
        System.out.println("One element");
        String item = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]")).getText();
        System.out.println(item);

        // Get all elements
        System.out.println("All elements");
        List<WebElement> items = driver.findElements(By.xpath("/html/body/table/tbody"));
        items.forEach(webElement -> System.out.println(webElement.getText()));

        // Get the third row, it starts in 1 not like java arrays.
        System.out.println("Third row.");
        List<WebElement> thirdRow = driver.findElements(By.xpath("/html/body/table/tbody/tr[3]"));
        thirdRow.forEach(webElement -> System.out.println(webElement.getText()));

        driver.close();
    }
}
