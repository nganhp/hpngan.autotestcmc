package automationTCs.Baitap7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {
    private WebDriverWait wait;
    private final WebDriver driver;

    //Locators
    private By startBtn = By.xpath("//*[@id=\"start\"]/button");
    private By loadingIndicator = By.id("loading");
    private By helloWorldText = By.xpath("//*[@id=\"finish\"]/h4");

    //Constructor
    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Action
    public void clickOnStartBtn() {
        driver.findElement(startBtn).click();
    }

    public String gethelloWorldText() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIndicator));
        return driver.findElement(helloWorldText).getText();
    }
}
