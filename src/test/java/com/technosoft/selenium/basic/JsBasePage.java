package com.technosoft.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by taniaamin on 2/1/18.
 */
public class JsBasePage extends DriverWrapper {


    @Test
    public static void clickOnActon() throws InterruptedException {
        WebElement element = getDriver().findElement(By.id("loginbutton"));
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("arguments[0].click():", element);
        Thread.sleep(3000);
    }

    @Test
    public static void scrollOnThePage() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        //Vertical scroll down by 200 pixels
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(10000);



    }
}