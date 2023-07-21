package com.cydeo.tests.day01_selenium_intro;

import com.cydeo.tests.utilities.BrowserUtilities;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P31_JavaSScripExecutorScrolling {

    @Test
    public void jsExeciutorScrolling(){

        Driver.getDriver().get("https://practice.cydeo.com/");

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        JavascriptExecutor js = ((JavascriptExecutor)Driver.getDriver());
        BrowserUtilities.sleep(3);
        js.executeScript("arguments[0]._scrollIntoView(true)", cydeoLink);
        BrowserUtilities.sleep(3);

        Driver.closeDriver();



    }
}
