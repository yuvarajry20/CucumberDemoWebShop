package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	@FindBy(id="Email")
	public WebElement Email;
	
	@FindBy(id="Password")
	public WebElement Pasword;
	
	@FindBy(xpath="//input[@class=\"button-1 login-button\"]")
	public WebElement login;
}
