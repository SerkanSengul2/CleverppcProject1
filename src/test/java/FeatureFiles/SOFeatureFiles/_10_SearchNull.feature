Feature: Search Null

  Scenario: Search Null
    Given navigate to website
    When user search with null
    Then warning message should be displayed
