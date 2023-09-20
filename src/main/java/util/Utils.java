package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

    public static WebDriver startApplication(WebDriver driver, String URL){

        driver = new ChromeDriver();
        driver.get(URL);
        return driver;
    }


    public static void quitBrowser(WebDriver driver){
        driver.quit();
    }
}
