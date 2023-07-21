package com.cydeo.tests.day01_selenium_intro;

import com.cydeo.tests.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P13_RadioButtons {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement blueRadioButton = driver.findElement(By.xpath("//input[@id='blue']"));

        System.out.println("blueRadioButton.isSelected() = " + blueRadioButton.isSelected());

        WebElement redRadioButton = driver.findElement(By.xpath("//input[@id='red']"));

        System.out.println(" Before clicking redRadioButton.isSelected() = " + redRadioButton.isSelected());

        redRadioButton.click();

        System.out.println(" After clicking redRadioButton.isSelected() = " + redRadioButton.isSelected());

        WebElement greenRadioButton = driver.findElement(By.xpath("//input[@id='green']"));

        System.out.println("greenRadioButton.isSelected() = " + greenRadioButton.isSelected());
        greenRadioButton.click();
        System.out.println("greenRadioButton.isEnabled() = " + greenRadioButton.isEnabled());



    }
}
