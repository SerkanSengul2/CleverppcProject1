Feature: Login Functionality

  Scenario: Login to Site

    Given  Navigate to Site
    When Click "SingButton"
    And Write E-mail and Click CreateButton
    Then Select Title,Enter Firstname,Lastname,Password and Date of Birth
    And Click Register Button
    Then User should login successfully

