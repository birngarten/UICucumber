package stepdefinitions;

import io.cucumber.java.en.*;
import pages.US02_Page;

public class US02_Stepdefinition {

    US02_Page page02 = new US02_Page();

    @Given("user clicks giris yap link")
    public void user_clicks_giris_yap_link() {
        page02.girisYapLink.click();

    }
    @Then("user clicks giris yap button")
    public void user_clicks_giris_yap_button() {
        page02.girisYapButton.click();

    }
}
