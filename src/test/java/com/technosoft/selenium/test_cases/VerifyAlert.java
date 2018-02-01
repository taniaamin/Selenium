package com.technosoft.selenium.test_cases;

import com.technosoft.selenium.basic.BasePage;
import com.technosoft.selenium.basic.DriverWrapper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by taniaamin on 1/29/18.
 */
public class VerifyAlert extends BasePage {

    @Test
    public void Alert() throws InterruptedException {


        switchToFrame("iframeResult");
        clickOn(By.cssSelector("body > button"));
        Thread.sleep(5000);
        sendInputToAlert("bob");
        acceptAlert();


    }
    
}