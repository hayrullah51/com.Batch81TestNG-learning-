package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeAfter;

public class C03_SoftAssertion extends TestBaseBeforeAfter {
    @Test
    public void test01() {
        /*
        SoftAssert baslangic ve bitis satirlari arasindaki tum assertion'lari yapip
        bitis olarak belirtmemiz gereken assertAll() methoduyla test methodumuzdaki
        butun assertion'lari kontrol eder. Failed olan olursa assertion yaptigimiz
        methodun sonuna yazdigimiz mesaji bize konsolda verir.
         */

        //1-amazon anasayfaya gidin
        //2-title in Amazon içerdigini test edin
        //3-arama kutusnun erişilebilir oldugunu tets edin
        //4-arama kutusuna Nuella yazıp aratın
        //5-arama yapıldıgını test edin
        //6-arama sonucunun Nutella içerdigini test edin

        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        softAssert.assertTrue(driver.getTitle().contains("Amazon"));
        softAssert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isEnabled());
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
        softAssert.assertTrue(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
        softAssert.assertTrue(driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']")).getText().contains("Nutella"));

        softAssert.assertAll();
    }
}
