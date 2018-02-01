package com.technosoft.selenium.test_cases;

import com.technosoft.selenium.basic.BasePage;
import com.technosoft.selenium.basic.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


public class verifyRadioButton extends BasePage {


    @Test
        public void findGenderByList() throws InterruptedException {

        selectRadioButton(By.name("sex"), "value", "1");
        //use name title to find both the genders
         //female value = "1" in page source

        }
    }




