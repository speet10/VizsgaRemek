package Utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Set;


public class Utils {


    private WebDriver driver;


    public Utils(WebDriver driver) {
        this.driver = driver;
    }
/** Metódus, oldal frissítése **/
    public void refresh() {

        driver.navigate().refresh();
    }

/** Metódus, görgetés lefelé 500 pixellel **/
    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
    }

/** Metódus, megszabott ideig tartott várakozás **/
    public void sleep(int time) throws InterruptedException {
        Thread.sleep(time);
    }
/** Metódus, a tárolt sütiket kiszedi **/
    public Set<Cookie> getCookies() {
        return driver.manage().getCookies();
    }
}
