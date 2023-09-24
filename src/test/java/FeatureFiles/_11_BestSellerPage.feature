Feature: Best Seller Page

  Background:
    Given  Navigate to Site
    When Click "SingButton"
    Then Enter E-mail adress And Password
    And Click on Sing in

  Scenario: Best Seller Page
    When user clicks on best sellers
    Then best sellers page should be displayed
