@login
Feature: Login as different users

  Scenario: login as a driver
    Given the user is on the login page
    When the user enters "user10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"







    #driver, storemanager, salaesmanager
  # you will have one step definition and it will handle different usertypes