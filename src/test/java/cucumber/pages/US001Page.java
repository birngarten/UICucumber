package cucumber.pages;

import cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class US001Page {

    public US001Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Üye Ol']")
    public WebElement uyeOlLink;
    @FindBy(xpath = "//input")
    public List<WebElement>allInputs;
    @FindBy(xpath = "//input[@value='Devam']")
    public WebElement devamButton;
    @FindBy(xpath = "//span[@class='error']")
    public List<WebElement> errorMesseges;
}
