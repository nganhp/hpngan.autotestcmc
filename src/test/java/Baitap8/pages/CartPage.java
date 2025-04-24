package Baitap8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    // Locators
    private By checkoutButton = By.id("checkout");
    private By cartItems = By.className("cart_item");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isCartNotEmpty() {
        return !driver.findElements(cartItems).isEmpty();
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }
}

