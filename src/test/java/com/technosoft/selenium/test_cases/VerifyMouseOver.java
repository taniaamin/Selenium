package com.technosoft.selenium.test_cases;

import com.technosoft.selenium.basic.BasePage;
import com.technosoft.selenium.basic.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * Created by taniaamin on 1/29/18.
 */
public class VerifyMouseOver extends BasePage {

    @Test
    public void mouseOver() throws InterruptedException {
        handleMouseOver(By.id("nav-link-accountList"));
        Thread.sleep(2000);
        clickOn(By.linkText("Sign in"));
        Thread.sleep(2000);


    }

}
