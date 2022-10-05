package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueCarPage {

    public BlueCarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@role='button']")
    public WebElement logIn;

    @FindBy(id = "formBasicEmail")
    public WebElement emailGiris;

    @FindBy(id = "formBasicPassword")
    public WebElement passwordGiris;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInGiris;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userGirisBasarili;

}
