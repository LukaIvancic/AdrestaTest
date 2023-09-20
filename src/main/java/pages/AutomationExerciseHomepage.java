package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationExerciseHomepage extends BasePage {

    public AutomationExerciseHomepage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/contact_us']")
    private WebElement contactUsLink;

    @FindBy(css = "a[href='/test_cases']")
    private WebElement testCasesLink;

    @FindBy(css = "i.material-icons.card_travel")
    private WebElement productsButton;

    @FindBy(id = "susbscribe_email")
    WebElement subscribeEmailField;

    @FindBy(id = "success-subscribe")
    WebElement successfulSubscribeMessage;

    @FindBy(id = "subscribe")
    WebElement subscribeButton;


    //Methods

    public void clickContactUsButton(){

        contactUsLink.click();

    }

    public void clickOnTestCasesButton(){

        testCasesLink.click();

    }

    public void clickOnProductsButton(){

        productsButton.click();

    }


    public void scrollAndEnterEmail(WebDriver driver, String email) {
        try {

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", subscribeEmailField);

            Thread.sleep(1000);

            subscribeEmailField.sendKeys(email);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnSubscribeButton(){

        subscribeButton.click();

    }

    public String getSuccessfulSubscriptionMessage(){

        return successfulSubscribeMessage.getText();

    }

}
