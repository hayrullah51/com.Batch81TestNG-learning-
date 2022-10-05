package tests.day22;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BlueCarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {

    /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */
BlueCarPage blueCarPage = new BlueCarPage();

    @Test
    public void test01() {

        extentTest = extentReports.createTest("Pozitif Test","Gecerli kullanici adi ve password ile girildi");
        //-https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blueUrl"));
        //    -login butonuna bas
        blueCarPage.logIn.click();

extentTest.info("login butonuna basildi");
        //    -test data user email: customer@bluerentalcars.com ,
        blueCarPage.emailGiris.sendKeys(ConfigReader.getProperty("userEmail"));

        //    -test data password : 12345 dataları girip login e basın
        blueCarPage.passwordGiris.sendKeys(ConfigReader.getProperty("passwordblu"));

        //    -login butonuna tiklayin
        blueCarPage.logInGiris.click();
        extentTest.info("Dogru kullanici ve password girildi");
        extentTest.info("Ikinci login butonuna basildi");

        //    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(blueCarPage.userGirisBasarili.isDisplayed());
        extentTest.pass("Test Basarili sekilde yapildi");



    }
}
