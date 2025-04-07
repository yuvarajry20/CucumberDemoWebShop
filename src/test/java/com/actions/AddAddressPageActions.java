//package com.actions;
//
//import com.pages.AddAddressPageLocaters;
//import com.utilities.HelperClass;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.PageFactory;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//public class AddAddressPageActions {
//    private AddAddressPageLocaters addAddressPageLocaters=null;
//    private Properties prop;
//
//    public AddAddressPageActions() {
//        this.addAddressPageLocaters = new AddAddressPageLocaters();
//        PageFactory.initElements(HelperClass.getDriver(), addAddressPageLocaters);
//        
//        prop = new Properties();
//        try {
//            File file = new File("C:\\Users\\yuvar\\selenium\\CucumberDemoWebShop\\src\\test\\resources\\testdata.properties");
//            FileInputStream fileInput = new FileInputStream(file);
//            prop.load(fileInput);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void fillAddressForm() {
//        String firstName = prop.getProperty("address.FirstName");
//        String lastName = prop.getProperty("address.LastName");
//        String email = prop.getProperty("address.Email");
//        String company = prop.getProperty("address.Company");
//        String country = prop.getProperty("address.Country");
//        String city = prop.getProperty("address.City");
//        String address1 = prop.getProperty("address.Address1");
//        String zipCode = prop.getProperty("address.ZipCode");
//        String phoneNumber = prop.getProperty("address.PhoneNumber");
//
//        addAddressPageLocaters.firstNameField.sendKeys(firstName);
//        addAddressPageLocaters.lastNameField.sendKeys(lastName);
//        addAddressPageLocaters.emailField.sendKeys(email);
//        addAddressPageLocaters.companyField.sendKeys(company);
//        new Select(addAddressPageLocaters.countryDropdown).selectByVisibleText(country);
//        addAddressPageLocaters.AddressCity.sendKeys(city);
//        addAddressPageLocaters.Address1.sendKeys(address1);
//        addAddressPageLocaters.ZipCode.sendKeys(zipCode);
//        addAddressPageLocaters.PhoneNumber.sendKeys(phoneNumber);
//    }
//
//    public void clickAddNew() {
//        addAddressPageLocaters.addNew.click();
//    }
//
//    public void clickSave() {
//        addAddressPageLocaters.save.click();
//    }
//
//    public void clickMyEmail() {
//        addAddressPageLocaters.myEmail.click();
//    }
//
//    public void clickAddressesAndAddNew() {
//        addAddressPageLocaters.addressesLink.click();
//        addAddressPageLocaters.addNew.click();
//    }
//}

//package com.actions;
//
//import com.pages.AddAddressPageLocaters;
//import com.utilities.ExcelReader;
//import com.utilities.HelperClass;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.PageFactory;
//
//import java.io.IOException;
//
//public class AddAddressPageActions {
//    private AddAddressPageLocaters addAddressPageLocaters = null;
//
//    public AddAddressPageActions() {
//        this.addAddressPageLocaters = new AddAddressPageLocaters();
//        PageFactory.initElements(HelperClass.getDriver(), addAddressPageLocaters);
//    }
//
//    public void fillAddressForm() {
//        String filePath = "C:\\Users\\yuvar\\selenium\\CucumberDemoWebShop\\src\\test\\resources\\testdataExcel.xlsx";
//        String sheetName = "AddressData";
//
//        ExcelReader excelReader = new ExcelReader();
//        try {
//            String[][] data = excelReader.getExcelData(filePath, sheetName);
//
//            if (data.length > 1) { 
//                String firstName = data[1][0];
//                String lastName = data[1][1];
//                String email = data[1][2];
//                String company = data[1][3];
//                String country = data[1][4];
//                String city = data[1][5];
//                String address1 = data[1][6];
//                String zipCode = data[1][7];
//                String phoneNumber = data[1][8];
//
//                addAddressPageLocaters.firstNameField.sendKeys(firstName);
//                addAddressPageLocaters.lastNameField.sendKeys(lastName);
//                addAddressPageLocaters.emailField.sendKeys(email);
//                addAddressPageLocaters.companyField.sendKeys(company);
//                new Select(addAddressPageLocaters.countryDropdown).selectByVisibleText(country);
//                addAddressPageLocaters.AddressCity.sendKeys(city);
//                addAddressPageLocaters.Address1.sendKeys(address1);
//                addAddressPageLocaters.ZipCode.sendKeys(zipCode);
//                addAddressPageLocaters.PhoneNumber.sendKeys(phoneNumber);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void clickAddNew() {
//        addAddressPageLocaters.addNew.click();
//    }
//
//    public void clickSave() {
//        addAddressPageLocaters.save.click();
//    }
//
//    public void clickMyEmail() {
//        addAddressPageLocaters.myEmail.click();
//    }
//
//    public void clickAddressesAndAddNew() {
//        addAddressPageLocaters.addressesLink.click();
//        addAddressPageLocaters.addNew.click();
//    }
//}

