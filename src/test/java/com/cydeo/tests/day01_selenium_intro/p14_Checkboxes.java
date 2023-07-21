package com.cydeo.tests.day01_selenium_intro;

import com.cydeo.tests.utilities.BrowserUtilities;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class p14_Checkboxes {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement checbox1 = driver.findElement(By.id("box1"));
        System.out.println("Before clicking checbox1.isSelected() = " + checbox1.isSelected());
        checbox1.click();

        BrowserUtilities.sleep(3);

        System.out.println("After clicking checbox1.isSelected() = " + checbox1.isSelected());

        System.out.println("checbox1.isEnabled() = " + checbox1.isEnabled());


    }
}

