package automationTCs.Baitap7.tests;

import automationTCs.Baitap7.pages.DropdownPage;
import automationTCs.Baitap7.pages.DynamicLoadingPage;
import automationTCs.Baitap7.utilities.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {
    private DropdownPage dropdownPage;

    @BeforeMethod
    public void initPage() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        dropdownPage = new DropdownPage(driver);
    }

    @Test
    public void selectOptionByvalue() throws InterruptedException{
        dropdownPage.selectOptionbyValue("1");
        Thread.sleep(2000);
        String selectedOption = dropdownPage.getSelectOptionText();
        Assert.assertEquals(selectedOption, "Option 1", "Option 1 should be selected.");
    }

    @Test
    public void selectOptionByText() throws InterruptedException{
        dropdownPage.selectOptionByVisibleText("Option 2");
        Thread.sleep(2000);
        String selectedOption = dropdownPage.getSelectOptionText();
        Assert.assertEquals(selectedOption,"Option 2", "Option 2 should be selected.");
    }
}
