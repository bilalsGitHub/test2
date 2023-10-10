Feature: Login Test
  Scenario: Go To the page and login

    Given Go to the page
    And check the logo visibility
    And type loginusername
    And type password
    When click on the login button
