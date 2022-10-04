package tests.practise07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebDriverUniversty;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {

    // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
    // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
    //Tüm yapılacakların üzerini çiz.
    //Tüm yapılacakları sil.
    //Tüm yapılacakların silindiğini doğrulayın.


    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");
        WebDriverUniversty wdu = new WebDriverUniversty();
        /*
        wdu.textBox.sendKeys("Kahvaltıyı hazırl", Keys.ENTER);
        wdu.textBox.sendKeys("Bulaşıkları yıka", Keys.ENTER);
        wdu.textBox.sendKeys("Bebekle ilgilen", Keys.ENTER);
        wdu.textBox.sendKeys("Bebekle ilgilen", Keys.ENTER);
        wdu.textBox.sendKeys("Çocuğunun ödevine yardım et", Keys.ENTER);
        wdu.textBox.sendKeys("Selenyum çalış", Keys.ENTER);
        wdu.textBox.sendKeys("Uyu", Keys.ENTER);
        
         */
        Actions actions = new Actions(Driver.getDriver());
        List<String> workList = new ArrayList<>(Arrays.asList("Bulasiklari Yika"
                , "Bebekle Ilgilen"
                , "Cocugun Odevine Yardim Et"
                , "Selenium Calis"
                , "Uyu"));

        for (String each : workList
        ) {
            wdu.textBox.sendKeys(each, Keys.ENTER);
        }

        //wdu.todoList.forEach(WebElement::click);
        wdu.todoList.forEach(t -> t.click());

        //wdu.deleteList.forEach(t-> actions.moveToElement(t).click().perform());
        wdu.deleteList.forEach(WebElement::click);

        Thread.sleep(3000);
        Assert.assertEquals(0,wdu.newtodoList.size());



    }
}
