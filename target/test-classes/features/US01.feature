@smoketest
  @US01
Feature: API Test
  @TC0101
  Scenario:TC0101 uye ol link control
    Given user enters homepage
    Then user clicks uye ol link
    And user verifies hesapOlustur page
  @TC0102
  Scenario:TC0102 create an account
    Given user enters homepage
    Then user clicks uye ol link
    And user enters valid ad
    And user enters valid soyad
    And user enters valid eposta
    And user enters valid sifre "Aliyilmaz34"
    And user enters valid sifreTekrar "Aliyilmaz34"
    And user clicks ABG checkbox
    Then user clicks devam button
  @TC0103
  Scenario:TC0103 page email and password check
    Given user enters homepage
    Then user clicks uye ol link
    And user enters valid ad "ali"
    And user enters valid soyad "yilmaz"
    And user enters invalid eposta "aliyil"
    And user enters invalid sifre "ali"
    And user enters invalid sifreTekrar "ali"
    And user clicks ABG checkbox
    Then user clicks devam button
    Then user sistem finds the error about email entrance
    Then user sistem finds the error about password entrance