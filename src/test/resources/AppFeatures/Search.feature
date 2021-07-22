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
@Smoke
Feature: Amazon Search

  Scenario: Search a Product
    Given I have a Serach field on Amazon Page
    When I search the product with name "AppLe Note Book" and price 1000
    Then Product with name "AppLe Note Book" should be dispayed

  Scenario: Add to Cart
    Given I have a product name "Apple" with Price 1000
    When I click on add to Cart
    Then The product "Apple" should be added to the cart
