package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductsPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void testCheckoutFlow() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        homePage.clickSignupLogin();

        loginPage.login(
                "ad2208@krce.ac.in",
                "Test@123"
        );

        productPage.openProductsPage();
        productPage.addFirstProductToCart();

        driver.get("https://automationexercise.com/view_cart");

        Assert.assertTrue(cartPage.isCartDisplayed());

        checkoutPage.proceedToCheckout();

        Assert.assertTrue(checkoutPage.isCheckoutPageDisplayed());

        checkoutPage.enterComment("Hackathon test order");
        checkoutPage.clickPlaceOrder();

        checkoutPage.enterPaymentDetails();
        checkoutPage.confirmPayment();

        Assert.assertTrue(checkoutPage.isOrderSuccessful());
    }
}