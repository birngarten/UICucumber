@SmokeTest @US01
  Feature:US_01 success register


    Background: user enters homepage and creates an account
      Given user enters homepage
      Then user clicks uye ol link

    @TC0101
    Scenario: TC0101 uye ol
      Given user verifies hesap olustur page

    @TC0102
    Scenario: TC0102 create an account
      Given user enters valid name
      And user enters valid lastname
      And user enters valid email
      And user enters valid password "Kitapyurdu"
      And user re-enters valid password "Kitapyurdu"
      And user clicks  Kisisel Verilerin Korunması checkbox
      Then user clicks devam button

    @TC0103
    Scenario: TC0103 check account
      Given user enters name "Lutfi"
      And user enters lastname "Mutlu"
      And user enters invalid email "kuzu"
      And user enters invalid password "kitap"
      And user re-enters invalid password "kitap"
      And user clicks  Kisisel Verilerin Korunması checkbox
      Then user clicks devam button
      Then Please enter a valid E-Mail address! message should appear
      Then Your password must be between 8 and 20 characters! message should appear