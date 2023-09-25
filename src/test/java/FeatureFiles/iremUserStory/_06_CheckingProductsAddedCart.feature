Feature: Checking Products Added Cart

  Scenario: User checks the products
    Given navigate to dresses page
    When User chooses random products
    Then User clicks on add to cart and user clicks on continue shopping button
    And User chooses a different product and user clicks on add to cart button
    Then User verifies that the added items are in the shopping cart
    And User verifies that there are three products in shopping cart

