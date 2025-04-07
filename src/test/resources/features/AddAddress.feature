@tag
Feature: AddAddress
  I want to use this template for my feature file

  @tag1
  Scenario: DemoShopAddAddress
    Given I want to be in the demowebshop "https://demowebshop.tricentis.com/login"
    When I provide email and password
     |email          |password  |
     |abccy@gmail.com|789456    |
    And click log in
    When I click my email
    And click Addressess and add new
    Then I want to add new address
    And select country and state
    Then i click save

