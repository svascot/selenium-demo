# Selenium-demo
This is a project where the practical classes of the [Automation Testing Masterclass](https://www.udemy.com/course/automation-testing-masterclass/) are implemented.

To organize the project structure, the creation of the WebDriver is implemented in a utility class.
```java
 public static WebDriver getDriver() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }
```

Sections:
 * Kickoff:
   * [Kickoff](src/main/java/selenium/kickoff/Kickoff.java) Setting up the webdriver and open a web page.
   * [Locators](src/main/java/selenium/kickoff/Locators.java) Finding elements in the DOM using locators.
 * Actions
   * [GetText](src/main/java/selenium/actions/GetText.java) How to get the text of a web element.
   * [ClickOnElement](src/main/java/selenium/actions/ClickOnElement.java) How to click on a button.
   * [SendText](src/main/java/selenium/actions/SendText.java) Example of how to write text in an input field.
   * [WorkWithTables](src/main/java/selenium/actions/WorkWithTables.java) How to get info from a table.
 * Waits
   * [WaitTypes](src/main/java/selenium/waits/WaitTypes.java) Different types of waits.