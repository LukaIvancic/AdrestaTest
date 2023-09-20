package test;

import constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExerciseHomepage;
import pages.ProductsPage;


public class TestProductsPage extends TestBase {


    @Test
    public void verifyAllProductsAndProductDetailPage() throws InterruptedException {

        AutomationExerciseHomepage automationExerciseHomepage = new AutomationExerciseHomepage(driver);


        automationExerciseHomepage.clickOnProductsButton();

        if (driver.getCurrentUrl().contains("#google_vignette")){
            driver.navigate().refresh();
            automationExerciseHomepage.clickOnProductsButton();
        }

        Assert.assertEquals(driver.getCurrentUrl(), Constants.ACTUAL_PRODUCTS_PAGE_URL);

        ProductsPage productsPage = new ProductsPage(driver);

        Thread.sleep(5000);

        productsPage.clickOnFirstProduct();

        if (driver.getCurrentUrl().contains("#google_vignette")){
            driver.navigate().refresh();
            productsPage.clickOnFirstProduct();
        }

        Assert.assertEquals(productsPage.getFirstProductName(), "Blue Top");
        Assert.assertEquals(productsPage.getFirstProductCategory(), "Category: Women > Tops");
        Assert.assertEquals(productsPage.getFirstProductPrice(), "Rs. 500");






    }

    @Test
    public void testSearchProduct() throws InterruptedException {

        AutomationExerciseHomepage automationExerciseHomepage = new AutomationExerciseHomepage(driver);

        Assert.assertEquals(driver.getCurrentUrl(), Constants.ACTUAL_AUTOMATION_EXERCISE_HOMEPAGE_URL);

        automationExerciseHomepage.clickOnProductsButton();

        if (driver.getCurrentUrl().contains("#google_vignette")){
            driver.navigate().refresh();
            automationExerciseHomepage.clickOnProductsButton();
        }

//        Assert.assertEquals(driver.getCurrentUrl(), Constants.ACTUAL_PRODUCTS_PAGE_URL);

        ProductsPage productsPage = new ProductsPage(driver);

        productsPage.searchInput(Constants.SEARCH_PRODUCT_INPUT);

        if (driver.getCurrentUrl().contains("#google_vignette")){
            driver.navigate().refresh();
        }

        productsPage.clickOnSearchButton();

        if (driver.getCurrentUrl().contains("#google_vignette")){
            driver.navigate().refresh();
        }

        Assert.assertEquals(productsPage.getSearchedProductsTitle(), Constants.ACTUAL_SEARCHED_PRODUCTS_TITLE);


    }


}
