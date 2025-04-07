//package com.actions;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//
//import com.pages.ChangePasswordPageLocaters;
//import com.utilities.HelperClass;
//
//public class ChangePasswordPageAction {
//    ChangePasswordPageLocaters changePasswordPageLocaters=null;
//
//    public ChangePasswordPageAction() {
//        this.changePasswordPageLocaters = new ChangePasswordPageLocaters();
//        PageFactory.initElements(HelperClass.getDriver(), changePasswordPageLocaters);
//    }
//
//    public void clickMyEmail() {
//        changePasswordPageLocaters.myEmail.click();
//    }
//
//    public void clickChangePassword() {
//        changePasswordPageLocaters.changePassword.click();
//    }
//
//    public void provideOldPassword(String oldPassword) {
//        changePasswordPageLocaters.oldPassword.sendKeys(oldPassword);
//    }
//
//    public void provideNewPassword(String newPassword, String confirmPassword) {
//        changePasswordPageLocaters.newPassword.sendKeys(newPassword);
//        changePasswordPageLocaters.ConfirmNewPassword.sendKeys(confirmPassword);
//    }
//
//    public void clickChangePasswordButton() {
//        changePasswordPageLocaters.clickchangePassword.click();
//    }
//}

package com.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pages.ChangePasswordPageLocaters;
import com.utilities.HelperClass;
import com.utilities.LogManagers;

public class ChangePasswordPageAction {
    ChangePasswordPageLocaters changePasswordPageLocaters = null;

    public ChangePasswordPageAction() {
        this.changePasswordPageLocaters = new ChangePasswordPageLocaters();
        PageFactory.initElements(HelperClass.getDriver(), changePasswordPageLocaters);
        LogManagers.logInfo("Initialized ChangePasswordPageAction");
    }

    public void clickMyEmail() {
        changePasswordPageLocaters.myEmail.click();
        LogManagers.logInfo("Clicked 'My Email'");
    }

    public void clickChangePassword() {
        changePasswordPageLocaters.changePassword.click();
        LogManagers.logInfo("Clicked 'Change Password'");
    }

    public void provideOldPassword(String oldPassword) {
        changePasswordPageLocaters.oldPassword.sendKeys(oldPassword);
        LogManagers.logInfo("Entered old password");
    }

    public void provideNewPassword(String newPassword, String confirmPassword) {
        changePasswordPageLocaters.newPassword.sendKeys(newPassword);
        changePasswordPageLocaters.ConfirmNewPassword.sendKeys(confirmPassword);
        LogManagers.logInfo("Entered new password and confirmation");
    }

    public void clickChangePasswordButton() {
        changePasswordPageLocaters.clickchangePassword.click();
        LogManagers.logInfo("Clicked 'Change Password' button");
    }
}
