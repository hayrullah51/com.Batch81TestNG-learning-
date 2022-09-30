package utilities;

import java.util.Properties;

public class ConfigReader {

    public static Properties properties;

    public static String getProperty(String key){
        /*
        Test method'undan yolladigimiz String key degeri alip properties class'indan
        getProperty()'unu kullanarak bu key'e ait value 'yu bize getirir
         */

        return properties.getProperty(key);
    }



}
