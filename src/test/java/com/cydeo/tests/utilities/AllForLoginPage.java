package com.cydeo.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllForLoginPage {

////I CREATE A METHOD FOR CLICKING ON BUTTONS
    public static void clicModule(WebDriver driver, String modulName) {
        String locator = "//a[contains(.,'" + modulName + "')]";
        driver.findElement(By.xpath(locator)).click();
    }
}