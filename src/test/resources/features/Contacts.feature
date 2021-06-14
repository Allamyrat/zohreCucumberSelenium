@contacts
Feature: Contacts Page

@wip
  Scenario: Default Page Number
    Given the user is on the login page
    And the user enters the driver information
    When the user navigates to "Customers" "Contacts"
    Then default page number is 1


  Scenario: Menu Options
    Given the user logged in as a "driver"
    Then the user should see the following options
      |Fleet     |
      |Customers |
      |Activities|
      |System    |


  Scenario: Login as a given user
    Given the user is on the login page
    When the user logs in using following credentials
      |username | user10      |
      |password | UserUser123 |
      |firstname| Brenden     |
      |lastname | Schneider   |
    Then the user should be able to login



