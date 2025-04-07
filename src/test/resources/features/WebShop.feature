#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: DemoWebShop
  I want to use this template for my feature file

  @ValidCredentials
  Scenario: LoginPageValid
    Given I want to be in the demowebshop "https://demowebshop.tricentis.com/login"
    When I provide email and password
    |email|password|
    |abccy@gmail.com|789456|
    And click log in
    
  @InvalidCredentials
  Scenario: LoginPageInvalid
    Given I want to be in the demowebshop "https://demowebshop.tricentis.com/login"
    When I provide invalid email and invalid password
    |email|password|
    |abccy@gil.com|123|
    And click log in

