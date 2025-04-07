package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAddressPageLocaters {
	@FindBy(xpath="//a[text()=\"abccy@gmail.com\"]")
	public WebElement myEmail;
	
	@FindBy(xpath="//a[text()='Addresses']")
	public WebElement addressesLink;
	
	@FindBy(xpath="//input[@class='button-1 add-address-button']")
	public WebElement addNew;
	
	@FindBy(id = "Address_FirstName")
	public WebElement firstNameField;

    @FindBy(id = "Address_LastName")
    public WebElement lastNameField;

    @FindBy(id = "Address_Email")
    public WebElement emailField;

    @FindBy(id = "Address_Company")
    public WebElement companyField;

    @FindBy(xpath = "//select[@name='Address.CountryId']")
    public WebElement countryDropdown;
    
    @FindBy(id="Address_City")
    public WebElement AddressCity;
    
    @FindBy(id="Address_Address1")
    public WebElement Address1;
    
    @FindBy(id="Address_ZipPostalCode")
    public WebElement ZipCode;
    
    @FindBy(id="Address_PhoneNumber")
    public WebElement PhoneNumber;
    
    @FindBy(xpath="//input[@class='button-1 save-address-button']")
    public WebElement save;
    
}
