import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class LogoutTest extends BaseTest{


    @RepeatedTest(2)
    @DisplayName("TC14")
    @Description("Kijelentkezünk a bejelentkezett oldalon.")
    @Severity(SeverityLevel.CRITICAL)
    public void logoutTest(){
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginProcess();
        homePage.logOut();
        String expected = "https://lennertamas.github.io/portio/index.html";

        Assertions.assertEquals(expected, driver.getCurrentUrl());
    }

}
