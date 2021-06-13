package cucumber.stepdefinitions;

import cucumber.pages.US002Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US002Test {

    US002Page us002Page = new US002Page();
    @Given("user clicks girisyap link")
    public void user_clicks_girisyap_link() {
        us002Page.girisYapLink.click();
    }
    @Then("user enters valid email adress {string}")
    public void user_enters_valid_email_adress(String email) {
        us002Page.emailTextBox.sendKeys(email);
    }
    @Then("user enters valid password adress {string}")
    public void user_enters_valid_password_adress(String password) {
        us002Page.passwordTextBox.sendKeys(password);
    }
    @Then("user clicks giris yap button")
    public void user_clicks_giris_yap_button() {
        us002Page.loginButton.click();
    }
    @Then("user verifies succesfull enterance")
    public void user_verifies_succesfull_enterance() {

    }

}
