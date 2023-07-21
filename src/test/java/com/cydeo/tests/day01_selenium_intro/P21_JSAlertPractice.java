package com.cydeo.tests.day01_selenium_intro;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P21_JSAlertPractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void JSAlertTest(){
    driver.get("https://practice.cydeo.com/javascript_alerts");

        WebElement jsAlertbutton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlertbutton.click();



        Alert alert = driver.switchTo().alert();
        alert.accept(); //will click okay button

    }
}
