Feature: Account Types


  Scenario: Driver user
    Given the user logged in as a "driver"
    When the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendar Events - Activities"
    
  Scenario: Sales manager user
    Given the user logged in as a "sales manager"
    When the user navigates to "Customers" "Accounts"
    Then the title contains "Accounts - Customers"
    
  Scenario: Store manager user
    Given the user logged in as a "store manager"
    When the user navigates to "Customers" "Contacts"
    Then the title contains "Contacts - Customers"

    @wip
  Scenario Outline: Login with different <userType>
    Given the user logged in as a "<userType>"
      When the user navigates to "<tab>" "<module>"
      Then the title contains "<title>"
    Examples:
    |userType     |tab       |module         |title                       |
    |driver       |Activities|Calendar Events|Calendar Events - Activities|
    |sales manager|Customers |Accounts       |Accounts - Customers        |
    |store manager|Contacts  |Customers      |Contacts - Customers        |
