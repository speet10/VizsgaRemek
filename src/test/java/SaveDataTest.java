import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveDataTest extends BaseTest{

    @RepeatedTest(1)
    @DisplayName("TC13")
    @Description("Lementjük egy txt. fájlba a menüpontok listáját.")
    @Severity(SeverityLevel.CRITICAL)
    public void saveDataTest() throws IOException, InterruptedException {
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginProcess();
        ArrayList<String> finalList = (homePage.navBarList(homePage.navBarLine));
        homePage.writeFile(finalList);

        Assertions.assertNotNull(finalList);

        Thread.sleep(8000);
        homePage.clearTextList();
    }
}
