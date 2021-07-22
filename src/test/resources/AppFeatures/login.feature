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


# Data Driven Testing using Scenerio Outline 

Feature: Login Feature
Scenario Outline: Login Fail Possible Combinations
Given USer is on application
When User clicks on sign in button
Then User displayed login screen
When user enters "<userName>" in userName field
And user enters"<Password>" in password field
Then User gets login failed error message with "<userName>" with "<Password>"
Examples:
	|	userName	|	Password	|
	|anc				|  123			|
	|xyz				|	345				|
	

