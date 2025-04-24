package automationTCs.Baitap7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicControlsPage {
    private final WebDriver driver;

    //Locators
    private By checkbox = By.xpath("//*[@id=\"checkbox\"]/input");
    private By removeBtn = By.xpath("//*[@id=\"checkbox-example\"]/button");
    private By enableDisableBtn = By.xpath("//*[@id=\"input-example\"]/button");
    private By inputField = By.xpath("//*[@id=\"input-example\"]/input");
    private By loadingIcon = By.id("loading");
    private By messageText = By.id("message");

    //Constructor
    public DynamicControlsPage (WebDriver driver){
        this.driver = driver;
    }

    //Action

     public void clickOnCheckbox(){
        driver.findElement(checkbox).click();
     }

     public void clickEnableOrDisableBtn(){
        driver.findElement(enableDisableBtn).click();
        waitForLoadingToDisappear();
     }

     public void clickRemoveOrAddBtn(){
        driver.findElement(removeBtn).click();
     }

     public String getMessageText(){
       return driver.findElement(messageText).getText();
     }

     public boolean isTextboxEnabled(){
        return driver.findElement(inputField).isEnabled();
     }

    // Private method: Wait loading icon biến mất
    public void waitForLoadingToDisappear() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
    }

}
