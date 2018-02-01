package com.technosoft.selenium.pages;

import com.technosoft.selenium.basic.BasePage;
import org.openqa.selenium.By;


public class LandingPage extends BasePage {

    //Locators
    private By emailTextField = By.id("email");
    private By passTextField = By.id("pass");
    private By loginButton = By.id("loginbutton");
            //other ways to get locator for login button-
            //By.xpath("//label[@id=‘loginbutton’]");  custom xpath
            //By.xpath("//*[@id='u_0_2']");
            //By.cssSelector("#loginbutton");
            // By.xpath("//*[@id='loginbutton']");

    //Methods
    public void enterEmail(String email) {
        setValueToInputField(email, emailTextField);
    }

    public void enterPassword(String password) {
        setValueToInputField(password, passTextField);
    }

    public void clickOnLoginButton() {
        clickOn(loginButton);
    }

    //OR combine the top 3 methods into 1
    public void loginToApp(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickOnLoginButton();
    }


}
