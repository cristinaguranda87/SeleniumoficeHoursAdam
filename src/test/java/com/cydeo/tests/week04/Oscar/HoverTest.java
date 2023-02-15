package com.cydeo.tests.week04.Oscar;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends CydeoAppTestPAge {
// use TestBase for before and after methods
@Test
public void test01() {

    HoverPage hoverPage = new HoverPage();
    hoverPage.clickOption("Hovers");

        for (int i = 0; i < hoverPage.images.size(); i++) {
        hoverPage.hoverOverElement(hoverPage.images.get(i));
        Assert.assertTrue(hoverPage.names.get(i).isDisplayed());
    }


    }

    }
