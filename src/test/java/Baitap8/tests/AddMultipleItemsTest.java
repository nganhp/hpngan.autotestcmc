package Baitap8.tests;

import Baitap8.basetest.BaseTest;
import Baitap8.pages.InventoryPage;
import Baitap8.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddMultipleItemsTest extends BaseTest {

    @Test
    public void addThreeItemsToCart_shouldShowCorrectCartCount() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addItemToCartByName("Sauce Labs Backpack");
        inventoryPage.addItemToCartByName("Sauce Labs Bike Light");
        inventoryPage.addItemToCartByName("Sauce Labs Bolt T-Shirt");

        int itemCount = inventoryPage.getCartItemCount();
        Assert.assertEquals(itemCount, 3, "Cart count is not correct.");
    }
}
