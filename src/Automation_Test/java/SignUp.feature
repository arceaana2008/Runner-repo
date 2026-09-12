Feature: SignUp
  @negative
  Scenario: User can Sign Up successfully
    When user navigate to then "Sign up" link
    And user fill sign up form
    And click on the "Sign up" button
    Then appear allert with message "This user already exist."

    Scenario: User not field Sign Up form
      When user navigate to then "Sign up" link
      And  click on the "Sign up" button
      Then  appear allert with message "Please fill out Username and Password."


      Scenario: User field only username
        When user navigate to then "Sign up" link
        And user fill username field Sign up form
        And  click on the "Sign up" button
        Then  appear allert with message "Please fill out Username and Password."

Scenario: User field only password
  When  user navigate to then "Sign up" link
  And user fill password field Sign up form
  And  click on the "Sign up" button
  Then  appear allert with message "Please fill out Username and Password."



