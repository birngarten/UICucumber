@smoketest
@US06
Feature: US06
  Background:
    Given user enters homepage

  @TC0601
  Scenario:TC0601 checking of best seller book
    Then user clicks best seller book
    And user asserts best seller books information

  @TC0602
  Scenario:TC0602 checking of best seller book by search box result
    Then user clicks best seller book
    Given user gets best seller book name
    And user gets best seller books information
    Given user enters homepage
    And user searches the best seller book name in search box
    Then user cross-checks best seller book information

  @TC0603
  Scenario:TC0603 checks without log-in a book can be added to basket
    Then user clicks best seller book
    Then user add the book to the basket
    And user asserts book in the basket