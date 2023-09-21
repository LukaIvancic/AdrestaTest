package test;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.Utils;




public class TestBase {

    public WebDriver driver;



    @BeforeMethod
    public void setUp(){

        driver = Utils.startApplication(driver,Constants.AUTOMATION_EXERCISE_URL);

    }


    @AfterMethod
    public void tearDown(){

        Utils.quitBrowser(driver);

    }
}
