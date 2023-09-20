package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(id = "search_product")
    WebElement searchProductField;

    @FindBy(id = "submit_search")
    WebElement submitSearchButton;

    @FindBy(css = "h2.title.text-center")
    private WebElement searchedProductsHeader;

    @FindBy(css = "a[href*='/product_details/1']")
    private WebElement firstProductLink;

    @FindBy(xpath = "//h2[contains(text(),'Blue Top')]")
    private WebElement blueTopProductNameElement;

    @FindBy(xpath = "//p[contains(text(),'Category: Women > Tops')]")
    WebElement blueTopCategoryElement;

    @FindBy(xpath = "//span[contains(text(),'Rs. 500')]")
    WebElement blueTopPriceElement;

    @FindBy(xpath = "//b[contains(text(),'Availability:')]")
    WebElement blueTopAvailabilityElement;

    @FindBy(xpath = "//b[contains(text(),'Condition:')]")
    WebElement blueTopConditionElement;



    public void searchInput(String searchProductText){

        searchProductField.sendKeys(searchProductText);

    }

    public void clickOnSearchButton(){

        submitSearchButton.click();

    }

    public String getSearchedProductsTitle(){

        return searchedProductsHeader.getText();

    }

    public void clickOnFirstProduct(){

        firstProductLink.click();

    }

    public String getFirstProductName(){

       return blueTopProductNameElement.getText();

    }

    public String getFirstProductCategory(){

        return blueTopCategoryElement.getText();

    }

    public String getFirstProductPrice(){

        return blueTopPriceElement.getText();

    }


}
