package cucumber.stepdefinitions;

import cucumber.pages.US003Page;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class US003Test {
    US003Page us003Page = new US003Page();

    List<String> controlData = Arrays.asList("Vadideki Zambak (3-B-10)" , "Goriot Baba", /*"Gambara",*/ "La Rabouilleuse","Otuz Yasindaki Kadin");

    @Then("user verifies searchbox placeholder values {string}")
    public void user_verifies_searchbox_placeholder_values(String testData) {
        Assert.assertEquals(us003Page.searchBox.getAttribute("placeholder"), testData);
    }
    @Then("user searches the data {string} cucumbers")
    public void user_searches_the_data_cucumbers(String searchData) {
        us003Page.searchBox.sendKeys(searchData);
        us003Page.searchButton.click();
    }
    @Then("user verifies the data {int} cucumbers")
    public void user_verifies_the_data_cucumbers(int result) {
        Assert.assertEquals(Integer.parseInt(us003Page.searchResults.getText().substring(0,3)),result);
    }

    @Then("user verifies results with expected output list")
    public void userVerifiesResultsWithExpectedOutputlist() {
        for (WebElement a: us003Page.allSerachBookResults ) {
            Assert.assertTrue(controlData.contains(a.getText()));
            System.out.println(a.getText());
        }
    }
}
