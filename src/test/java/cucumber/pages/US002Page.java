package cucumber.pages;

import cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US002Page {

    public US002Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Giriş Yap']")
    public WebElement girisYapLink;
    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailTextBox;
    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//button[@class='ky-btn ky-btn-orange w-100 ky-login-btn']")
    public WebElement loginButton;
}
