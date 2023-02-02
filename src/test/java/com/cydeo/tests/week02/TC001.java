package com.cydeo.tests.week02;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TC001 {
    /*1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
9. Fill details: Title, Name, Email, Password, Date of birth
10. Select checkbox 'Sign up for our newsletter!'
11. Select checkbox 'Receive special offers from our partners!'
12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
13. Click 'Create Account button'
14. Verify that 'ACCOUNT CREATED!' is visible
15. Click 'Continue' button
16. Verify that 'Logged in as username' is visible
You do not have permission to send messages in this channel.


     */

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
// 2. Navigate to url 'http://automationexercise.com'
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://automationexercise.com");
    }

    @Test
    public void verifyHomePage() {
        BrowserUtils.verifyContainTitle(driver, "Automation Exercise");
    }


    @Test
    public void testName() {// Click on 'Signup / Login' button
        clicModule("Signup / Login"); //I used my utilitymethod
//Verify 'New User Signup!' is visible
        WebElement labelForSignUp =driver.findElement(By.xpath("//h2[.='New User Signup!']"));
        Assert.assertTrue(labelForSignUp.isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
//I CREATE A METHOD FOR CLICKING ON BUTTONS
    private void clicModule(String modulName) {
        String locator = "//a[contains(.,'" + modulName + "')]";
        driver.findElement(By.xpath(locator)).click();
    }
}