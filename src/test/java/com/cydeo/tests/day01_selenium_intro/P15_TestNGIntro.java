package com.cydeo.tests.day01_selenium_intro;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P15_TestNGIntro {

   @Test
    public void TestTwoPlusFive(){

       Assert.assertEquals(2+5,7);
       Assert.assertTrue(2+5==9);

}      @Test
        public void testApple() {
            Assert.assertEquals("apple", "orange");

       }
}






