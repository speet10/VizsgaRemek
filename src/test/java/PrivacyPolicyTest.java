import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.openqa.selenium.WebElement;


public class PrivacyPolicyTest extends BaseTest {

    @RepeatedTest(2)
    @DisplayName("TC5")
    @Description("A felugró adatkezelési nyilatkozatot elfogadjuk")
    @Severity(SeverityLevel.CRITICAL)
    public void privacyPolicyAcceptingTest() throws InterruptedException {
        utils.sleep(2000);
        startingPage.privacyPolicyAccepting();
        WebElement PopUpWindow = driver.findElement(startingPage.privacyPopUpWindow);

        Assertions.assertEquals(false, PopUpWindow.isDisplayed());
    }

    @RepeatedTest(2)
    @DisplayName("TC6")
    @Description("A felugró adatkezelési nyilatkozatot bezárjuk elfogadás nélkül")
    @Severity(SeverityLevel.CRITICAL)
    public void privacyPolicyClosingTest() throws InterruptedException {
        utils.sleep(2000);
        startingPage.privacyPolicyClosing();
        WebElement PopUpWindow = driver.findElement(startingPage.privacyPopUpWindow);

        Assertions.assertEquals(false, PopUpWindow.isDisplayed());
    }
}



