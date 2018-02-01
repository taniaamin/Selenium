

package com.technosoft.selenium.test_cases;

import com.technosoft.selenium.basic.DriverWrapper;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SampleTestNG extends DriverWrapper {


    @Test
    public void verifyTitle(){
        //Get current title
        String currentTitle = getDriver().getTitle();


        //Verify if URL is correct
        Assert.assertEquals(currentTitle, "Facebook - Log In or Sign Up", "Invalid Title" );
    }


    @Test
    public void verifyUrl() {
        //Get current URL
        String currentURL = getDriver().getCurrentUrl();

        //Verify if URL is correct
        Assert.assertEquals(currentURL, "https://www.facebook.com/", "Invalid URL");
    }

}



