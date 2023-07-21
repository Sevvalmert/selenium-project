package com.cydeo.tests.day01_selenium_intro;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class P29_RightClickPractice {

    @Test
    public void rightclickTest(){

        Driver.getDriver().get("https://practice.cydeo.com/");

        WebElement abTestingLink = Driver.getDriver().findElement(By.linkText("A/B Testing"));

        Actions action = new Actions(Driver.getDriver());

        action.contextClick(abTestingLink)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.RETURN).perform();
    }
}
