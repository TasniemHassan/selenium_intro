package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _13_Selenium_Locators_CSSSELECTOR_for_CLASSNAME {

     /*
    TEST CASE:
    1. Go to "https://www.google.com/"
    2. Validate the "Search by voice" button is displayed in the search input box
    NOTE: for the test case above we will use cssSelector
    NOTE: The "Search by voice" button has a class attribute as "XDyW0e"
     */

    public static void main(String[] args) throws InterruptedException {
        // 1. Use Driver util method - getDriver() to set driver to be used for the script
        WebDriver driver = Driver.getDriver();

        // 2. Navigate to "https://www.google.com/" using get() method
        driver.get("https://www.google.com/");

        // 3. Locate the button using cssSelector and validate it is displayed
        WebElement searchByVoice = driver.findElement(By.cssSelector(".XDyW0e"));

        System.out.println(searchByVoice.isDisplayed()); // true

        // 6. Use Driver util method - quitDriver() to quit browser session
        Driver.quitDriver();
    }
}
