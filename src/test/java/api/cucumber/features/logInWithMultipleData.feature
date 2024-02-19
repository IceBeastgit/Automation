Feature: Log in with Multiple Data

  Scenario: User log in Scenario
    Given User is at Log in Page of application
    When User Logs in with following username and passwords
      | user1 | pass1 |
      | user2 | pass2 |
      | user3 | pass3 |
    Then User should be able to log in with correct username and password