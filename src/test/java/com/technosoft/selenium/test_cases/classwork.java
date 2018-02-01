package com.technosoft.selenium.test_cases;

import com.technosoft.selenium.basic.BasePage;
import com.technosoft.selenium.basic.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by taniaamin on 1/31/18.
 */
public class classwork extends BasePage {

    @Test
    public void getTime() throws InterruptedException {

        List<WebElement> list = getDriver().findElements(By.xpath("//*[@id='timeline']/div/div[3]"));
        for (WebElement e : list){
            System.out.println(e.getText());


        }

    }


    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HH");
    String time= sdf.format(cal.getTime());
    for(i=time)
}
