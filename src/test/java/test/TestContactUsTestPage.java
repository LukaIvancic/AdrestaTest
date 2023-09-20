package test;

import constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExerciseHomepage;
import pages.ContactUsPage;


public class TestContactUsTestPage extends TestBase {



    @Test
    public void testContactUsFormSubmission(){

        AutomationExerciseHomepage automationExerciseHomepage = new AutomationExerciseHomepage(driver);

        Assert.assertEquals(driver.getCurrentUrl(), Constants.ACTUAL_AUTOMATION_EXERCISE_HOMEPAGE_URL);

        automationExerciseHomepage.clickContactUsButton();

        Assert.assertEquals(driver.getCurrentUrl(), Constants.ACTUAL_CONTACT_US_PAGE_URL);

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.populateGetInTouchForm(Constants.CONTACT_US_SUBMIT_FIRST_NAME,
                Constants.CONTACT_US_SUBMIT_EMAIL, Constants.CONTACT_US_SUBMIT_SUBJECT, Constants.CONTACT_US_SUBMIT_MESSAGE);
        contactUsPage.clickSubmitButton();
        contactUsPage.acceptAlert();


        Assert.assertEquals(contactUsPage.getSuccessMessage(), Constants.ACTUAL_SUBMISSION_SUCCESS_MESSAGE);

        contactUsPage.clickOnHomeButton();

        if (driver.getCurrentUrl().contains("#google_vignette")){
            driver.navigate().refresh();

        }

        Assert.assertEquals(driver.getCurrentUrl(), Constants.ACTUAL_AUTOMATION_EXERCISE_HOMEPAGE_URL);

    }

}
