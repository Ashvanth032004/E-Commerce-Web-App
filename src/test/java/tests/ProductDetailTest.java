package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;

public class ProductDetailTest extends BaseTest {

    @Test
    public void testProductDetails() {

        ProductsPage productPage = new ProductsPage(driver);

        productPage.openProductsPage();
        productPage.openFirstProductDetail();

        Assert.assertFalse(productPage.getProductName().isEmpty());
        Assert.assertFalse(productPage.getProductPrice().isEmpty());
    }
}