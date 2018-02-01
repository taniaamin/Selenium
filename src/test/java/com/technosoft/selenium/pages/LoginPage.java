package com.technosoft.selenium.pages;

import com.technosoft.selenium.basic.BasePage;
import org.openqa.selenium.By;


public class LoginPage extends BasePage {

    //Locators
    private By recoverEmailLink = By.xpath("//a[contains(@href,'facebook.com/recover/')]"); //linkText("Recover Your Account");

    public String getRecoverAccountLinkText() {
        return getTextFromElement(recoverEmailLink);
    }
}
