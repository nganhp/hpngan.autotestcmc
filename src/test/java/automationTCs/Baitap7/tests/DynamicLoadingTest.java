package automationTCs.Baitap7.tests;

import automationTCs.Baitap7.pages.DynamicControlsPage;
import automationTCs.Baitap7.pages.DynamicLoadingPage;
import automationTCs.Baitap7.utilities.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.annotation.Target;

public class DynamicLoadingTest extends BaseTest {
    private DynamicLoadingPage dynamicLoadingPage;

    @BeforeMethod
    public void initPage() {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        dynamicLoadingPage = new DynamicLoadingPage(driver);
    }

    @Test
    public void testExample1ElementAppears(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        dynamicLoadingPage.clickOnStartBtn();
        String message = dynamicLoadingPage.gethelloWorldText();
        Assert.assertEquals(message, "Hello World!", "The text after loading is incorrect in Example 1." );
    }
    @Test
    public void testExample2ElementHiddenAndAppears(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        dynamicLoadingPage.clickOnStartBtn();
        String message = dynamicLoadingPage.gethelloWorldText();
        Assert.assertEquals(message, "Hello World!", "The text after loading is incorrect in Example 1." );
    }
}