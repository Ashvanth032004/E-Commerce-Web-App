package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;

public class ProductTest extends BaseTest {

    @Test
    public void testProductSearchAndCart() {

        ProductsPage productPage = new ProductsPage(driver);

        driver.get("https://automationexercise.com/products");

        productPage.searchProduct("Blue Top");

        productPage.addFirstProductToCart();

        driver.get("https://automationexercise.com/view_cart");

        Assert.assertTrue(
                driver.getCurrentUrl().contains("view_cart")
        );
    }
}