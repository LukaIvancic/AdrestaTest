package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[data-qa='name'][type='text'][name='name']")
    WebElement nameInput;

    @FindBy(css = "input[data-qa='email'][type='email'][name='email']")
    private WebElement emailInput;

    @FindBy(css = "input[data-qa='subject'][type='text'][name='subject']")
    private WebElement subjectInput;

    @FindBy(id = "message")
    private WebElement messageInput;

    @FindBy(css = "input[type='submit'][data-qa='submit-button'][name='submit']")
    private WebElement submitButton;

    @FindBy(css = "input[type='file'][name='upload_file']")
    private WebElement chooseFileButton;

    @FindBy(css = "div.status.alert.alert-success")
    private WebElement successMessage;

    @FindBy(css = "a.btn.btn-success[href='/']")
    private WebElement homeLink;



    public void populateGetInTouchForm(String name, String email, String subject, String message){

        nameInput.sendKeys(name);
        emailInput.sendKeys(email);
        subjectInput.sendKeys(subject);
        messageInput.sendKeys(message);
        String filePath = "C:/Users/Hp 840 G1/Downloads/AdrestaTest/src/main/java/util/file/File.txt";
        chooseFileButton.sendKeys(filePath);

    }

    public void clickSubmitButton(){

        submitButton.click();

    }

    public void acceptAlert(){

        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    public String getSuccessMessage(){

        return successMessage.getText();

    }

    public void clickOnHomeButton(){

        homeLink.click();

    }


}
