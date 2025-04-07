package com.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pages.ChangePasswordPageLocaters;
import com.utilities.HelperClass;

public class ChangePasswordPageAction {
    ChangePasswordPageLocaters changePasswordPageLocaters=null;

    public ChangePasswordPageAction() {
        this.changePasswordPageLocaters = new ChangePasswordPageLocaters();
        PageFactory.initElements(HelperClass.getDriver(), changePasswordPageLocaters);
    }

    public void clickMyEmail() {
        changePasswordPageLocaters.myEmail.click();
    }

    public void clickChangePassword() {
        changePasswordPageLocaters.changePassword.click();
    }

    public void provideOldPassword(String oldPassword) {
        changePasswordPageLocaters.oldPassword.sendKeys(oldPassword);
    }

    public void provideNewPassword(String newPassword, String confirmPassword) {
        changePasswordPageLocaters.newPassword.sendKeys(newPassword);
        changePasswordPageLocaters.ConfirmNewPassword.sendKeys(confirmPassword);
    }

    public void clickChangePasswordButton() {
        changePasswordPageLocaters.clickchangePassword.click();
    }
}
