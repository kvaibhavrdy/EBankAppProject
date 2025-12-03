Feature: Login Functionality
  As a user of the EBankApp
  I want to able to login to my account
  So i can view my account details

  Scenario: Login with empty input fields
    Given I Am On The EBank App Page
    When I Click On The Login Button
    Then I Should Get The Error Message Invalid user ID

    Scenario: Login with empty userid
      Given I Am On The EBank App Page
      When I Enter The PIN
      And I Click On The Login Button
      Then I Should Get The Error Message Invalid user ID

      Scenario: Login With empty PIN
        Given I Am On The EBank App Page
        When I Enter The UserID
        And I Click On The Login Button
        Then I Should Get The Error Message Invalid PIN

        Scenario: Login With Invalid userID and PIN
          Given I Am On The EBank App Page
          When I Enter The Invalid UserID And Pin
          And I Click On The Login Button
          Then I Should Get The Error Message User ID and PIN didn't match

          Scenario: Login With Valid userID and Pin
            Given I Am On The EBank App Page
            When I Enter The Valid UserID and Pin
            And I Click On The Login Button
            Then I Should Go To The Home Page


