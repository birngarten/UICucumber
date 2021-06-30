package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.US04_Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.*;

public class US04_Stepdefinition {

    US04_Page page04 = new US04_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user hovers cok satan kitaplar")
    public void user_hovers_cok_satan_kitaplar() {
        actions.moveToElement(page04.cokSatanKitaplar).perform();
        ReusableMethods.waitFor(1);

    }
    @Then("user hovers cok satan edebiyat kitaplari")
    public void user_hovers_cok_satan_edebiyat_kitaplari() {
        actions.moveToElement(page04.cokSatanEdebiyatKitaplari).click().perform();

    }

    @Given("user verifies that there are {int} books on the first page")
    public void user_verifies_that_there_are_books_on_the_first_page(int numOfBooks) {
        SoftAssert softAssertion = new SoftAssert();
        softAssertion.assertTrue(numOfBooks == page04.firstPageBooksNumber.size());
        softAssertion.assertAll();

    }

    @Given("user changes page view")
    public void user_changes_page_view() {
        page04.changeIconButton.click();

    }
    @Then("user asserts publichers")
    public void user_asserts_publichers(DataTable publishers) {
        List<String> list = publishers.asList(String.class);
        System.out.println("list : " +list);
        List<String> allPublichersList = new ArrayList<>();
        for (WebElement w: page04.publisherList){
            allPublichersList.add(w.getText());
        }
        System.out.println("allPublichersList : " + allPublichersList);
//        Assert.assertTrue(allPublichersList.contains(list));

    }

    @Given("user asserts bestselling publisher")
    public void user_asserts_bestselling_publisher() {
       int count = 0;
       String str = "";
       for (WebElement w: page04.publisherList){

       }
        System.out.println(count);

    }
}
