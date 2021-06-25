package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.US03_Page;
import io.cucumber.datatable.DataTable;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US03_Stepdefinition {

    US03_Page page03 = new US03_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user verify searchbox placeholder like {string}")
    public void user_verify_searchbox_placeholder_like(String placeholder) {
        String placeholderText = page03.searchBox.getAttribute("placeholder");
        System.out.println(placeholderText);
        Assert.assertEquals(placeholder,placeholderText);

    }
    @Given("user searches for {string} in search box")
    public void user_searches_for_in_search_box(String authors) {
        page03.searchBox.sendKeys(authors);
        page03.searchButton.click();

    }
    @Given("user verifies {int}")
    public void user_verifies(int result) {
        int intNum = Integer.parseInt(page03.resultNumUndText.getText().substring(0,3));
        Assert.assertTrue(result==intNum);

    }

//      @TC0303
    @Given("user searches balzacs books")
    public void user_searches_balzacs_books() {
        page03.searchBox.sendKeys("balzac");
        ReusableMethods.waitFor(1);
        page03.searchButton.click();
//        actions.sendKeys(page03.searchBox,balzac).build().perform();
//        actions.click(page03.searchButton).perform();

    }

//    @Then("user verifies {string}")
//    public void user_verifies(String expectedList) {
//        List<String> booksList = new ArrayList<>();
//        for (WebElement w: page03.booksList) {
//            booksList.add(w.getText());
//        }
//        Assert.assertTrue(booksList.contains(expectedList));
//        System.out.println(booksList);
//        System.out.println("expectedList = " + expectedList);
//
//    }

    @Then("user verifies result")
    public void user_verifies_result(DataTable dataTable) {
        List<String> booksList = new ArrayList<>();
        for (WebElement w: page03.booksList) {
            booksList.add(w.getText());
        }
        Assert.assertTrue(booksList.contains(dataTable.asList()));
        System.out.println(booksList);
        System.out.println("expectedList = " + dataTable);

    }
}
