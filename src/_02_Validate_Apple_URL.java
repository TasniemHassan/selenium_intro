import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {
    public static void main(String[] args) {


        WebDriver driver = Driver.getDriver();

        driver.get("https://www.apple.com");

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.apple.com";

        if(actualUrl.equals(expectedUrl)) System.out.println("URL validation PASSED");
        else System.out.println("URL validation Failed!");

        Driver.quitDriver();
    }
}
