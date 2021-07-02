package cucumber.stepdefinitions;

import cucumber.pages.US006Page;
import cucumber.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

public class US006Test {

    US006Page us006Page = new US006Page();
    String testData [] = {"14.06.2021","9789750850417", "TÜRKÇE", "504" ,"Karton Kapak" , "Kitap Kağıdı" ,"13.5 x 23 cm"};
    static String bookName;
    static List<String>bookInformatinon = new ArrayList<>();
    static List<String>bookInformatinonFromSearchBox = new ArrayList<>();

    @Then("user clicks best seller book")
    public void user_clicks_best_seller_book() {
        us006Page.bestSellerBooks.get(0).click();
    }
    @Then("user asserts best seller books information")
    public void user_asserts_best_seller_books_information() {
        int j=1;
        for(int i=0;i<testData.length;i++){
            Assert.assertEquals(us006Page.bookAllInformation.get(j).getText(),testData[i]);
            j+=2;
        }
    }
    @Given("user gets best seller book name")
    public void user_gets_best_seller_book_name() {
        bookName = us006Page.bookName.getText();
    }
    @Given("user gets best seller books information")
    public void user_gets_best_seller_books_information() {
        for(int i=1;i<us006Page.bookAllInformation.size();i+=2){
            bookInformatinon.add(us006Page.bookAllInformation.get(i).getText());
        }
    }
    @Given("user searches the best seller book name in search box")
    public void user_searches_the_best_seller_book_name_in_search_box() {
        us006Page.searchBox.sendKeys(bookName);
        us006Page.searchButton.click();
        us006Page.searchResult.get(0).click();
        for(int i=1;i<us006Page.bookAllInformation.size();i+=2){
            bookInformatinonFromSearchBox.add(us006Page.bookAllInformation.get(i).getText());
        }
    }
    @Then("user cross-checks best seller book information")
    public void user_cross_checks_best_seller_book_information() {
        Assert.assertEquals(bookInformatinon,bookInformatinonFromSearchBox);
    }
    @Then("user add the book to the basket")
    public void user_add_the_book_to_the_basket() {
        us006Page.addToChart.click();
    }
    @Then("user asserts book in the basket")
    public void user_asserts_book_in_the_basket() {
        ReusableMethods.waitFor(2);
        Assert.assertEquals(us006Page.basketNumber.getText(),"1");
    }



}
