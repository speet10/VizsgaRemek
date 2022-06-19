import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogoutTest extends BaseTest{

    @Test
    public void logoutTest(){
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginProcess();
        homePage.logOut();
        String expected = "https://lennertamas.github.io/portio/index.html";
        Assertions.assertEquals(expected, driver.getCurrentUrl());
    }

}
