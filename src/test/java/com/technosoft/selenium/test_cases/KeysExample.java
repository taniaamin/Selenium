package com.technosoft.selenium.test_cases;

import com.technosoft.selenium.basic.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;

/**
 * Created by taniaamin on 2/1/18.
 */
public class KeysExample extends DriverWrapper{

    @Test
    public void useKeys() throws InterruptedException, AWTException {
//         getDriver().findElement(By.id("loginbutton")).sendKeys(Keys.ENTER);
//         Thread.sleep(3000);

        //WebElement to which the keyboard actions are performed
        WebElement emailTextField = getDriver().findElement(By.id("email"));


        //Creating object of Actions class
        Actions builder = new Actions(getDriver());

        //Generating an action to type a text in CAPS
        Action typeInCAPS = builder.keyDown(emailTextField, Keys.SHIFT)
                .sendKeys(emailTextField, "mmuntakim@technosoft.io")
                .keyUp(emailTextField, Keys.SHIFT)
                .build();

        //Performing the typeInCAPS action
        typeInCAPS.perform();
    }
}

