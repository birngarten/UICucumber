package cucumber.pages;

import cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US003Page {
    public US003Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "search-input")
    public WebElement searchBox;
    @FindBy(xpath = "//span[@class='common-sprite button-search']")
    public WebElement searchButton;
    @FindBy(xpath = "//div[@id='faceted-search-list-total']/h2")
    public WebElement searchResults;
    @FindBy(xpath = "//div[@class='product-cr']//div[@class='name']")
    public List<WebElement> allSerachBookResults;
}
