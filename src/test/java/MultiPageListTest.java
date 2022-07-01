import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;


public class MultiPageListTest extends BaseTest{


    @RepeatedTest(2)
    @DisplayName("TC10")
    @Description("Megszámoljuk hány blogbejegyzést tartalmaz az összes oldal.")
    @Severity(SeverityLevel.NORMAL)
    public void paginationTest(){

        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginProcess();
        homePage.navigateToBlog();
        int expected = 9;
        int actual = blogPage.blogPostCalculator();
        utils.scrollDown();
        Assertions.assertEquals(expected, actual);
    }

}
