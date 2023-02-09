package com.cydeo.tests.week03;

import com.cydeo.tests.base.TryCloudBAse;
import com.cydeo.tests.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.bouncycastle.cms.RecipientId.password;

public class T4 extends TryCloudBAse {
    /*
   TC 4- As a user I should be able to see the password hidden
1- Open a chrome browser
2- Go to "http://qa2.trycloud.net/index.php/login"
3- Login with valid credentials
4- Verify that password s hidden
     */

    @Test
    public void testName() {
        WebElement passwordElement = driver.findElement(By.cssSelector("input[name='password']"));
        passwordElement.sendKeys("Abscdr123");
        System.out.println("passwordElement.getAttribute(\"type\") = " + passwordElement.getAttribute("type"));
        BrowserUtils.sleep(10);
        String expectedvalue = "password";
        String actalValue = passwordElement.getAttribute("type");
        Assert.assertEquals(expectedvalue, actalValue);
    }
}
