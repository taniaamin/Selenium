package com.technosoft.selenium.test_cases;

import com.technosoft.selenium.basic.BasePage;
import com.technosoft.selenium.basic.DriverWrapper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taniaamin on 1/29/18.
 */
public class VerifySwitchToWindow extends BasePage {


    @Test
    public void testSwitchToWindow() throws InterruptedException {

        clickOn(By.id("privacy-link"));
        Thread.sleep(2000);

        //switch to a particular window using index
        switchToWindow(1);
        Thread.sleep(2000);

        clickOn(By.linkText("Sign Up"));
        Thread.sleep(2000);

        //close current window and switch to initial window
        switchToInitialWindowAndCloseCurrentWindow();
        Thread.sleep(2000);

    }
}
