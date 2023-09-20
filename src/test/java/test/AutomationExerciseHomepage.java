package test;

import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationExerciseHomepage extends TestBase {

    @Test
    public void testSubscriptionInHomePage(){

        pages.AutomationExerciseHomepage automationExerciseHomepage = new pages.AutomationExerciseHomepage(driver);

        automationExerciseHomepage.scrollAndEnterEmail(driver, Constants.SUBSCRIBE_EMAIL);
        automationExerciseHomepage.clickOnSubscribeButton();

        Assert.assertEquals(automationExerciseHomepage.getSuccessfulSubscriptionMessage(), Constants.ACTUAL_SUCCESSFUL_SUBSCRIPTION_MESSAGE);

    }

}
