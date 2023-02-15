package com.cydeo.tests.week04.Oscar;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class CydeoPracticePage {
    public CydeoPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(linkText = "Home")
public WebElement homeLink;

public void clickOption(String optionText){
Driver.getDriver().findElement(By.partialLinkText(optionText)).click();


}
}