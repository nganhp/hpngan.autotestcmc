package automationTCs.Baitap7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class DisappearingElementsPage {
    private WebDriver driver;

    //Locators
    private By menuItems = By.cssSelector("ul li a");

    //Constructor
    public DisappearingElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Action
    public List<WebElement> getMenuItems() {
        return driver.findElements(menuItems);
    }

    public boolean isMenuItemDisplayed(String itemName) {
        for (WebElement item : getMenuItems()) {
            if (item.getText().equalsIgnoreCase(itemName)) {
                return true;
            }
        }
        return false;
    }
}

