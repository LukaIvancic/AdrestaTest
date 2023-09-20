package test;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.Utils;




public class TestBase {

    public WebDriver driver;

//    public void refreshPage(){
//
//        if (driver.getCurrentUrl().contains("#google_vignette")){
//            driver.navigate().refresh();
//        }
//
//    }


    /**
     * Method starts the application and goes to Humanity app
     *
     * @author Luka.Ivancic
     *
     * */
    @BeforeMethod
    public void setUp(){

        driver = Utils.startApplication(driver,Constants.AUTOMATION_EXERCISE_URL);

    }

    /**
     * Method exits the browser
     *
     * @author Luka.Ivancic
     *
     * */
    @AfterMethod
    public void tearDown(){

        Utils.quitBrowser(driver);

    }
}
