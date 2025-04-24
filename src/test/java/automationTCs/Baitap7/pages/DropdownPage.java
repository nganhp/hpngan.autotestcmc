package automationTCs.Baitap7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static java.awt.SystemColor.text;

public class DropdownPage {
    private final WebDriver driver;

    //Locators
    private By dropdown = By.id("dropdown");

    //Constructor
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    //Action
    private Select getDropdownSelect () throws InterruptedException{
        WebElement dropDownElement = driver.findElement(dropdown);
        Thread.sleep(2000);
        return new Select(dropDownElement);
    }

    public void selectOptionbyValue(String value) throws InterruptedException {
        getDropdownSelect().selectByValue(value);
    }

    public void selectOptionByVisibleText(String text) throws InterruptedException{
       getDropdownSelect().selectByVisibleText(text);
    }

    public String getSelectOptionText() throws InterruptedException{
        return getDropdownSelect().getFirstSelectedOption().getText();
    }
}
