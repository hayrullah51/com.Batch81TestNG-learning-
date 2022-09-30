package tests.day18;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C01 {

    @Test
    public void test01() {
        Driver.getDriver().get("https://facebook.com");

        FacebookPage facebookPage = new FacebookPage();
        Faker faker = new Faker();
        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.password.sendKeys(faker.internet().password());
        facebookPage.girisYap.click();
        Assert.assertTrue(facebookPage.girisBasarisizText.isDisplayed());


    }
}
