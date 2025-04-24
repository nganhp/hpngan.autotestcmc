package automationTCs.Baitap7.tests;

import automationTCs.Baitap7.pages.AddRemoveElementsPage;
import automationTCs.Baitap7.BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddRemoveElementsTest extends BaseTest {
    private AddRemoveElementsPage addRemoveElementsPage;

    @BeforeMethod
    public void setUpTest() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        addRemoveElementsPage = new AddRemoveElementsPage(driver);
    }

    @Test
    public void testAddOneElement() {
        addRemoveElementsPage.clickAddElement();
        Assert.assertEquals(addRemoveElementsPage.countDeleteButtons(), 1);
    }

    @Test
    public void testAddThreeElements() {
        addRemoveElementsPage.clickAddElement();
        addRemoveElementsPage.clickAddElement();
        addRemoveElementsPage.clickAddElement();
        Assert.assertEquals(addRemoveElementsPage.countDeleteButtons(), 3);
    }

    @Test
    public void testDeleteElement() {
        addRemoveElementsPage.clickAddElement();
        addRemoveElementsPage.clickAddElement();
        addRemoveElementsPage.clickDeleteButton();
        Assert.assertEquals(addRemoveElementsPage.countDeleteButtons(), 1);
    }
}

