package com.the.internet.herokuapp.automation.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import static net.serenitybdd.core.Serenity.getDriver;

@DefaultUrl("https://the-internet.herokuapp.com/")

public class HomePage
{
    By formAuthentication = By.xpath("//a[@href='/login']");

    public void clickFormAuthentication()
    {
        getDriver().findElement(formAuthentication).click();
    }

    public void open()
    {

    }
}
