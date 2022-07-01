import Pages.StartingPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RegistrationTest extends BaseTest {
    @RepeatedTest(2)
    @DisplayName("TC1")
    @Description("Sikeres regisztráció folyamat tesztelése, manuális adat bevitellel")
    @Severity(SeverityLevel.CRITICAL)
    public void registerTest(){
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        String actual = startingPage.getRegisterAlert();
        String expected = "User registered!";
        Assertions.assertEquals(expected, actual);
    }



    @RepeatedTest(2)
    @DisplayName("TC2")
    @Description("Sikeres regisztráció egy szöveges fájl sorozatos beolvasása segítségével")
    @Severity(SeverityLevel.CRITICAL)
    public void registerTestFromDataSource() {
        startingPage.privacyPolicyAccepting();
        startingPage.registrationFromDataSource();
        String actual = startingPage.getRegisterAlert();
        String expected = "User registered!";
        Assertions.assertEquals(expected, actual);
    }
}
