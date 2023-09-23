Feature: Adding new address user account

  Scenario: User adds a new address
    Given navigate to website
    When user clicks on the sitemap link and directed to the sitemap page
    Then user clicks on the address link and directed to the address page
    And user clicks on the add a new address button
    Then user fills all required fields
      | nameInput     | Srk         |
      | lastnameInput | Ozs         |
      | addressInput  | Atakoy      |
      | cityInput     | Istanbul    |
      | zipCode       | 00034       |
      | phone         | 1112223334  |
      | addressAlias  | My address2 |

    And address should be successfully added
