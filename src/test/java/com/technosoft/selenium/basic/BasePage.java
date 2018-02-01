package com.technosoft.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class BasePage extends DriverWrapper {

// base method for click
    public void clickOn(By locator) {
        DriverWrapper.getDriver().findElement(locator).click();
    }

// base method for input in a selected field
    public void setValueToInputField(String value, By locator) {
        DriverWrapper.getDriver().findElement(locator).sendKeys(value);
    }

//    Method to send input
    public void sendInput(By locator, String string) {
        DriverWrapper.getDriver().findElement(locator).sendKeys(string);
    }

// base method to get text from an element
    public String getTextFromElement(By locator) {
        return DriverWrapper.getDriver().findElement(locator).getText();
    }

// base method for isElements
    public boolean isDisplayed(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isDisplayed();
    }

    public boolean isEnablead(By locator) {

        return DriverWrapper.getDriver().findElement(locator).isEnabled();
    }

    public boolean isSelected(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isSelected();
    }

// base method for dropdown, we should have options to select by text, index and value
    public void selectDropDownByText(By locator, String text) {
        Select dropDown = new Select(DriverWrapper.getDriver().findElement(locator));
        dropDown.selectByVisibleText(text);
    }

    public void selectDropDownByIndex(By locator, int index) {
        Select dropDown = new Select(DriverWrapper.getDriver().findElement(locator));
        dropDown.selectByIndex(index);
    }

    public void selectDropDownByValue(By locator, String value) {
        Select dropDown = new Select(DriverWrapper.getDriver().findElement(locator));
        dropDown.selectByValue(value);
    }

//base method for radio button
    public void selectRadioButton (By locator, String attribute, String index){
        List<WebElement> listOfLinks = getDriver().findElements(locator);
        for (WebElement element : listOfLinks ){
            String value = element.getAttribute(attribute);
            if(value.equals(index)){
                element.click();
                break;
            }
        }
    }
//base method to get date from calender
    public void selectFromCalendar(By locator) {
        SimpleDateFormat sdf = new SimpleDateFormat("d");
        Date date = new Date();
        String todayDate = sdf.format(date);
        List<WebElement> days = getDriver().findElements(locator);

        for (WebElement day : days) {
            String expectedDay = day.getText();
            if (expectedDay.equals(todayDate)) {
                day.click();
                break;
            }
        }
    }



// base method to switch to new window and also another method to switch to root window.
    //switch to a particular window using index
    public void switchToWindow(int index) {
        List<String> listOfWindows = new ArrayList<>(DriverWrapper.getDriver().getWindowHandles());
        DriverWrapper.getDriver().switchTo().window(listOfWindows.get(index));
    }

    //close current window and switch to initial window
    public void switchToInitialWindowAndCloseCurrentWindow() {
        List<String> listOfWindows = new ArrayList<>(DriverWrapper.getDriver().getWindowHandles());
        for (int i = 1; i < listOfWindows.size(); i++) {
            DriverWrapper.getDriver().switchTo().window(listOfWindows.get(i));
            DriverWrapper.getDriver().close();
        }
        DriverWrapper.getDriver().switchTo().window(listOfWindows.get(0));
    }

// base method to handle mouseover
    public void handleMouseOver(By locator) {
        WebElement element = DriverWrapper.getDriver().findElement(locator);
        Actions action = new Actions(DriverWrapper.getDriver());
        action.moveToElement(element).build().perform();
    }

    public void switchToFrame(String string) {
        getDriver().switchTo().frame(string);
    }

    public void acceptAlert() {
        getDriver().switchTo().alert().accept();
    }

    public void dismissAlert() {
        getDriver().switchTo().alert().dismiss();
    }

    public void sendInputToAlert(String string) {
        getDriver().switchTo().alert().sendKeys(string);
    }


// base method for all of alert functionality.

    public void clickFromAutoCompleteByText(By locator, String string) throws InterruptedException {
        List<WebElement> list = getDriver().findElements(locator);
        for (WebElement e : list){
            if(e.getText().contains(string)){
                e.click();
                Thread.sleep(2000);
                break;


            }

        }

    }
}