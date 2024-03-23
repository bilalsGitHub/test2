@RegressionTest
Feature: "The teacher should be able to view, update and delete meetings.
  (Meet List)"
  Scenario: US_19 - "The teacher should be able to view, update and delete meetings..
    Given login as a teacher2
    And switch to meet management2
    And     The Date, Start Time, Stop Time and Description of the meetings should be visible to the teacher
    Then     The teacher should be able to update the meetings2
    And    The teacher should be able to delete the meetings.
    Then close the browser172
