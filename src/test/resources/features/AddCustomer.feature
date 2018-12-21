#Author: SyntaxTeam

Feature: Add customer

Background: 
Given I logged into OrangeHRM

Scenario:

And I am on Time Module
And I click Project info and select Customers
And I click on Add button
And I add "mammal" and "test"
And I click Save
Then I see that the customer is displayed in the Customers table



