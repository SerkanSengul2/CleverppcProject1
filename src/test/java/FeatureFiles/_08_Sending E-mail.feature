Feature:Sending E-mail
  Background:
    Given  Navigate to Site
    When Click on Sing in Button
    Then Enter E-mail adress And Password
    And Click on Sing in
    Scenario:
      And Click Contact Us button
      Then Select SubjectHeading and Send Message
      And Click Attach File