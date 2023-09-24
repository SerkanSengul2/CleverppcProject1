Feature: Login Functionality

  Scenario: Login to Site

    Given  Navigate to Site
    When Click
      | SingButton |
    And Write E-mail and Click CreateButton

    And Click
      | MrSelect |
      | Days     |
      | DaysO    |
      | Months   |
      | Months0  |
      | Years    |
      | Years0   |
    Then Sendkeys
      | Firstname | TestFirstname |
      | LastName  | TestLastName  |
      | Password  | test123       |
    And Click Register Button
    Then User should login successfully

