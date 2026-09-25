Feature:Login
 @LogIn
  Scenario: User can Log In successfully
  When user navigate to then "Log in" link
  And user fill log in form
  And click on the button "Log in"
Then appear Welcome
  @LogIn
    Scenario: user not field log in form
      When user navigate to then "Log in" link
      And click on the button "Log in"
      Then appear allert with message "Please fill out Username and Password."
  @LogIn
      Scenario: user can the wrong password
        When user navigate to then "Log in" link
        And user fill username field log in form
        And user the wrong password
        And click on the button "Log in"
        Then appear allert with message "Wrong password."
  @LogIn
        Scenario: user can the wrong username
          When user navigate to then "Log in" link
          And user the wrong username
          And user fill password field log in form
          And click on the button "Log in"
          Then appear allert with message "Wrong password."

    Scenario: user can login with random username and password
      When user navigate to then "Log in" link
      And user fill random username for login
      And user fill random password for login
      And click on the button "Log in"
      Then appear Welcome




