package test;

import constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExerciseHomepage;
import pages.TestCasesPage;

public class TestTestCasesPage extends TestBase {

    @Test
    public void testTestCasesPage(){

        AutomationExerciseHomepage automationExerciseHomepage = new AutomationExerciseHomepage(driver);

        Assert.assertEquals(driver.getCurrentUrl(), Constants.ACTUAL_AUTOMATION_EXERCISE_HOMEPAGE_URL);

        automationExerciseHomepage.clickOnTestCasesButton();

        TestCasesPage testCasesPage = new TestCasesPage(driver);
        if (driver.getCurrentUrl().contains("#google_vignette")){
            driver.navigate().refresh();
            automationExerciseHomepage.clickOnTestCasesButton();
        }
        Assert.assertEquals(testCasesPage.getCurrentURL(), Constants.ACTUAL_TEST_CASES_PAGE_URL);
        Assert.assertEquals(testCasesPage.getTestCasesPageHeaderText(), Constants.ACTUAL_TEST_CASES_PAGE_HEADER);



    }

}
