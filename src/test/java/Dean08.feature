Feature: Deans should be able to see the messages sent by users.

  Scenario: US_08 - Viewing and deleting messages by Deans
    Given login as a vice dean
    And Vice Dean should be able to enter the name of lesson.
    Then Vice Dean should be able to mark whether the course is compulsory or not.
    And Vice Dean should be able to enter the Credit Score.
    Then close the browser on the page vice dean