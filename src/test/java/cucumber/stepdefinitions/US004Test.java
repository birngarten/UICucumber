package cucumber.stepdefinitions;

import cucumber.pages.US004Page;
import cucumber.utilities.Driver;
import cucumber.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;

public class US004Test {
    US004Page us004Page = new US004Page();
    Actions actions = new Actions(Driver.getDriver());

    @Then("user hovers cok satan kitaplar")
    public void user_hovers_cok_satan_kitaplar() {
        actions.moveToElement(us004Page.headerLinks.get(0)).perform();
        //us004Page.headerLinks.get(0).click();
        ReusableMethods.waitFor(2);
    }
    @Then("user hovers cok satan edebiyat kitaplari")
    public void user_hovers_cok_satan_edebiyat_kitaplari() {
        actions.moveToElement(us004Page.enCokSatanEdebiyatKitaplari.get(1)).click().perform();
        //us004Page.enCokSatanEdebiyatKitaplari.get(1).click();
        //ReusableMethods.waitFor(3);
    }
    @Then("user changes page view")
    public void user_changes_page_view() {
        us004Page.pageViewChange.click();
    }
    @And("user asserts kitap sayilari")
    public void userAssertsKitapSayilari() {
        Assert.assertEquals(us004Page.allBooks.size(),20);
    }

    @Then("user asserts the kitabevi data {string}")
    public void userAssertsTheKitabeviData(String data) {
        List<String> kitapEvi = new ArrayList<>();
        for (WebElement a: us004Page.kitabeviList) {
                kitapEvi.add(a.getText());
        }
        System.out.println(kitapEvi);
        Assert.assertTrue(kitapEvi.contains(data.toLowerCase()));
    }

    @And("users get all yayinevleri")
    public void usersGetAllYayinevleri() {
        List<String> kitapEvi = new ArrayList<>();
        for (WebElement a: us004Page.kitabeviList) {
            kitapEvi.add(a.getText());
        }
        System.out.println(kitapEvi);
        //
    }
}