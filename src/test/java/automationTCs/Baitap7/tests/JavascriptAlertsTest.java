package automationTCs.Baitap7.tests;

import automationTCs.Baitap7.pages.JavascriptAlertsPage;
import automationTCs.Baitap7.utilities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavascriptAlertsTest extends BaseTest {

        private JavascriptAlertsPage jsAlertsPage;

        @BeforeMethod
        public void setUpTest() {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            jsAlertsPage = new JavascriptAlertsPage(driver);
        }

        @Test
        public void testAcceptJSAlert() throws InterruptedException {
            jsAlertsPage.clickJSAlettBtn();
            Thread.sleep(2000);
            jsAlertsPage.acceptAlert();
            Thread.sleep(2000);
            String result = jsAlertsPage.getResultText();
            Assert.assertEquals(result,"You successfully clicked an alert");
        }

        @Test
        public void testDismissJSConfirm() throws InterruptedException{
            jsAlertsPage.clickJSConfirmBtn();
            Thread.sleep(2000);
            jsAlertsPage.dismissAlert();
            Thread.sleep(2000);
            String result = jsAlertsPage.getResultText();
            Assert.assertEquals(result,"You clicked: Cancel");
        }

        @Test
        public void testSendKeysToJSPrompt() throws InterruptedException {
            jsAlertsPage.clickJSPromptBtn();
            Thread.sleep(2000);
            jsAlertsPage.sendKeysToAlert("Hello World");
            Thread.sleep(2000);
            String result = jsAlertsPage.getResultText();
            Assert.assertEquals(result,"You entered: Hello World");
        }
    }
