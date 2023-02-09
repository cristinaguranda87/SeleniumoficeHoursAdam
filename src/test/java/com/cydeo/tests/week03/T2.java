package com.cydeo.tests.week03;

import com.cydeo.tests.base.VyTrackBase;
import com.cydeo.tests.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T2 extends VyTrackBase {
    /*
TC 2- As a user I should be able to see the labels
["Our Mission and Vision","Car Fleet Management","Newest Technologies"] under Our Approach
Open a chrome browser Go to "https://vytrack.com/"
"Verify that ["Our Mission and Vision","Car Fleet Management","Newest Technologies"] is displayed
 */
    @Test
    public void t2() {
        driver.findElement(By.xpath("//ul[@id='top-menu']/li[3]")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='top-menu']/li[3]/ul/li"));
        List<String> actualLabels = BrowserUtils.getTexts(elements);
        List<String>expectedLabels = new ArrayList<>(Arrays.asList("Our Mission and Vision","Car Fleet Management","Newest Technologies"));

        for (String expectedlabel : actualLabels) {
            Assert.assertTrue(actualLabels.contains(expectedlabel));
        }



    }
}