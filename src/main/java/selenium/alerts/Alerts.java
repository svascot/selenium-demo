package selenium.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static selenium.utils.Utils.getDriver;
import static selenium.utils.Utils.sleep;

public class Alerts {
    public static void main(String[] args) {
        WebDriver driver = getDriver();
        driver.get("http://www.santiagovasco.com/assets/study/alerts.html");

        WebElement basicAlertButton = driver.findElement(By.cssSelector("body > button:nth-child(2)"));
        WebElement confirmationAlertButton = driver.findElement(By.cssSelector("body > button:nth-child(5)"));
        WebElement promptAlertButton = driver.findElement(By.cssSelector("body > button:nth-child(8)"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Click on the button to show up the alert.
        basicAlertButton.click();
        // Wait for the alert to avoid exceptions if take some time for any reason.
        wait.until(ExpectedConditions.alertIsPresent());
        // Getting the alert.
        Alert basicAlert = driver.switchTo().alert();
        // We can perform some functions over the alert object, like dismiss() or getTest();
        sleep(1);
        basicAlert.accept();

        confirmationAlertButton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert confirmationAlert = driver.switchTo().alert();
        sleep(1);
        confirmationAlert.dismiss();


        promptAlertButton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Santiago Vasco");
        sleep(1);
        promptAlert.accept();

        sleep(3);
        driver.close();
    }
}
