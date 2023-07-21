package com.cydeo.tests.day01_selenium_intro;

import com.cydeo.tests.utilities.BrowserUtilities;
import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P26_FileUploadPracticr {

    @Test
    public void fileUploadTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        WebElement chooseFileButton = Driver.getDriver().findElement(By.id("file-upload"));
        chooseFileButton.sendKeys("\u202AC:\\Users\\sevva\\OneDrive\\Desktop\\junit-4.13-beta-3.jar");

        BrowserUtilities.sleep(3);

        Driver.getDriver().findElement(By.id("file-submit")).click();

    }
}
