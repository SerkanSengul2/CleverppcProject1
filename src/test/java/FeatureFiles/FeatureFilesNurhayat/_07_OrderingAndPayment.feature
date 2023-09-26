Feature:Order data and Payment

  Scenario: Order data and Payment
    Given There are products in the cart
    When User clicks on cart and Checkout button
    Then User selects an adress
    And User select shipment method and terms of service
    Then User selects proceed to checkout
    And User selects pay with paypal and warning message should be displayed
    Then User navigate back and click on pay with card and warning message should be displayed
    And User navigate back and click on pay with bank
    Then User see total price is equals to shipping price and taxes
    And Order number can be saved
