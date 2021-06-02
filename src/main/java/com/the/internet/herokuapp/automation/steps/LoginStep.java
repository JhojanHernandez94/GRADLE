package com.the.internet.herokuapp.automation.steps;

import com.the.internet.herokuapp.automation.pageobjects.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {

    LoginPage loginPage = new LoginPage();

    @Step
    public void login()
    {
        loginPage.setUserName();
        loginPage.setPassword();
        loginPage.clickLoginButton();
    }
}
