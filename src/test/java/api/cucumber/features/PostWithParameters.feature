Feature: Post feature of Facebook

  Background: This is for common steps
    Given User should be logged in and present at its own wall

  Scenario: Post a message on user wall
    When I type a message as "My Post" in text box
    And Click on post button
    Then The message should get posted

  Scenario: Post a Video on Use Wall
    When User supply the Youtube link as "https://www.google.com" in the text box
    And Click on Post button again
    Then The video should get posted on user wall
    And The Video should have proper thumbnail
