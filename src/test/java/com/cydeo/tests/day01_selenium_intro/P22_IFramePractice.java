package com.cydeo.tests.day01_selenium_intro;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P22_IFramePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void iframetest(){
        driver.get("https://practice.cydeo.com/iframe");

        //driver.switchTo().frame(0);
        //using number of iframe

        driver.switchTo().frame("mce_0_ifr");
        //using id or name attribute value

        WebElement IFRAME = driver.findElement(By.id("mc3_0_ifr"));
        driver.switchTo().frame(IFRAME);
        //using locating of iframe element

        WebElement textArea = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        Assert.assertTrue(textArea.isDisplayed());

      //  driver.switchTo().parentFrame(); //if you have nested iframe which is iframe inside another iframe, it will take you to parent frame.
        driver.switchTo().defaultContent(); //it will take you to the directly main html

        WebElement homeLink = driver.findElement(By.linkText("Home"));
        Assert.assertTrue(homeLink.isDisplayed());

        driver.quit();

    }
}
