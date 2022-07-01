import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;


public class EditDataTest extends BaseTest {


    @RepeatedTest(2)
    @DisplayName("TC11")
    @Description("Megváltoztatjuk a profiloldalunkon az adatokat.")
    @Severity(SeverityLevel.NORMAL)
    public void editDataTest() {
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginProcess();
        homePage.navigateToProfile();
        profilePage.profileEditProcess();

        String expected = "Profile Edited!";
        String actual = profilePage.getProfileEditedAlert();
        Assertions.assertEquals(expected, actual);

    }
}