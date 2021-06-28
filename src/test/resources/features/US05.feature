@smoketest
  @US05
  Feature: US05
    Background:
      Given user enters homepage
      Then user hovers cok satan kitaplar

    @TC0501
    Scenario:TC0501 control of books number
      Then user hovers cok satan edebiyat kitaplari
      And user asserts kitap sayilari

    @TC0502
    Scenario:TC0502 control of son on yilin en cok satan kitaplari
      And user hovers son on yilin en cok satanlari
      And user asserts kitap sayilari
      Then user asserts books are in correct order

    @TC0503
    Scenario:TC0503 control of 2008  yilinin en cok satan kitaplari
      And user hovers son on yilin en cok satanlari
      Then user clicks ikibinsekiz year link
      And user asserts first book name "Olasılıksız"
      Then user assert fist book price "27,20"
