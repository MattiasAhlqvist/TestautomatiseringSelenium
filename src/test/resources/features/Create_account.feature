Feature: Create_account

  Scenario: Account with different passwords
    Given I navigate to the website
    When I fill out the text fields and check boxes
    Then It does not let me log in


    Scenario: Account no surrname
      Given I navigate to the website
      When I fill out textfields and check boxes except surrname
      Then It does not let me log in with no surrname


      Scenario: Account no terms and conditions
        Given I navigate to the website
        When I fill out the text fields without the check boxes
        Then it does not let me log in without terms and conditions



        Scenario: Creating account
          Given I navigate to the website
          When I fill out all the check boxes and text fields
          Then It creats an account
