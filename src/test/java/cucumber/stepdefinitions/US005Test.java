package cucumber.stepdefinitions;

import cucumber.pages.US005Page;
import cucumber.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.Comparator;
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
        Assert.assertEquals(
                us005Page.bookOrderNumbers.stream()
                        .map(WebElement::getText)
                        .map(Integer::parseInt)
                        .sorted(Comparator.naturalOrder())
                        .collect(Collectors.toList()),
                us005Page.bookOrderNumbers.stream()
                        .map(WebElement::getText)
                        .map(Integer::parseInt)
                        .collect(Collectors.toList()));
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
        System.out.println(us005Page.bookPrices.get(1).getText());
        Assert.assertEquals(us005Page.bookPrices.get(1).getText(),bookPrice);
    }
}
