Feature: Checking Products Added Cart
  Background:
    Given  Navigate to Site
    When Click on Sing in Button
    Then Enter E-mail adress And Password
    And Click on Sing in
  Scenario User checks the products added to cart
    Given Navigate to dresses page
    When User selects a random product and click on add to cart
    Then User clicks on continue shopping button
    And User selects a different product and clicks on add to cart button
    Then User clicks on continue shopping button
    And User selects a final different product and clicks on add to cart button
    Then User should verify the products in cart
    And User should verify three product in cart


