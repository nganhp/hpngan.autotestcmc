package automationTCs.Baitap7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsPage {
    private WebDriver driver;

    //Locators
    private By addElementButton = By.xpath("//button[text()='Add Element']");
    private By deleteButtons = By.cssSelector("button.added-manually");

    //Constructor
    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Action
    public void clickAddElement() {
        driver.findElement(addElementButton).click();
    }

    public void clickDeleteButton() {
        driver.findElement(deleteButtons).click();
    }

    public int countDeleteButtons() {
        return driver.findElements(deleteButtons).size();
    }
}

