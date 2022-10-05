package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerOkuTestPage {

    public HerOkuTestPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='onblur']")
    public WebElement onblur;

    @FindBy(xpath = "//button[@id='onclick']")
    public WebElement onClick;

    @FindBy(xpath = "//button[@id='oncontextmenu']")
    public WebElement oncontextmenu;

    @FindBy(xpath = "//button[@id='ondoubleclick']")
    public WebElement ondoubleclick;

    @FindBy(xpath = "//button[@id='onfocus']")
    public WebElement onfocus;

    @FindBy(xpath = "//button[@id='onkeydown']")
    public WebElement onkeydown;

    @FindBy(xpath = "//button[@id='onkeyup']")
    public WebElement onkeyup;

    @FindBy(xpath = "//button[@id='onkeypress']")
    public WebElement onkeypress;


    @FindBy(xpath = "//button[@id='onmouseover']")
    public WebElement onmouseover;

    @FindBy(xpath = "//button[@id='onmouseleave']")
    public WebElement onmouseleave;

    @FindBy(xpath = "//button[@id='onmousedown']")
    public WebElement onmousedown;

    @FindBy(xpath = "//*[.='Event Triggered']")
    public List<WebElement> eventTriggeredText;


}
