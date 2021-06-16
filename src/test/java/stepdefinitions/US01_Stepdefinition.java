package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.US01_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US01_Stepdefinition {

    US01_Page page01 = new US01_Page();

    @Given("user enters homepage")
    public void user_enters_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @Then("user clicks uye ol link")
    public void user_clicks_uye_ol_link() {
        page01.uyeOlLink.click();

    }
    @Given("user verifies hesap olustur page")
    public void user_verifies_hesap_olustur_page() {
        Assert.assertTrue(page01.hesapOlusturPage.isDisplayed());

    }
    @Given("user enters valid name")
    public void user_enters_valid_name() {
        page01.firtNameBox.sendKeys("Katip");

    }
    @Given("user enters valid lastname")
    public void user_enters_valid_lastname() {
        page01.lastNameBox.sendKeys("Okur");

    }
    @Given("user enters valid email")
    public void user_enters_valid_email() {
        page01.mailBox.sendKeys(ConfigurationReader.getProperty("email"));

    }
    @Given("user enters valid password {string}")
    public void user_enters_valid_password(String password) {
        page01.passwordBox.sendKeys(password);

    }
    @Given("user re-enters valid password {string}")
    public void user_re_enters_valid_password(String password) {
        page01.confirmPasswordBox.sendKeys(password);

    }
    @Given("user clicks  Kisisel Verilerin Korunması checkbox")
    public void user_clicks_kisisel_verilerin_korunması_checkbox() {
        page01.checkBox.click();

    }
    @Then("user clicks devam button")
    public void user_clicks_devam_button() {
        page01.devamButton.click();

    }
    @Given("user enters name {string}")
    public void user_enters_name(String name) {
        page01.firtNameBox.sendKeys(name);

    }
    @Given("user enters lastname {string}")
    public void user_enters_lastname(String lastName) {
        page01.lastNameBox.sendKeys(lastName);

    }
    @Given("user enters invalid email {string}")
    public void user_enters_invalid_email(String email) {
        page01.mailBox.sendKeys(email);

    }
    @Given("user enters invalid password {string}")
    public void user_enters_invalid_password(String wrPassword) {
        page01.passwordBox.sendKeys(wrPassword);

    }
    @Given("user re-enters invalid password {string}")
    public void user_re_enters_invalid_password(String wrPassword) {
        page01.passwordBox.sendKeys(wrPassword);

    }
    @Then("Please enter a valid E-Mail address! message should appear")
    public void please_enter_a_valid_e_mail_address_message_should_appear() {
        Assert.assertTrue(page01.errorEmailMessage.isDisplayed());

    }
    @Then("Your password must be between eight and twenty characters! message should appear")
    public void your_password_must_be_between_and_characters_message_should_appear() {
        Assert.assertTrue(page01.errorPasswordMessage.isDisplayed());

    }
}
