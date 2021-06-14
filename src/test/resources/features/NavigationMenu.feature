@Navigate
Feature:Navigate to pages using the top menu

  Scenario: Fleet to Vehicles
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates from Fleet to Vehicles
    Then check the title Vehicles

    @db
  Scenario: Marketing to Campaigns
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates from Marketing to Campaigns
    Then check the title Campaigns

  Scenario: Activities to Calendar Events
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates from Activities to Calendar Events
    Then check the title Calendars