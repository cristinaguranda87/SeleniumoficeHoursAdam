package com.cydeo.tests.base;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TryCloudBAse {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
// 2. Navigate to url 'http://automationexercise.com'
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://qa2.trycloud.net/index.php/login");




    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
