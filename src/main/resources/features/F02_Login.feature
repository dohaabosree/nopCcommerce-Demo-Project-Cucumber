@login
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user login with valid email and password
    Given user go to login page
    When user login with  email "test31@example.com"
    And user login with password "P@ssw0rd"
    And user press on login button
    Then user able to login successfully

  Scenario: user  could not login with valid email and invalid password
    Given user go to login page
    When user login with  email "test30@example.com"
    And user login with password "Password"
    And user press on login button
    Then user should see error message
