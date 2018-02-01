package com.technosoft.selenium.test_cases;

        import com.technosoft.selenium.basic.BasePage;
        import com.technosoft.selenium.basic.DriverWrapper;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;

        import org.openqa.selenium.support.ui.Select;
        import org.testng.Assert;
        import org.testng.annotations.Test;

        import java.util.List;

public class VerifyDropDown extends BasePage {

    @Test
    public void selectFromDropDown() throws Exception {

        // Select element by visible text
        selectDropDownByText(By.id("month"),"Jan");
        Thread.sleep(5000);


        // Select element by index
        selectDropDownByIndex(By.id("month"), 3);
        Thread.sleep(5000);


        // Select element by value
        selectDropDownByValue(By.id("month"), "4");
        Thread.sleep(5000);


        // verification
        Select dropDown = new Select(DriverWrapper.getDriver().findElement(By.id("month")));
        List<WebElement> allOptions = dropDown.getOptions();
        boolean isFound = false;
        for(WebElement option : allOptions){
            if(option.getText().equals("Jan")) {
                System.out.println("January Was found in Dropdown ");
                isFound = true;
                break;
            }
        }
        if(!isFound) {
            Assert.fail("Specified month was not found in monthDropDown");
        }
    }
}