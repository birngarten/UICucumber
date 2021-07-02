package cucumber.pages;

import cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US006Page {

    public US006Page (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='vertical-pr-link']")
    public List<WebElement> bestSellerBooks;
    @FindBy(xpath = "//div[@class='attributes']//td")
    public List<WebElement> bookAllInformation;
    @FindBy(xpath = "//h1[@class='pr_header__heading']")
    public WebElement bookName;
    @FindBy(xpath = "//input[@id='search-input']")
    public WebElement searchBox;
    @FindBy(xpath = "//span[@class='common-sprite button-search']")
    public WebElement searchButton;
    @FindBy(xpath = "//img[@alt='Kayıp Tanrılar Ülkesi']")
    public List<WebElement> searchResult;
    @FindBy(xpath = "//a[@id='button-cart']")
    public WebElement addToChart;
    @FindBy(xpath = "//span[@id='cart-items']")
    public WebElement basketNumber;

}