package com.actions;

import com.pages.AddAddressPageLocaters;
import com.utilities.ExcelReader;
import com.utilities.HelperClass;
import com.utilities.LogManagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AddAddressPageActions {
    private AddAddressPageLocaters addAddressPageLocaters = null;

    public AddAddressPageActions() {
        this.addAddressPageLocaters = new AddAddressPageLocaters();
        PageFactory.initElements(HelperClass.getDriver(), addAddressPageLocaters);
        LogManagers.logInfo("Initialized AddAddressPageActions");
    }

    public void fillAddressForm() {
        String filePath = "C:\\Users\\yuvar\\selenium\\CucumberDemoWebShop\\src\\test\\resources\\testdataExcel.xlsx";
        String sheetName = "AddressData";

        ExcelReader excelReader = new ExcelReader();
        try {
            String[][] data = excelReader.getExcelData(filePath, sheetName);

            if (data.length>1) {
                String firstName = data[1][0];
                String lastName = data[1][1];
                String email = data[1][2];
                String company = data[1][3];
                String country = data[1][4];
                String city = data[1][5];
                String address1 = data[1][6];
                String zipCode = data[1][7];
                String phoneNumber = data[1][8];

                addAddressPageLocaters.firstNameField.sendKeys(firstName);
                addAddressPageLocaters.lastNameField.sendKeys(lastName);
                addAddressPageLocaters.emailField.sendKeys(email);
                addAddressPageLocaters.companyField.sendKeys(company);
                new Select(addAddressPageLocaters.countryDropdown).selectByVisibleText(country);
                addAddressPageLocaters.AddressCity.sendKeys(city);
                addAddressPageLocaters.Address1.sendKeys(address1);
                addAddressPageLocaters.ZipCode.sendKeys(zipCode);
                addAddressPageLocaters.PhoneNumber.sendKeys(phoneNumber);

                LogManagers.logInfo("Address form filled successfully");
            } else {
                LogManagers.logError("Data is null or does not contain enough rows/columns.");
            }
        } catch (IOException e) {
            LogManagers.logError("Error reading Excel data", e);
        }
    }

    public void clickAddNew() {
        addAddressPageLocaters.addNew.click();
        LogManagers.logInfo("Clicked 'Add New'");
    }

    public void clickSave() {
        addAddressPageLocaters.save.click();
        LogManagers.logInfo("Clicked 'Save'");
    }

    public void clickMyEmail() {
        addAddressPageLocaters.myEmail.click();
        LogManagers.logInfo("Clicked 'My Email'");
    }

    public void clickAddressesAndAddNew() {
        addAddressPageLocaters.addressesLink.click();
        addAddressPageLocaters.addNew.click();
        LogManagers.logInfo("Clicked 'Addresses' and 'Add New'");
    }
}