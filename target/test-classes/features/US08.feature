@smoketest
@US08
Feature: US08
  Background:
    Given user enters homepage

  @TC0801
  Scenario:TC0801 checking of best seller book
    Then user clicks dergi link
    And user hovers tum dergiler
    Then user clicks ot link
    And user asserts the total numbers of "75"