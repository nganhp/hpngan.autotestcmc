package automationTCs.Baitap7.tests;


import automationTCs.Baitap7.pages.DisappearingElementsPage;
import automationTCs.Baitap7.utilities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DisappearingElementsTest extends BaseTest {
    private DisappearingElementsPage disappearingElementsPage;

    @BeforeMethod
    public void setUpTest() {
        driver.get("https://the-internet.herokuapp.com/disappearing_elements");
        disappearingElementsPage = new DisappearingElementsPage(driver);
    }

    @Test
    public void testMenuItemsCount() {
        int menuCount = disappearingElementsPage.getMenuItems().size();
        Assert.assertTrue(menuCount == 4 || menuCount == 5, "Menu item count is not correct.");
    }

    @Test
    public void testGalleryMenuAppearance() {
        boolean isGalleryVisible = false;

        // Thử load lại trang tối đa 5 lần để tìm "Gallery"
        for (int i = 0; i < 5; i++) {
            if (disappearingElementsPage.isMenuItemDisplayed("Gallery")) {
                isGalleryVisible = true;
                break;
            }
            driver.navigate().refresh();
        }

        Assert.assertTrue(isGalleryVisible, "Gallery menu item is not visible after multiple refresh attempts.");
    }
}

