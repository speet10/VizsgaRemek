import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;


public class ListingDataTest extends BaseTest{


    @RepeatedTest(2)
    @DisplayName("TC7")
    @Description("A navigációs sáv menüpontjait listába szedjük és ellenőrizzük , hogy valóban megtalálható-e benne egy választott szó.")
    @Severity(SeverityLevel.CRITICAL)
    public void listDataTest (){
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginProcess();
        String word="Home";
        boolean result = homePage.createDataList(word);

        Assertions.assertTrue(result);
    }

    @RepeatedTest(2)
    @DisplayName("TC8")
    @Description("A navigációs sáv menüpontjait listába szedjük és ellenőrizzük , hogy valóban megtalálható-e benne egy választott szó,ha kisbetűvel is írjuk.")
    @Severity(SeverityLevel.NORMAL)
    public void listDataTestWithLowerCase (){
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginProcess();
        String word="home";
        boolean result = homePage.createDataList(word);

        Assertions.assertTrue(result);
    }

    @RepeatedTest(2)
    @DisplayName("TC9")
    @Description("A navigációs sáv menüpontjait listába szedjük és ellenőrizzük, hogy egy random választott szó nem szerepel-e benne.")
    @Severity(SeverityLevel.NORMAL)
    public void listDataTestWithWrongData (){
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginProcess();
        String title="Games";
        boolean result = homePage.createDataList(title);

        Assertions.assertFalse(result);
    }
}
