package Baitap8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class InventoryPage {
    private WebDriver driver;

    // Locators
    private By inventoryContainer = By.className("inventory_list");
    private By addToCartButton = By.xpath("//button[contains(text(),'Add to cart')]");
    private By cartIcon = By.className("shopping_cart_link");

    // Constructor
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public boolean isInventoryDisplayed() {
        return driver.findElement(inventoryContainer).isDisplayed();
    }

    public void addFirstItemToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }

    public void addItemToCartByName(String itemName) {
        String xpath = "//div[text()='" + itemName + "']/ancestor::div[@class='inventory_item']//button";
        driver.findElement(By.xpath(xpath)).click();
    }

    public int getCartItemCount() {
        String countText = driver.findElement(By.className("shopping_cart_badge")).getText();
        return Integer.parseInt(countText);
    }
}


