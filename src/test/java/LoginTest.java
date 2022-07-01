import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;


public class LoginTest extends BaseTest {

    @RepeatedTest(2)
    @DisplayName("TC3")
    @Description("Sikeres bejelentkezés tesztelése, manuális adat bevitellel")
    @Severity(SeverityLevel.CRITICAL)
    public void loginTest() {
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginProcess();
        String expected = "https://lennertamas.github.io/portio/landing.html";

        Assertions.assertEquals(expected, driver.getCurrentUrl());
    }

    @RepeatedTest(2)
    @DisplayName("TC4")
    @Description("Sikeres bejelentkezés egy szöveges fájl sorozatos beolvasása segítségével.")
    @Severity(SeverityLevel.CRITICAL)
    public void loginTestFromDataSource() {
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginFromDataSource();
        String expected = "https://lennertamas.github.io/portio/landing.html";

        Assertions.assertEquals(expected, driver.getCurrentUrl());

    }
}