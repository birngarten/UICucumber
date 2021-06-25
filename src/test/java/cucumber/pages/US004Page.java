package cucumber.pages;

import cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US004Page {
    public US004Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class='mn-strong common-sprite']")
    public List<WebElement> headerLinks;
    @FindBy(xpath = "//a[@class='mn-icon icon-angleRight']")
    public List<WebElement> enCokSatanEdebiyatKitaplari;
    @FindBy(xpath = "//div[@class='product-cr']")
    public List<WebElement> allBooks;
    @FindBy(xpath = "//span[@class='sprite sprite-icon-list']")
    public WebElement pageViewChange;
    @FindBy(xpath = "//div[@class='publisher']/span/a/span")
    public List<WebElement> kitabeviList;
}
