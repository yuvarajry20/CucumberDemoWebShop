package com.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pages.LoginPageLocators;
import com.utilities.HelperClass;

public class LoginPageAction {
	LoginPageLocators loginPageLocaters=null;

    public LoginPageAction() {
        this.loginPageLocaters = new LoginPageLocators();
        PageFactory.initElements(HelperClass.getDriver(),loginPageLocaters);
    }
    public void provideEmailAndPassword(String email, String password) {
        loginPageLocaters.Email.sendKeys(email);
        loginPageLocaters.Pasword.sendKeys(password);
    }

    public void clickLogIn() {
        loginPageLocaters.login.click();
    }
}
