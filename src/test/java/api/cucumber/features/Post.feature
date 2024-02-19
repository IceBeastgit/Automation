Feature: Post feature of Facebook
  This will test functionality at user wall

  Scenario: Post a message on User Wall
    Given User should be logged in and present at its own wall
    When I type a message in text box
    And Click on post button
    Then The message should get posted

  Scenario: Post a Video on User Wall
    Given User should be logged in and present at its own wall
    When User supply the Youtube link in the text box
    And Click on Post button again
    Then The video should get posted on user wall
    And The Video should have proper thumbnail