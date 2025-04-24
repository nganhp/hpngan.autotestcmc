package Baitap8.tests;

import Baitap8.basetest.BaseTest;
import Baitap8.pages.InventoryPage;
import Baitap8.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentials_shouldNavigateToInventoryPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        Assert.assertTrue(inventoryPage.isInventoryDisplayed(), "Inventory page is not displayed after login.");
    }

    @Test
    public void loginWithMissingPassword_shouldShowError() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "");

        String errorMsg = loginPage.getErrorMessage();
        Assert.assertTrue(errorMsg.contains("Password is required"), "Error message is incorrect.");
    }
}
