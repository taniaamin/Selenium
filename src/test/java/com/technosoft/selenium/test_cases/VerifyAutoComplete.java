package com.technosoft.selenium.test_cases;

import com.technosoft.selenium.basic.BasePage;
import com.technosoft.selenium.basic.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by taniaamin on 1/29/18.
 */
public class VerifyAutoComplete extends BasePage {

    @Test
    public void testAutoComplete() throws InterruptedException{
        //click on 'flight' tab on Expedia website
        clickOn(By.id("tab-flight-tab-hp"));
        //click on 'origin' field and type in 'dallas' to find a list of al airports on that location
        sendInput(By.xpath("//*[@id='gcw-flights-form-hp-flight']/div[3]/div[1]/div/div[1]/label"),"dallas");
        // pause for 2 seconds
        Thread.sleep(2000);
        //get the 'list' locator
        clickFromAutoCompleteByText(By.className("display-group-results"), "Fort Worth Intl.,");

            }
        }