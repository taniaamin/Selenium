package com.technosoft.selenium.test_cases;

import com.technosoft.selenium.basic.DriverWrapper;
import com.technosoft.selenium.pages.LandingPage;
import com.technosoft.selenium.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyInvalidLogin extends DriverWrapper {


    @Test
    public void verifyLogin() {
        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();
        landingPage.enterEmail("tania@yahoooo.com");
        landingPage.enterPassword("test1234");
        landingPage.clickOnLoginButton();
        //Verify
        Assert.assertEquals(loginPage.getRecoverAccountLinkText(), "Recover Your Account");

   }


}

