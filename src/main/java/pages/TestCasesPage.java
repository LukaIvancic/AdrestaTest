package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends BasePage{
    public TestCasesPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "h2")
    private WebElement h2Element;

    public String getTestCasesPageHeaderText(){

       return h2Element.getText();

    }

}
