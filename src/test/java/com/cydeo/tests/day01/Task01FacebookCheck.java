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
        WebDriver driver = new ChromeDriver();//polymorphism
        driver.manage().window().maximize();// method chaining

//2.
// Go to https://www.facebook.com
       driver.get("https://www.facebook.com");
       String actualTitle = driver.getTitle();
       if (actualTitle.equals("Facebook - log in or sign up")){
       System.out.println("PASSED!");
       }else {
        System.out.println("FAILED!");
       }
     //   System.out.println("actualTitle = " + actualTitle);
driver.close();

    }
}
