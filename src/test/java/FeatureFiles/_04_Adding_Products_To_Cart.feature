Feature: Adding Products to Cart

  Scenario: User adds a product to the cart
    Given the user navigate to summer dresses
    When the user selects a random product
    Then the user clicks on the Add to cart button
    And the product should be successfully added to the cart
