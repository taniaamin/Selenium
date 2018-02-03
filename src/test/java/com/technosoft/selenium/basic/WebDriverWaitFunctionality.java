package com.technosoft.selenium.basic;

/**
 * Created by taniaamin on 2/1/18.
 */

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebDriverWaitFunctionality extends DriverWrapper{

    // Implicit wait
    @Test
    public void implicitWait() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().get("http://url_that_delays_loading");
        WebElement myDynamicElement = getDriver().findElement(By.id("someElementID"));
    }

    // This is the most common wait function used in selenium
    public static WebElement webDriverFluentWait(final By locator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotFoundException.class)
                .withMessage(
                        "Webdriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown");

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });

        return element;
    }

    @Test
    public void clickOnElement() {
        webDriverFluentWait(By.id("someElementID")).click();
    }

    //Expected wait
    public static void waitUntilElementClickable() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("someID")));
    }

    //Page Load wait
    public static void pageLoadWait() {
        getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    //Script timeout
    public static void asynchronousScript() {
        getDriver().manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    }
}

