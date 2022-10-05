package tests.practise08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerOkuTestPage;
import utilities.Driver;

public class P01 {
    //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
    //Click all the buttons and verify they are all clicked

HerOkuTestPage herOkuTestPage;
Actions actions = new Actions(Driver.getDriver());
    @Test
    public void test01() {
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        //Click all the buttons and verify they are all clicked

        herOkuTestPage = new HerOkuTestPage();
        //kodlarımız yazarken clean code kapsamında daha sade kod yazabilmek amacı ile her test methodu içerisinde
        //ayrı bir object create etmektense bu objecti class seviyesinde instance olarak create edip
        //test methodlarında buna değer atamak ve kullanmak daha uygun bir yöntemdir

        herOkuTestPage.onblur.click();
        herOkuTestPage.onClick.click();
        herOkuTestPage.onClick.click();

        actions.contextClick(herOkuTestPage.oncontextmenu).
                doubleClick(herOkuTestPage.ondoubleclick).
                click(herOkuTestPage.onfocus).
                click(herOkuTestPage.onkeydown).
                sendKeys(Keys.ENTER).
                click(herOkuTestPage.onkeyup).
                sendKeys(Keys.ENTER).
                click(herOkuTestPage.onkeypress).
                sendKeys(Keys.ENTER).
                moveToElement(herOkuTestPage.onmouseover).
                moveToElement(herOkuTestPage.onmouseleave).
                sendKeys(Keys.PAGE_DOWN).
                moveToElement(herOkuTestPage.onmousedown).
                click(herOkuTestPage.onmousedown).perform();

        Assert.assertEquals(herOkuTestPage.eventTriggeredText.size(),11);


    }

    @Test
    public void test02() {
        Assert.assertEquals(herOkuTestPage.eventTriggeredText.size(),11);
    }
}
