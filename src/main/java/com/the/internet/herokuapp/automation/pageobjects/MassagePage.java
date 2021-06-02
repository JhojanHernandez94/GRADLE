package com.the.internet.herokuapp.automation.pageobjects;

import org.openqa.selenium.By;
import static net.serenitybdd.core.Serenity.getDriver;

public class MassagePage {

    By messageLogin = By.id("flash");

    public String messageLogin()
    {
        return getDriver().findElement(messageLogin).getText().replace("\n", "").substring(0,30);
    }
}
