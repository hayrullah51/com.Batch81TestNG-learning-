package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeAfter;

public class C02_HardAssert extends TestBaseBeforeAfter {

    @Test
    public void test01() {
        //1-amazon anasayfaya gidin
        //2-title in Amazon içerdigini test edin
        //3-arama kutusnun erişilebilir oldugunu tets edin
        //4-arama kutusuna Nuella yazıp aratın
        //5-arama yapıldıgını test edin
        //6-arama sonucunun Nutella içerdigini test edin

        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isEnabled());
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']")).getText().contains("Nutella"));

    }
}
