package automationTCs.Baitap7.tests;

import automationTCs.Baitap7.BaseTest.BaseTest;
import automationTCs.Baitap7.pages.DynamicControlsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {
    private DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void initPage(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage(driver);
    }

    @Test
    public void testRemoveCheckbox() throws InterruptedException {
        dynamicControlsPage.clickOnCheckbox();
        Thread.sleep(1000);
        dynamicControlsPage.clickRemoveOrAddBtn();
        Thread.sleep(1000);
        dynamicControlsPage.waitForLoadingToDisappear();
        String message = dynamicControlsPage.getMessageText();
        Assert.assertEquals(message,"It's gone!","❌ Message not as expected after removing checkbox");
    }

    @Test
    public void testAddBtn() throws InterruptedException {
        dynamicControlsPage.clickRemoveOrAddBtn();
        dynamicControlsPage.waitForLoadingToDisappear();
        dynamicControlsPage.clickRemoveOrAddBtn();
        dynamicControlsPage.waitForLoadingToDisappear();
        String message = dynamicControlsPage.getMessageText();
        Assert.assertEquals(message,"It's back!", "❌ Message not as expected after removing checkbox");

    }

    @Test
    public void checkEnableInput() throws InterruptedException {
        dynamicControlsPage.clickEnableOrDisableBtn();
        boolean isEnable = dynamicControlsPage.isTextboxEnabled();
        dynamicControlsPage.waitForLoadingToDisappear();
        Assert.assertTrue(isEnable, " \"❌ Textbox should be enabled but it's not\"");

    }
}
