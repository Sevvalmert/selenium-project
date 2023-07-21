package com.cydeo.tests.day01_selenium_intro;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P32_ExplicitWaitPractice {

    @Test
    public void explictiWaitTest(){

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/2");

        Driver.getDriver().findElement(By.xpath("//button[.='Start']")).click();

       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        WebElement loading = Driver.getDriver().findElement(By.id("loading"));

      //  wait.until(ExpectedConditions.invisibilityOf(loading));

        WebElement helloWorlText = Driver.getDriver().findElement(By.xpath("//h4[.='Hello World!']"));

        Assert.assertTrue(helloWorlText.isDisplayed());

    }
}
