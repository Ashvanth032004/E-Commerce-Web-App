package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

    private By proceedToCheckoutBtn = By.xpath("//a[contains(text(),'Proceed To Checkout')]");
    private By addressDetails = By.id("address_delivery");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void proceedToCheckout() {
        click(proceedToCheckoutBtn);
    }

    public boolean isCheckoutPageDisplayed() {
        return isDisplayed(addressDetails);
    }
}