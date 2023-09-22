Feature: Order data and Payment
  Scenario: Order data and Payment
    And The shopping cart icon (Cart) must be clickable.
    And The "Checkout" button should be clickable.
    And Select address created in story "US03_AddAddr"
    And Shipment method should be selected by default and the Terms of Use Agreement should be accepted
    And The "Continue payment" button must be clicked.
    And The "Payment via PayPal" button should be clicked and "Something seems wrong at the moment. Please try again later." The negative message must be verified.
    And The "Payment by Credit Card" button should be clicked and the "Invalid request" button should be clicked.
