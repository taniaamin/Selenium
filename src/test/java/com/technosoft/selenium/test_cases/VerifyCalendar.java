package com.technosoft.selenium.test_cases;

import com.technosoft.selenium.basic.BasePage;
import com.technosoft.selenium.basic.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by taniaamin on 1/28/18.
 */
public class VerifyCalendar extends BasePage {

    @Test
    public void selectCurrentDateFromCalender() throws InterruptedException{
        SimpleDateFormat sdf = new SimpleDateFormat("d");
        Date date = new Date();
        String todayDate = sdf.format(date);

        clickOn(By.id("qf-0q-localised-check-in"));
        selectFromCalendar(By.xpath(".//*[@class='widget-datepicker-bd']/descendant::a"));

        List<WebElement> days = getDriver().findElements(By.xpath(".//*[@class='widget-datepicker-bd']/descendant::a"));

    }

    Calendar cal = Calendar.getInstance();

    String time= new SimpleDateFormat("HH").format(cal.getTime());
}

