Feature: SignUp
  @SignUp
  Scenario: User can Sign Up successfully
    When user navigate to then "Sign up" link
    And user fill sign up form
    And click on the "Sign up" button
    Then appear allert with message "This user already exist."
  @SignUp
    Scenario: User not field Sign Up form
      When user navigate to then "Sign up" link
      And  click on the "Sign up" button
      Then  appear allert with message "Please fill out Username and Password."

  @SignUp
      Scenario: User field only username
        When user navigate to then "Sign up" link
        And user fill username field Sign up form
        And  click on the "Sign up" button
        Then  appear allert with message "Please fill out Username and Password."
  @SignUp
Scenario: User field only password
  When  user navigate to then "Sign up" link
  And user fill password field Sign up form
  And  click on the "Sign up" button
  Then  appear allert with message "Please fill out Username and Password."

Scenario: User can Sign Up successfully with random username and password
  When user navigate to then "Sign up" link
  And user fill random username
  And user fill password field random password
  And  click on the "Sign up" button
  Then appear allert with message "Sign up successful."


