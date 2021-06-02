package com.the.internet.herokuapp.automation.steps;

import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;

public class MassageStep {

    MessagePage messagePage = new MessagePage();

    @Step
    public void messageLogin()
    {
        Assertions.assertEquals("You logged into a secure area!", messagePage.messageLogin());
    }
}
