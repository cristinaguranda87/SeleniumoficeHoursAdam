package com.cydeo.tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01FacebookCheck {
    public static void main(String[] args) {
 /*
 TC #1: Facebook title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify title:
Expected: “Facebook – log in or sign up”
  */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//2. Go to https://www.facebook.com
       driver.get("https://www.facebook.com");










    }
}
