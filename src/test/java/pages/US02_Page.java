package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US02_Page {
   public US02_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Giriş Yap']")
    public WebElement girisYapLink;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement mailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@role='button']")
    public WebElement girisYapButton;
}
