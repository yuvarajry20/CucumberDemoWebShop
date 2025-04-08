package com.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = {"pretty",
		"json:target/cucumber-reports/Cucumber.json",
		"html:target/cucumber-reports/Cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features={"src/test/resources/features/Login to demoWebShop.feature","src/test/resources/features/verfiy changePassword.feature","src/test/resources/features/verfiy AddAddress.feature"},
glue="com.definitions")
public class runnerTestNG extends AbstractTestNGCucumberTests {

}
