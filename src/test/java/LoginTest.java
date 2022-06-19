import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest() {
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginProcess();
        String expected = "https://lennertamas.github.io/portio/landing.html";

        Assertions.assertEquals(expected, driver.getCurrentUrl());
    }

}
