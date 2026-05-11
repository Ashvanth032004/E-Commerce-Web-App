package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void testCheckoutFlow() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        homePage.clickSignupLogin();

        loginPage.login(
                "ad2208@krce.ac.in",
                "Test@123"
        );

        productPage.openProductPage();
        productPage.searchProduct("Blue Top");
        productPage.addFirstProductToCart();
        productPage.continueShopping();
        productPage.goToCart();

        Assert.assertTrue(cartPage.isCartDisplayed());

        checkoutPage.proceedToCheckout();

        Assert.assertTrue(checkoutPage.isCheckoutPageDisplayed());
    }
}