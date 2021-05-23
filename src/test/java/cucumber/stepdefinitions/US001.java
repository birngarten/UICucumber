package cucumber.stepdefinitions;

import cucumber.pages.US001Page;
import cucumber.utilities.ConfigurationReader;
import cucumber.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class US001 {
    US001Page us001Page = new US001Page();

    @Given("user enters homepage")
    public void userEntersHomepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Then("user clicks uye ol link")
    public void userClicksUyeOlLink() {
        us001Page.uyeOlLink.click();
    }
    @And("user verifies hesapOlustur page")
    public void userVerifiesHesapOlusturPage() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Hesap Oluştur");
    }

    @And("user enters valid ad {string}")
    public void userEntersValidAd(String ad) {
        us001Page.allInputs.get(8).sendKeys(ad);
    }

    @And("user enters valid soyad {string}")
    public void userEntersValidSoyad(String soyad) {
        us001Page.allInputs.get(9).sendKeys(soyad);
    }
    @Then("user enters valid eposta {string}")
    public void user_enters_valid_eposta(String eposta) {
        us001Page.allInputs.get(10).sendKeys(eposta);
    }

    @Then("user enters valid sifre {string}")
    public void user_enters_valid_sifre(String sifre) {
        us001Page.allInputs.get(11).sendKeys(sifre);
    }

    @Then("user enters valid sifreTekrar {string}")
    public void user_enters_valid_sifre_tekrar(String sifreTekrar) {
        us001Page.allInputs.get(12).sendKeys(sifreTekrar);
    }

    @Then("user clicks ABG checkbox")
    public void user_clicks_abg_checkbox() {
        us001Page.allInputs.get(14).click();
    }

    @Then("user clicks devam button")
    public void user_clicks_devam_button() {
        us001Page.devamButton.click();
    }

    @And("user enters invalid eposta {string}")
    public void userEntersInvalidEposta(String invalidemail) {
        us001Page.allInputs.get(10).sendKeys(invalidemail);
    }

    @And("user enters invalid sifre {string}")
    public void userEntersInvalidSifre(String invalidSifre) {
        us001Page.allInputs.get(11).sendKeys(invalidSifre);
    }

    @And("user enters invalid sifreTekrar {string}")
    public void userEntersInvalidSifreTekrar(String invalidSifre) {
        us001Page.allInputs.get(11).sendKeys(invalidSifre);
    }

    @Then("user sistem finds the error about email entrance")
    public void userSistemFindsTheErrorAboutEmailEntrance() {
        Assert.assertEquals(us001Page.errorMesseges.get(0).getText(),
                "Geçerli bir E-Posta adresi yazınız!");
    }

    @Then("user sistem finds the error about password entrance")
    public void userSistemFindsTheErrorAboutPasswordEntrance() {
        Assert.assertEquals(us001Page.errorMesseges.get(1).getText(),
                "Şifreniz 8 ile 20 karakter arasında olmalı!");
    }
}
