package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class WebDriverUniversty {

    public WebDriverUniversty(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@type='text']")
    public WebElement textBox;

    @FindBy(xpath = "//li")
    public List<WebElement> todoList;

    @FindBy(xpath = "//i[@class='fa fa-trash']")
    public List<WebElement> deleteList;

    @FindBy(xpath = "//li")
    public List<WebElement> newtodoList;


}
