package com.cydeo.tests.week03;

import com.cydeo.tests.base.VyTrackBase;
import com.cydeo.tests.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3 extends VyTrackBase {
    /*
    TC 3: As a User I should be able to see MIDDLE label
1- Open a chrome browser
2- Go to https://the-internet.herokuapp.com/
3- Click Nested Frames
4- Verify the MIDDLE labe
     */



    @Test
    public void test1() {
        clickSubMenu("Product","Fleet");
        Assert.assertTrue(driver.getCurrentUrl().contains("fleet-analysis-and-optimization"));

    }

    @Test
    public void test2() {
        clickSubMenu("Product","Damage");
        Assert.assertTrue(driver.getCurrentUrl().contains("damage-management"));

    }

    public void clickSubMenu(String main, String subMenu) {
        clickMain(main);
        String sublocator="//ul[@id='top-menu']/li[contains(.,'"+main+"')]/ul/li[contains(.,'"+subMenu+"')]";
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath(sublocator)).click();

    }

    public void clickMain(String main) {
        String locator = "//ul[@id='top-menu']/li[contains(.,'" + main + "')]";
        driver.findElement(By.xpath(locator)).click();
    }

}
