@SmokeTest @US02
Feature: user logs in
  Background: user enters homepage and logs in
    Given user enters homepage
    And user clicks giris yap link

  @TC0201
    Scenario:
    Given user enters valid email
    And user enters valid password "Kitapyurdu"
    Then user clicks giris yap button

#  @TC0202
#
#  @TC0203

    #Kullanici giris yap linkine tiklar ve valid bilgilerle giris yapar
#
#"Kullanici acilan 'Hesabim'  sayfasinda sirasiyla;
# Hesap Bilgilerimi Duzenle, Siparis Gecmisin, Adres Defretini Duzenle,
# Alisverisi Listemi Duzenle, Favoir Listemi Duzenle, Puanlarim alt basliklarinin oldugunu goruntuler"
#
#Kullanici Hesap Bilgilerimi Duzenle linkine tiklar.
# Acilan sayfada Uyeligimi iptal etmek istiyorum linkine tiklar.
# Acilan alert'te tamama tiklayip silmeyi onaylar ve anasayfaya yonlendirilir.
# Tekrar giris yapmak isteyen kullanici 'Hesap kapatılmıştır!
# Tekrar kullanıma açmak için müşteri hizmetleri ile irtibata geçiniz.'  mesajini goruntuler.