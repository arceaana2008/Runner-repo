Feature:Login
 @negative
  Scenario: User can Log In successfully
  When user navigate to then "Log in" link
  And user fill log in form
  And click on the button "Log in"
Then appear Welcome
@negative
    Scenario: user not field log in form
      When user navigate to then "Log in" link
      And click on the button "Log in"
      Then appear allert with message "Please fill out Username and Password."
@negative
      Scenario: user can the wrong password
        When user navigate to then "Log in" link
        And user fill username field log in form
        And user the wrong password
        And click on the button "Log in"
        Then appear allert with message "Wrong password."
@negative
        Scenario: user can the wrong username
          When user navigate to then "Log in" link
          And user the wrong username
          And user fill password field log in form
          And click on the button "Log in"
          Then appear allert with message "Wrong password."





