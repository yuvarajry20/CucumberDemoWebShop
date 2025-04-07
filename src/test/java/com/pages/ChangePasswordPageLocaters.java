package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPageLocaters {
	@FindBy(xpath="//a[text()=\"abccy@gmail.com\"]")
	public WebElement myEmail;
	
	@FindBy(xpath="//a[text()='Change password']")
	public WebElement changePassword;
	
	@FindBy(id="OldPassword")
	public WebElement oldPassword;
	
	@FindBy(id="NewPassword")
	public WebElement newPassword;
	
	@FindBy(id="ConfirmNewPassword")
	public WebElement ConfirmNewPassword;
	
	@FindBy(xpath="//input[@class='button-1 change-password-button']")
	public WebElement clickchangePassword;
}
