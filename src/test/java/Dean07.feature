
Feature: Deans should be able to see the messages sent by users.

  Scenario: US_07 - Viewing and deleting messages by Deans
    Given login as a dean
    Then the Dean should see the edit button for each message
    And the Dean is on the messages page
    And the Dean should see message details including authors, emails, sending dates, and subject information
    Then close the browser
