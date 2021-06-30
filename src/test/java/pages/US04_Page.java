package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US04_Page {

    public US04_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='mn-strong common-sprite'])[1]")
    public WebElement cokSatanKitaplar;

    @FindBy(xpath = "//strong[.='Edebiyat']")
    public WebElement cokSatanEdebiyatKitaplari;

    @FindBy(xpath = "//div[@class='mg-b-10']")
    public List<WebElement> firstPageBooksNumber;

    @FindBy(xpath = "//span[@class='sprite sprite-icon-list']")
    public WebElement changeIconButton;

    @FindBy(xpath = "//div[@class='publisher']")
    public List<WebElement> publisherList;
}
