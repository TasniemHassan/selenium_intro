package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {

        //1. Set up driver
        System.setProperty("webdriver.chrome.driver", "/Users/tasniemhassan/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver(); //Instantiate a Chrome Browser
        //2. Maximize driver
        driver.manage().window().maximize(); //Maximize the driver
        //3. Define implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //4. Navigate to Google website
            driver.get("https://www.google.com");

       //5. Validate the title is Google
        System.out.println("The title of the page is = " + driver.getTitle()); // should return Google

        if(driver.getTitle().equals("Google")) System.out.println("Google title validation PASSED");
        else System.out.println("Google title validation FAILED!!!");

        System.out.println("End of the program");

        //6. Quit driver
        driver.quit();
    }
}