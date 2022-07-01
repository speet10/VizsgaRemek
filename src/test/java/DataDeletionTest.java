import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class DataDeletionTest extends BaseTest{



    @RepeatedTest(2)
    @DisplayName("TC12")
    @Description("Töröljük a profilunkat,ezáltal az összes adatunkat az oldalról.")
    @Severity(SeverityLevel.CRITICAL)
    public void dataDeletionTest(){
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginProcess();
        homePage.navigateToProfile();
        int cookies1 = utils.getCookies().size();
        profilePage.deleteAccountProcess();
        int cookies2 = utils.getCookies().size();
        boolean isTrue = cookies1 == cookies2;
        Assertions.assertFalse(isTrue);
    }
}
