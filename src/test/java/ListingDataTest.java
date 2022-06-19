import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ListingDataTest extends BaseTest{
    private final String title="Home";

    @Test
    public void listDataTest (){
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginProcess();
        boolean result = homePage.createDataList(title);
        Assertions.assertTrue(result);
    }
}
