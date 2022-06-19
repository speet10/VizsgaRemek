import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;


public class PrivacyPolicyTest extends BaseTest {

    @Test
    public void privacyPolicyAcceptingTest() throws InterruptedException {
        utils.sleep(2000);
        startingPage.privacyPolicyAccepting();
        WebElement PopUpWindow = driver.findElement(startingPage.privacyPopUpWindow);
        Assertions.assertEquals(false, PopUpWindow.isDisplayed());
    }

    @Test
    public void privacypolicyClosingTest() throws InterruptedException {
        utils.sleep(2000);
        startingPage.privacyPolicyClosing();
        WebElement PopUpWindow = driver.findElement(startingPage.privacyPopUpWindow);
        Assertions.assertEquals(false, PopUpWindow.isDisplayed());
    }
}



