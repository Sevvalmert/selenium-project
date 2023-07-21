package com.cydeo.tests.day01_selenium_intro;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class P23_WindowHandling {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void windowHandlingTest(){
       driver.get("https://practice.cydeo.com/windows");
       String currentWindowHandle = driver.getWindowHandle();
        System.out.println("currentWindowHandle = " + currentWindowHandle);


        driver.findElement(By.linkText("Click here")).click();

        System.out.println("currentWindowHandle = " + currentWindowHandle);

       Set<String> allWindows =  driver.getWindowHandles();

        System.out.println("allWindows = " + allWindows);

        for (String eachWindow : allWindows) {
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());



        }


    }

}
