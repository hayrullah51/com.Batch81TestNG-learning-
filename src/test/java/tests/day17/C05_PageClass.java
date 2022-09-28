package tests.day17;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C05_PageClass {

    @Test
    public void test01() {
        Driver.getDriver().get("https://amazon.com");
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Lahmacun", Keys.ENTER);
    }
}
