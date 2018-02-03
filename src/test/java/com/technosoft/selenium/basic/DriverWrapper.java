package com.technosoft.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;
/**
 * Created by taniaamin on 1/15/18.
 */
public class DriverWrapper {

    private static WebDriver driver = null;
    private static String url = "https://www.facebook.com/";
    private static String hoverover = "https://www.amazon.com/";
    private static String autocomplete = "https://www.expedia.com/";
    private static String calender = "https://www.hotels.com/";
    private static String alert = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";

    public static WebDriver getDriver() {
        return driver;
    }


    @BeforeClass
    public void initializeWebDriver() {
        //Initialize web driver interface
        driver = new ChromeDriver();
        //Goto designated url to run test case
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        // clear all cookies created and quit selenium driver
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }
}