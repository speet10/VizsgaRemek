import Pages.BlogPage;
import Pages.ContactPage;
import Pages.HomePage;
import Pages.StartingPage;
import Utils.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class BaseTest {

    WebDriver driver;
    protected StartingPage startingPage;
    protected HomePage homePage;
    protected ContactPage contactPage;
    protected BlogPage blogPage;
    protected Utils utils;


    @BeforeEach
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-extensions");
        //options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("start-maximized");
        options.addArguments("−−incognito");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://lennertamas.github.io/portio/");

        startingPage = new StartingPage(driver);
        homePage = new HomePage(driver);
        contactPage = new ContactPage(driver);
        blogPage = new BlogPage(driver);
        utils = new Utils(driver);

    }

   /* @AfterEach
    public void closeWindow(){
        driver.quit();
    }
    */
}