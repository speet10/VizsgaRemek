import Pages.BlogPage;
import Pages.HomePage;
import Pages.ProfilePage;
import Pages.StartingPage;
import Utils.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/** Ebből származtatjuk a többi tesztosztályt. **/
public class BaseTest {

/** Az oldalakat már itt példányosítom,
  ezáltal az itt megadott nevekkel tudok hivatkozni még külön példányosítás nélkül. **/
    WebDriver driver;

    protected StartingPage startingPage;
    protected HomePage homePage;
    protected BlogPage blogPage;
    protected Utils utils;
    protected ProfilePage profilePage;

/** A BeforeEach minden teszt előtt lefut **/
    @BeforeEach
    public void setUp(){

        WebDriverManager.chromedriver().setup();                        /** WebDriver beállításában segít **/
        ChromeOptions options = new ChromeOptions();                    /** A ChromeDriver beállításai **/
        options.addArguments("--no-sandbox");                           /** Ne legyen elszigetelt környezet **/
        options.addArguments("--disable-dev-shm-usage");                /** Kikapcsoljuk az ideiglenes fájltároló rendzsert **/
        options.addArguments("--disable-notifications");                /** Kikapcsoljuk az értesítéseket **/
        options.addArguments("--disable-extensions");                   /** Kikapcsoljuk a bővítményeket **/
        options.addArguments("--headless");                             /** Megjelenés nélkül fusson le **/
        options.addArguments("--window-size=1920,1080");                /** A képernyő méretét 1920,1080 felbontásra állítjuk **/
        options.addArguments("start-maximized");                        /** Teljes képernyőn fusson a teszt **/
        options.addArguments("−−incognito");                            /** Inkognító módban fusson **/
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  /** Ez az időkorlát arra szolgál, hogy megadja, mennyi időt várjon az illesztőprogram egy elem keresése közben, ha az nincs azonnal jelen **/
        driver.manage().window().maximize();
        driver.get("https://lennertamas.github.io/portio/");

        startingPage = new StartingPage(driver);
        homePage = new HomePage(driver);
        blogPage = new BlogPage(driver);
        utils = new Utils(driver);
        profilePage = new ProfilePage(driver);
    }

    /** AZ AfterEach minden teszt után lefut **/

  @AfterEach
    public void closure(){
       driver.manage().deleteAllCookies();      /** Törli a sütiket **/
       driver.quit();                           /** Kilép a driverből **/
    }
}