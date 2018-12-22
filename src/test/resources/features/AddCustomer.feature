#Author: SyntaxTeam
Feature: Add customer

  Background: 
    Given I logged into OrangeHRM

  Scenario Outline: 
    And I am on Time Module
    And I click Project info and select Customers
    And I click on Add button
    And I add "<name>" and "<description>"
    And I click Save
    Then I see that the "<name>" is displayed in the Customers table

    Examples: 
      | name      | description |
      | helllllo | world       |
