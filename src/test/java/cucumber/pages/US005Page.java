package cucumber.pages;

import cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US005Page {
    public US005Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='mn-icon icon-angleRight']")
    public List<WebElement> enCokSatanEdebiyatKitaplari;
    @FindBy(xpath = "//div[@class='mg-b-10']")
    public List<WebElement> bookOrderNumbers;
    @FindBy(xpath = "//a[@title='2008 Yılında Çok Satanlar']")
    public WebElement ikibinSekizLink;
    @FindBy(xpath = "//div[@class='name ellipsis']")
    public List<WebElement> booksName;
    @FindBy(xpath = "//span[@class='TL']")
    public List<WebElement> bookPrices;

}
