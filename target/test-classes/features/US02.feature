@smoketest
@US02
Feature: API Test
  @TC0201
  Scenario:TC0101 uye ol link control
    Given user enters homepage
    And user clicks girisyap link
    Then user enters valid email adress "sametyaprak@gmail.com"
    Then user enters valid password adress "LhqgdAwBgs7yXPB"
    And user clicks giris yap button
    Then user verifies succesfull enterance

  @TC0202
  Scenario:TC0102 create an account
    Given user enters homepage

  @TC0203
  Scenario:TC0103 page email and password check
    Given user enters homepage
