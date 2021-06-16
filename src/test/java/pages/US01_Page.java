package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US01_Page {

    public US01_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Üye Ol']")
    public WebElement uyeOlLink;

    @FindBy(xpath = "//h1[@class='section']")
    public WebElement hesapOlusturPage;

    //==========================================
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firtNameBox;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement mailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@name='confirm']")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//input[@name='agree']")
    public WebElement checkBox;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement devamButton;

    //===========================================
    @FindBy(xpath = "//span[.='Geçerli bir E-Posta adresi yazınız!']")
    public WebElement errorEmailMessage;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement errorPasswordMessage;
}
