//package com.actions;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//
//import com.pages.LoginPageLocators;
//import com.utilities.HelperClass;
//
//public class LoginPageAction {
//	LoginPageLocators loginPageLocaters=null;
//
//    public LoginPageAction() {
//        this.loginPageLocaters = new LoginPageLocators();
//        PageFactory.initElements(HelperClass.getDriver(),loginPageLocaters);
//    }
//    public void provideEmailAndPassword(String email, String password) {
//        loginPageLocaters.Email.sendKeys(email);
//        loginPageLocaters.Pasword.sendKeys(password);
//    }
//
//    public void clickLogIn() {
//        loginPageLocaters.login.click();
//    }
//}
package com.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pages.LoginPageLocators;
import com.utilities.HelperClass;
import com.utilities.LogManagers;

public class LoginPageAction {
    LoginPageLocators loginPageLocaters = null;

    public LoginPageAction() {
        this.loginPageLocaters = new LoginPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), loginPageLocaters);
        LogManagers.logInfo("Initialized LoginPageAction");
    }

    public void provideEmailAndPassword(String email, String password) {
        loginPageLocaters.Email.sendKeys(email);
        loginPageLocaters.Pasword.sendKeys(password);
        LogManagers.logInfo("Provided email and password");
    }

    public void clickLogIn() {
        loginPageLocaters.login.click();
        LogManagers.logInfo("Clicked 'Log In'");
    }
}