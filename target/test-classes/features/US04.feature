@smoketest
@US04
Feature: US04
  @TC0401
  Scenario:TC0401 cok satan edebiyat kitaplari page
    Given user enters homepage
    Then user hovers cok satan kitaplar
    Then user hovers cok satan edebiyat kitaplari
    And user asserts kitap sayilari

  @TC0402
  Scenario Outline: TC0402 en cok satilan kitaplarinm yayinevi
    Given user enters homepage
    Then user hovers cok satan kitaplar
    Then user hovers cok satan edebiyat kitaplari
    Then user changes page view
    Then user asserts the kitabevi data "<search>"
    Examples:
      | search  |
      | YAPI KREDi YAYINLARI  |
      | INKILAP KiTABEVi      |
      | KETEBE YAYINEVi       |
      | KIRMIZI KEDi YAYINEVi |
      | PEGASUS YAYINLARI     |
      | CAN YAYINLARI         |
      | SEL YAYINCILIK        |
      | iNDiGO KiTAP          |

  @TC0403
  Scenario:TC0403 cok satan edebiyat kitaplari page
    Given user enters homepage
    Then user hovers cok satan kitaplar
    Then user hovers cok satan edebiyat kitaplari
    Then user changes page view
    And users get all yayinevleri
