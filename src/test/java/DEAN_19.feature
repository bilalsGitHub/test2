Feature: "The teacher should be able to create meetings with students.
  (Add Meet)"
  Scenario: US_19 - "The teacher should be able to create meetings with students.
    Given login as a teacher
    And switch to meet management
    And   Choose Students should be selected
    Then   Date Of Meet meeting time can be selected. Past date should not be entered.
    And   Start Time ve Stop Time start and end times must be entered
    Then   Description must be entered
    Then close the browser172