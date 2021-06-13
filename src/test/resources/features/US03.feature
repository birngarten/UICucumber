@smoketest
@US03
Feature: API Test
  @TC0301
  Scenario:TC0301 placeholder control
    Given user enters homepage
    Then user verifies searchbox placeholder values "kitap adı, yazar veya yayınevi ara"

  @TC0302
  Scenario Outline: TC0302 search result check <search> & <result>
    Given user enters homepage
    Then user searches the data "<search>" cucumbers
    Then user verifies the data <result> cucumbers
    Examples:
      | search      | result|
      | dostoyevski | 747   |
      | tolstoy     | 893   |
      |turgenyev    | 168   |
      |victor hugo  | 259   |
      |balzac       | 364   |

  @TC0303
  Scenario:TC0301 uye ol link control
    Given user enters homepage
    Then user searches the data "Balzac" cucumbers
    Then user verifies results with expected output list

