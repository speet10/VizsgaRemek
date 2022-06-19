import Pages.StartingPage;
import org.junit.jupiter.api.Test;

public class RegistrationTest extends BaseTest{

    @Test
    public void registerTest(){
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
    }
}
