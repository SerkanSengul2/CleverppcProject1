Feature: Checking Products Added Cart

  Scenario: User checks the products
    Given navigate to dresses page
    When User chooses random products
    Then User verifies that there are three products in shopping cart

