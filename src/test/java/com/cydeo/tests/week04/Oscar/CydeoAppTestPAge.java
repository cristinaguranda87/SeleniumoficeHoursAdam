package com.cydeo.tests.week04.Oscar;

import com.cydeo.tests.utilities.Driver;
import org.testng.annotations.BeforeMethod;

public class CydeoAppTestPAge extends CydeoPracticePage{

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("https://practice.cydeo.com");

    }
}
