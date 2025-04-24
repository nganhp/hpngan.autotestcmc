package Baitap8.tests;

import Baitap8.basetest.BaseTest;
import Baitap8.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void completeCheckoutProcess_successfully() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addFirstItemToCart();
        inventoryPage.goToCart();

        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.isCartNotEmpty(), "Cart is empty.");
        cartPage.clickCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.completeStepOne("John", "Doe", "12345");

        CheckoutOverviewPage overviewPage = new CheckoutOverviewPage(driver);
        overviewPage.clickFinish();

        CheckoutCompletePage completePage = new CheckoutCompletePage(driver);
        String msg = completePage.getCompleteMessage();
        Assert.assertTrue(msg.contains("Thank you for your order!"), "Checkout message not found.");
    }
}
