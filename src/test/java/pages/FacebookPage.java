package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "email")
    public WebElement email;


    @FindBy(id = "pass")
    public WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement girisYap;

    @FindBy(xpath = "//div[text()='Girdiğin e-posta bir hesaba bağlı değil. ']")
    public WebElement girisBasarisizText;
}
