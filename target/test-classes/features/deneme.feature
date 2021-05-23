@smoketest
Feature: API Test

  Scenario:TC0101 uye ol link control
    Given user enters homepage
    Then user clicks uye ol link
    And user verifies hesapOlustur page

  Scenario:user create an account
    Given user enters homepage
    Then user clicks uye ol link
    And user enters valid ad "ali"
    And user enters valid soyad "yilmaz"
    And user enters valid eposta "aliyilmaz12@gmail.com"
    And user enters valid sifre "Aliyilmaz34"
    And user enters valid sifreTekrar "Aliyilmaz34"
    And user clicks ABG checkbox
    Then user clicks devam button

  Scenario:page email and password check
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