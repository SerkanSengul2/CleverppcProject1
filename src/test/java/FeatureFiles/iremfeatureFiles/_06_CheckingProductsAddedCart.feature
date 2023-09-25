Feature: Checking Products Added Cart

  Scenario User checks the products added to cart
    Given Navigate to Site
    When User selects a random product and click on add to cart
    Then User clicks on continue shopping button
    And User selects a different product and clicks on add to cart button
    Then User clicks on continue shopping button
    And User selects a final different product and clicks on add to cart button
    Then User should verify the products in cart
    And User should verify three product in cart


