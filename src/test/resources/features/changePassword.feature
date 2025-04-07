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
Feature: Title of your feature
  I want to use this template for my feature file

  @ValidChangePassword
  Scenario Outline: ChangePassword
  Given I want to be in the demowebshop "https://demowebshop.tricentis.com/login"
    When I provide email and password
    |email|password|
    |abccy@gmail.com|789456|
    And click log in
    Given I want to click my email
    Then I want to click change Password
    When i provide oldPassword as "<oldPassword>"
    And i provide newPassword as "<newPassword>" and confirmPassword as "<confirmPassword>"
    Then i click change Password

    Examples: 
      |oldPassword  |newPassword |confirmPassword  |
      |789456 |789456 |789456 |
      
  @InValidChangePassword
  Scenario Outline: ChangePassword
  Given I want to be in the demowebshop "https://demowebshop.tricentis.com/login"
    When I provide email and password
    |email|password|
    |abccy@gmail.com|789456|
    And click log in
    Given I want to click my email
    Then I want to click change Password
    When i provide invalid oldPassword as "<oldPassword>"
    And i provide newPassword as "<newPassword>" and confirmPassword as "<confirmPassword>"
    Then i click change Password

    Examples: 
      |oldPassword  |newPassword |confirmPassword  |
      |123478 |789456 |789456 |
