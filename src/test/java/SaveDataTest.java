import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveDataTest extends BaseTest{

    @Test
    public void saveDataTest() throws IOException {
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginProcess();
        ArrayList<String> finalList = (homePage.navBarList(homePage.navBarLine));
        homePage.writeFile(finalList);
        Assertions.assertNotNull(finalList);
        new FileWriter("src/main/java/NavBarList.txt",false).close();
    }
}
