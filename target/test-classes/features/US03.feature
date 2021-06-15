@smoketest
@US03
Feature: US003 User Login Test

  Background:
    Given user enters homepage

  @TC0301
  Scenario:TC0301 placeholder control
    Then user verifies searchbox placeholder values "kitap adı, yazar veya yayınevi ara"

  @TC0302
  Scenario Outline: TC0302 search result check <search> & <result>
    Then user searches the data "<search>" cucumbers
    Then user verifies the data <result> cucumbers
    Examples:
      | search      | result |
      | dostoyevski | 747    |
      | tolstoy     | 893    |
      | turgenyev   | 168    |
      | victor hugo | 259    |
      | balzac      | 364    |

  @TC0303
  Scenario:TC0301 uye ol link control
    Then user searches the data "Balzac" cucumbers
    Then user verifies results with expected output list
#data table uygulamasi
  @TC0303v2
  Scenario:TC0301 uye ol link control with datatable
    Then user searches the data "Balzac" cucumbers with datatable
    Then user verifies results with expected output list with datatable:
      | Vadideki Zambak (3-B-10) |
      | Goriot Baba              |
      | Gambara                  |
      | La Rabouilleuse          |
      | Otuz Yasindaki Kadin     |


