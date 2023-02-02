package com.cydeo.tests.week02;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import com.google.common.base.Verify;
import org.bouncycastle.math.ec.ECMultiplier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;
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
       public void verifyHomePage1() {
        BrowserUtils.verifyContainTitle(driver, "Automation Exercise");
    }
    @Test
        public void testName2() {// Click on 'Signup / Login' button
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String company = faker.company().name();
        String email = faker.internet().emailAddress();

        clicModule("Signup / Login"); //I used my utilitymethod
//Verify 'New User Signup!' is visible
        WebElement labelForSignUp = driver.findElement(By.xpath("//h2[.='New User Signup!']"));
        Assert.assertTrue(labelForSignUp.isDisplayed());
//insert name
        WebElement nameBox = driver.findElement(By.xpath("//input[@name='name']"));
        nameBox.sendKeys(firstName);
//insert email
        WebElement emeilBox = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
        emeilBox.sendKeys(email);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

//Verify that 'ENTER ACCOUNT INFORMATION' is visible
        driver.findElement(By.xpath("//b[.='Enter Account Information']")).isDisplayed();
//Fill details: Title, Name, Email, Password, Date of birth
        WebElement radioButton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        radioButton.click();
        WebElement passwordBox = driver.findElement(By.xpath("//input[@id='password']"));
        passwordBox.sendKeys("amber123");

//select Day
        WebElement dayBox = driver.findElement(By.xpath("//select[@id='days']"));
        Select select1 = new Select(dayBox);
         select1.selectByVisibleText("18");
//Select Month
        WebElement monthBox = driver.findElement(By.xpath("//select[@id='months']"));
        Select select = new Select(monthBox);
        select.selectByVisibleText("March");
//Select years
         WebElement yearBox = driver.findElement(By.xpath("//select[@id='years']"));
         Select select3 = new Select(yearBox);
         select3.selectByValue("1987");

//10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
//. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//input[@id='optin']")).click();
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number


//firstname
         WebElement firstNameBox = driver.findElement(By.xpath("//input[@id='first_name']"));
         firstNameBox.sendKeys(firstName);

         WebElement lastnameBox = driver.findElement(By.xpath("//input[@id='last_name']"));
         lastnameBox.sendKeys(lastName);

        WebElement companyBox = driver.findElement(By.xpath("//input[@id='company']"));
        companyBox.sendKeys(company);





/*        @AfterMethod
        public void tearDown() {
        driver.close();

 */
    }
//I CREATE A METHOD FOR CLICKING ON BUTTONS
        private void clicModule (String modulName){
            String locator = "//a[contains(.,'" + modulName + "')]";
            driver.findElement(By.xpath(locator)).click();
        }


    }

