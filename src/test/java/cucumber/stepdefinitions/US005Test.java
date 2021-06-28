package cucumber.stepdefinitions;

import cucumber.pages.US005Page;
import cucumber.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class US005Test {
    US005Page us005Page = new US005Page();
    Actions actions = new Actions(Driver.getDriver());

    @Then("user hovers son on yilin en cok satanlari")
    public void user_hovers_son_on_yilin_en_cok_satanlari() {
        actions.moveToElement(us005Page.enCokSatanEdebiyatKitaplari.get(8)).click().perform();
    }

    @Then("user asserts books are in correct order")
    public void user_asserts_books_are_in_correct_order() {
        List<Integer>allNumbers= new ArrayList<>();
        for (WebElement w: us005Page.bookOrderNumbers) {
            allNumbers.add(Integer.parseInt(w.getText()));
        }
        Assert.assertEquals(allNumbers.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()), allNumbers);
    }
    @Then("user clicks ikibinsekiz year link")
    public void userClicksIkibinsekizYearLink() {
        us005Page.ikibinSekizLink.click();
    }
    @And("user asserts first book name {string}")
    public void userAssertsFirstBookName(String bookName) {
        Assert.assertEquals(us005Page.booksName.get(0).getText(),bookName);
    }

    @Then("user assert fist book price {string}")
    public void userAssertFistBookPrice(String bookPrice) {
        Assert.assertEquals(us005Page.bookPrices.get(0).getText(),bookPrice);

    }
}
