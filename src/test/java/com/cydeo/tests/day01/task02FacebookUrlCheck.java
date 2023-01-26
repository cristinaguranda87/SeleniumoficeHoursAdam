package com.cydeo.tests.day01;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task02FacebookUrlCheck {
    public static void main(String[] args) {
     /*
     C #2: Title and Url check
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify url contains facebook
4. Verify title contains Facebook
5. Navigate to https://www.google.com
6. Verify url contains google
7. Verify title contains Google
8. Navigate back
9. Verify url contains facebook
10.Navigate forward
11.Verify url contains google
      */
// 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
//3. Verify url contains facebook
 wait(3000);                                             //my method to whait

if(driver.getCurrentUrl().contains("facebook")){
    System.out.println("Passed");
}else {
    System.out.println("Failed");
}
//4. Verify title contains Facebook
   if ( driver.getTitle().contains("Facebook")){
       System.out.println("Title verification Passed!");
   }else {
       System.out.println("Title verification Failed!");
   }
//Navigate to https://www.google.com
  driver.navigate().to("https://www.google.com");

//6. Verify url contains google
      String actualURL =  driver.getCurrentUrl();
      String expectedlUrl ="google";

 if(actualURL.contains(expectedlUrl)){
     System.out.println("Passed");
 }else {
     System.out.println("Failed");
 }


                                                              //    werifyWordContain(actualURL,expectedlUrl)
// Verify title contains Google
 String actualTitle =driver.getTitle();
 String expectedTitle = "Google";
if (actualTitle.contains(expectedTitle)){
    System.out.println("Title verification Passed!");
}else {
    System.out.println("Title verification Failed!");
}
// Navigate back
driver.navigate().back(); //to facebook

//  Verify url contains facebook
        if(driver.getCurrentUrl().contains("facebook")){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

        wait(3000);
  //Navigate forward: Verify url contains google
  driver.navigate().forward();


    }

//Methods

    public static void wait(int seconds){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
         private static void werifyWordContain(String sentence,String word){
        if(sentence.contains(word)){
            System.out.println("Word Verification Passed!");
        }else {
            System.out.println("Word Verification Failed!");
        }
   }




}
