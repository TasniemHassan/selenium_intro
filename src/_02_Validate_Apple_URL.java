import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {
    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "/Users/tasniemhassan/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.apple.com");

        String expectedUrl = "https://www.apple.com";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.equals(expectedUrl)) System.out.println("URL validation PASSED");
        else System.out.println("URL validation Failed!");

        driver.quit();
    }
}
