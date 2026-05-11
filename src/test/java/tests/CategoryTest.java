package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;

public class CategoryTest extends BaseTest {

    @Test
    public void testCategoryNavigation() {

        ProductsPage productPage = new ProductsPage(driver);

        productPage.openProductsPage();
        productPage.openWomenCategory();

        Assert.assertTrue(productPage.isCategoryProductVisible());
    }
}