Feature: Logout Functionality
  As a user of the EBank App
  I want to able to logout from my application
  so that i can login when i need

  Scenario: Logout application functionality
    Given I Am On The EBank App Page
    When I Enter The Valid UserID and Pin
    And I Click On The Login Button
    And I Click On The Logout Button
    Then I Should Go To The Login Page


