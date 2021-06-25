package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US03_Page {

    public US03_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='search-input']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='common-sprite button-search']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@id='faceted-search-list-total']")
    public WebElement resultNumUndText;

    @FindBy(xpath = "//div[@id='product-table']//div[@class='name']")
    public List<WebElement> booksList;
}

