Feature: Register Test


  Background:
    Given navigate to website
    And closethepopup
  Scenario Outline: Create an Account

    And type firstname "<firstname>"
    And type lastname "<lastname>"
    And type adress "<adress>"
    And type email "<email>"
    And type phone "<phone>"
    And select gender
    And select hobby
    And click langfield
    And chose from langfield
    And choose from countryfield "<country>"
    And choose year "<year>"
    And choose month "<month>"
    And choose day "<day>"
    And fill password "<password>"
    And fill againthepassword "<againthepassword>"
    And click the Submit Button


    Examples:
      | firstname | lastname | adress | email | phone | country | year | month | day | password | againthepassword |
      | bilal | hinis | adress123 | bilalhinis@gmail.com | +442912345678 | Australia| 1999 | September | 23 | bilal123 | bilal123 |
