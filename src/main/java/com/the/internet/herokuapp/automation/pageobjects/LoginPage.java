package com.the.internet.herokuapp.automation.pageobjects;

import org.openqa.selenium.By;
import static net.serenitybdd.core.Serenity.getDriver;

public class LoginPage {

    By userName = By.name("username");
    By password = By.id("password");
    By loginButton = By.xpath("//button[@type='submit']");

    public void setUserName()
    {
        getDriver().findElement(userName).sendKeys("tomsmith");
    }
    public void setPassword(){
        getDriver().findElement(password).sendKeys("SuperSecretPassword!");
    }
    public void clickLoginButton(){
        getDriver().findElement(loginButton).click();
    }

}
