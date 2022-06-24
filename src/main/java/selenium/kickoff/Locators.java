package selenium.kickoff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static selenium.utils.Utils.getDriver;

public class Locators {

    // Finding elements in the DOM using locators.
    public static void main(String[] args) {
        Long startTime = 0l;
        Long endTime = 0l;
        WebDriver driver = getDriver();
        driver.get("http://www.wikipedia.org");

        // Locators
        System.out.println("Time getting elements by locators:");

        // id
        startTime = System.currentTimeMillis();
        driver.findElement(By.id("js-link-box-en"));
        endTime = System.currentTimeMillis();
        System.out.println("By Id: " + (endTime-startTime));

        // css selector
        startTime = System.currentTimeMillis();
        driver.findElement(By.cssSelector("#js-link-box-en"));
        endTime = System.currentTimeMillis();
        System.out.println("By CssSelector: " + (endTime-startTime));

        // xpath -> Right click on the div element and Copy - xpath
        startTime = System.currentTimeMillis();
        driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]"));
        endTime = System.currentTimeMillis();
        System.out.println("By Xpath: " + (endTime-startTime));

        // id, Trying another element by Id, this will be faster IDKW
        startTime = System.currentTimeMillis();
        driver.findElement(By.id("js-link-box-es"));
        endTime = System.currentTimeMillis();
        System.out.println("By Id: " + (endTime-startTime));

        driver.close();
    }
}
