package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestFacebook {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.facebook.com/");

        String title = driver.getTitle();
        if(title.equals("Facebook - log in or sign up")) System.out.println("Title is Validated and Passed!");
        else System.out.println("Title is not valid and Failed");

        String url = driver.getCurrentUrl();
        if(url.equals("https://www.facebook.com/")) System.out.println("URL Validation Passed");
        else System.out.println("URL Validation Failed");

        WebElement logo = driver.findElement(By.className("_8ilh"));
        System.out.println(logo.isDisplayed());

        WebElement heading2 = driver.findElement(By.className("_8eso"));
        System.out.println(heading2.isDisplayed());

        WebElement emailAndPhoneNumber = driver.findElement(By.id("email"));
        System.out.println(emailAndPhoneNumber.isDisplayed());

        WebElement password = driver.findElement(By.id("pass"));
        System.out.println(password.isDisplayed());

        WebElement logIn = driver.findElement(By.className("_6lth"));
        System.out.println(logIn.isDisplayed() && logIn.isEnabled());

        WebElement forgotPass = driver.findElement(By.className("_6ltj"));
        System.out.println(forgotPass.isDisplayed());

        WebElement createNewAccount = driver.findElement(By.className("_6lti"));
        System.out.println(createNewAccount.isDisplayed());




        Driver.quitDriver();

    }
}
