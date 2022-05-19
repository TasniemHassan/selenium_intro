package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _09_Locator_linkText_partialLinkTest {
    public static void main(String[] args) {
        /*
Go to https://www.google.com
Validate the Gmail, Images, About and Store links are displayed and enabled

first: check manually. Are they there(displayed), are they clickable(enabled)?
 */
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com");

        WebElement aboutLink = driver.findElement(By.linkText("About"));
        WebElement storeLink = driver.findElement(By.linkText("Store"));
        WebElement gmailLink = driver.findElement(By.partialLinkText("mail"));
        WebElement imagesLink = driver.findElement(By.partialLinkText("Ima"));

        //linkText and partialLinkText is using the actual link we are testing

        System.out.println(aboutLink.getText()); //About
        System.out.println(storeLink.getText()); //Store
        System.out.println(gmailLink.getText()); //Gmail
        System.out.println(imagesLink.getText()); //Images

        System.out.println(aboutLink.isDisplayed() && aboutLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(storeLink.isDisplayed() && storeLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(gmailLink.isDisplayed() && gmailLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(imagesLink.isDisplayed() && imagesLink.isEnabled() ? "PASSED" : "FAILED");

        Driver.quitDriver();

    }

}
