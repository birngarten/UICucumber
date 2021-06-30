@SmokeTest @US04
Feature: user tests the best-selling books

  Background:
    Given user enters homepage
    And user hovers cok satan kitaplar
    Then user hovers cok satan edebiyat kitaplari

  @TC0401
  Scenario: twenty bestselling books
    Given user verifies that there are 20 books on the first page

  @TC0402
  Scenario: assert publichers
    Given user changes page view
    Then user asserts publichers
      | CAN YAYINLARI                       |
      | DERGAH YAYINLARI                    |
      | DİRİLİŞ YAYINLARI                   |
      | KAPRA YAYINCILIK                    |
      | KIRMIZI KEDİ YAYINEVİ               |
      | PEGASUS KEDİ YAYINEVİ               |
      | SEL YAYINCILIK                      |
      | SEL KİTABEVİ                        |
      | TÜRKİYE İŞ BANKASI KÜLTÜR YAYINLARI |
      | YAPI KREDİ YAYINLARI                |
      | İNDİGO KİTAP                        |
      | İNKILAP KİTABEVİ                    |
      | İTHAKİ YAYINLARI                    |


  @TC0403
  Scenario:bestselling publisher
    Given user asserts bestselling publisher

#  "Kullanici anasayfada ""Çok Satan Kitaplar"" drop down'da hover yaptiginda  ""Cok Satan Sinav Kitaplari""na tiklar.
#Ilk sayfada 20 kitap oldugunu dogrular."

#"Kullanici, Zaman Aralığı:""Haftalik"" yapildiginda; cok satan ilk 20 kitabi basan yayinevlerinin
#YAPI KREDİ YAYINLARI
#İNKILAP KİTABEVİ
# KIRMIZI KEDİ YAYINEVİ
#DERGAH YAYINEVİ
#İTHAKİ YAYINLARI
#PEGASUS YAYINLARI
#CAN YAYINLARI
#SEL YAYINCILIK
#İNDİGO KİTAP
#TÜRKİYE İŞ BANKASI KÜLTÜR YAYINLARI
#DİRİLİŞ YAYINLARI
#KAPRA YAYINCILIK
#oldugunu dogrular"

#Kullanici, cok satan ilk 20 kitabin en cok YAPI KREDİ YAYINLARI yayinevi tarafindan basildigini dogrular