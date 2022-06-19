import org.junit.jupiter.api.Test;

public class MultiPageListTest extends BaseTest{

    @Test
    public void paginationTest(){

        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginProcess();
        homePage.navigateToBlog();
        blogPage.pagination();
    }

    @Test
    public void readTest(){
        startingPage.privacyPolicyAccepting();
        startingPage.registerProcess();
        startingPage.loginProcess();
        homePage.navigateToBlog();

    }
}
