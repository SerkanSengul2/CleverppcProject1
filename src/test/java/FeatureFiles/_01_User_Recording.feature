Feature: Login Functionality

  Scenario: Login to Site

    Given  Navigate to Campus
    When Click on Sing in Button
    And Enter E-mail adress and write your mail adress
    Then Select Title,Enter Firstname,Lastname,Password and Date of Birth
    And Click Register Button
    Then User should login successfully



