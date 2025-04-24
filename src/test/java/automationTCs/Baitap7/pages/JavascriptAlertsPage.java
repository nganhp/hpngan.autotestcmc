package automationTCs.Baitap7.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

public class JavascriptAlertsPage {
    private WebDriver driver;

    //Locator
    private By JSAlettBtn = By.xpath("//button[text()='Click for JS Alert']");
    private By JSConfirmBtn = By.xpath("//button[text()='Click for JS Confirm']");
    private By JSPromptBtn = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultMessage = By.id("result");

    //Constructor
    public JavascriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }

    //Action
    public void clickJSAlettBtn(){
        driver.findElement(JSAlettBtn).click();
    }

    public void clickJSConfirmBtn(){
        driver.findElement(JSConfirmBtn).click();
    }

    public void clickJSPromptBtn(){
        driver.findElement(JSPromptBtn).click();
    }

    public void acceptAlert()throws InterruptedException{
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
    }
    public void dismissAlert() throws InterruptedException {
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.dismiss();
    }

    public void sendKeysToAlert(String text) throws InterruptedException {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        Thread.sleep(2000);
        alert.accept();
    }

    public String getResultText() {
        return driver.findElement(resultMessage).getText();
    }

        }
