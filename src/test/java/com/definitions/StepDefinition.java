package com.definitions;

import com.actions.AddAddressPageActions;
import com.actions.ChangePasswordPageAction;
import com.actions.LoginPageAction;
import com.utilities.HelperClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class StepDefinition {
    LoginPageAction loginPageAction=new LoginPageAction();
    ChangePasswordPageAction changePasswordAction=new ChangePasswordPageAction();
    AddAddressPageActions addAddressPageAction=new AddAddressPageActions();

    @Given("I want to be in the demowebshop {string}")
    public void i_want_to_be_in_the_demowebshop(String string) {
    	HelperClass.openPage(string);
    }

    @When("I provide email and password")
    public void i_provide_email_and_password(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps();
        String email = rows.get(0).get("email");
        String password = rows.get(0).get("password");
        loginPageAction.provideEmailAndPassword(email, password);
    }

    @When("click log in")
    public void click_log_in() {
        loginPageAction.clickLogIn();
    }

    @Given("I want to click my email")
    public void i_want_to_click_my_email() {
        changePasswordAction = new ChangePasswordPageAction();
        changePasswordAction.clickMyEmail();
    }

    @Then("I want to click change Password")
    public void i_want_to_click_change_password() {
        changePasswordAction.clickChangePassword();
    }

    @When("i provide oldPassword as {string}")
    public void i_provide_old_password_as(String oldPassword) {
        changePasswordAction.provideOldPassword(oldPassword);
    }

    @When("i provide newPassword as {string} and confirmPassword as {string}")
    public void i_provide_new_password_as_and_confirm_password_as(String newPassword, String confirmPassword) {
        changePasswordAction.provideNewPassword(newPassword, confirmPassword);
    }

    @Then("i click change Password")
    public void i_click_change_password() {
        changePasswordAction.clickChangePasswordButton();
    }

    @When("I provide invalid email and invalid password")
    public void i_provide_invalid_email_and_invalid_password(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps();
        String email = rows.get(0).get("email");
        String password = rows.get(0).get("password");
        loginPageAction.provideEmailAndPassword(email, password);
    }

    @When("i provide invalid oldPassword as {string}")
    public void i_provide_invalid_old_password_as(String oldPassword) {
        changePasswordAction.provideOldPassword(oldPassword);
    }

    @When("I click my email")
    public void i_click_my_email() {
        changePasswordAction.clickMyEmail();
    }

    @When("click Addressess and add new")
    public void click_addressess_and_add_new() {
        addAddressPageAction = new AddAddressPageActions();
        addAddressPageAction.clickMyEmail();
        addAddressPageAction.clickAddressesAndAddNew();
    }

    @Then("I want to add new address")
    public void i_want_to_add_new_address() {
        addAddressPageAction.fillAddressForm();
    }

    @Then("select country and state")
    public void select_country_and_state() {
        
    }

    @Then("i click save")
    public void i_click_save() {
        addAddressPageAction.clickSave();
    }
}
