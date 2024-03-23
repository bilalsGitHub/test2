Feature: "The teacher should be able to give grades to the students.
  (Add Student Info)"
  Scenario: US_17 - "The teacher should be able to give grades to the students.
    Given login as a teacher
    And   The lesson, student and semester should be selectable17.

    Then   Absences should be able to be entered17.

    And   Midterm and Final Exam grades should be able to be entered17.

    Then   Info note about the student should be able to be entered17.

    Then close the browser17
