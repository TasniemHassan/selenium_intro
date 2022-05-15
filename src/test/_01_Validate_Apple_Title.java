package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    public static void main(String[] args) {


    /*
    TEST CASE
    1. Go to "https://www.apple.com/"
    2. Validate the title of the page is displayed as "Apple"
    */
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.apple.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Apple";


        if(actualTitle.equals(expectedTitle)) System.out.println("Title validation PASSED");
        else System.out.println("Apple title validation Failed!");

        Driver.quitDriver();
    }
}
