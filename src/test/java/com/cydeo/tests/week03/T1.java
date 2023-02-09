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

public class T1 extends VyTrackBase {  //      I extend the "VyTrackBase" from base package



    /*
TC 1
1- As a user I should be able to see the
labels [“Home”,”About us”,”Our Approach”,”Products and Services”,”Contact”,”LOGIN”]
1- Open a chrome browser
2- Go to "https://vytrack.com/"
3- Verify that ["Home","About us","Our Approach",
"Products and Services","Contact","LOGIN"] is displayed
     */

    @Test
    public void verifyMenuBaner() {
List<String> expectedLabels  = new ArrayList<>((Arrays.asList("Home","About us","Our Approach",
                                                                "Products and Services","Contact","LOGIN")));

List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='top-menu']/li"));
List<String> actualLabels=  BrowserUtils.getTexts(elements); //i call the method from utility clas

//System.out.println("actualLabels = " + actualLabels);
//System.out.println("expectedLabels = " + expectedLabels);

 Assert.assertEquals(actualLabels, expectedLabels);
    }

    }
