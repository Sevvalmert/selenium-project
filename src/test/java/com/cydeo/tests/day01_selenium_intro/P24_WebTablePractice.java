package com.cydeo.tests.day01_selenium_intro;

import com.cydeo.tests.base.TestBase;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P24_WebTablePractice extends TestBase {



   /* WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    } */

    @Test
    public void webTableTest(){

        driver.get("https://practice.cydeo.com/tables");

        WebElement johnCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='John']"));
        System.out.println("johnCell.getText() = " + johnCell.getText());

        List<WebElement> bodyRow3 = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[1]//td"));
        for (WebElement eachCell : bodyRow3) {
            System.out.println("eachCell.getText() = " + eachCell.getText());


        }
    }


}
