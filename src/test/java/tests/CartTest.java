package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductsPage;

public class CartTest extends BaseTest {

    @Test
    public void testRemoveProductFromCart() {

        ProductsPage productPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);

        productPage.openProductsPage();

        productPage.addFirstProductToCart();
        productPage.continueShopping();
        productPage.goToCart();

        Assert.assertTrue(cartPage.isCartDisplayed());

        cartPage.removeProduct();

        Assert.assertTrue(cartPage.isCartEmpty());
    }
}