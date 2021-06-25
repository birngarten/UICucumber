@SmokeTest @US03

Feature: user performs searchbox test

  Background: user enters homepage
    Given user enters homepage

  @TC0301
  Scenario: TC0301 placeholder control
    Given user verify searchbox placeholder like "kitap adı, yazar veya yayınevi ara"

  @TC0302
  Scenario Outline: TC0302 check <search> and <result>
    Given user searches for "<authors>" in search box
    And user verifies <results>
    Examples:
      | authors     | results |
      | dostoyevski | 739     |
      | tolstoy     | 886     |
      | turgenyev   | 167     |
      | victor hugo | 257     |
      | balzac      | 362     |

#  @TC0303
#  Scenario Outline: TC0303 Checking out Balzac's books
#    Given user searches "Balzac" s books
#    Then user verifies "<result>"
#    Examples:
#      | result               |
#      | Vadideki zambak      |
#      | Goriot Baba          |
#      | Gambara              |
#      | La Rabouilleuse      |
#      | Otuz Yasindaki Kadin |


  @TC0303       #  with DataTable
  Scenario: TC0303 Checking out Balzac's books
    Given user searches balzacs books
    Then user verifies result
      | Vadideki zambak      |
      | Goriot Baba          |
      | Gambara              |
      | La Rabouilleuse      |
      | Otuz Yasindaki Kadin |


  #Kullanici anasayfadadir. Searchbox'ta "kitap adi,yazar veya yayinevi ara" yazisini oldugunu goruntuler.
  #
  #"Kullanici Searchbox'a sirasiyla ""dostoyevski"", ""tolstoy"", ""turgenyev"", ""victor hugo"", ""balzac"" yazdiginda yine
  #sirasiyla ""747"" , ""890"" , ""168"", ""259"", ""363"" urun listelendigini goruntuler."
  #"Kullanici Balzac output listesinde ""Vadideki zambak"" , ""Goriot Baba"", ""Gambara"", ""La Rabouilleuse"" ve ""Otuz Yasindaki Kadin""
  #isimli kitaplarin oldugunu goruntuler."