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

    public void refresh() {

        driver.navigate().refresh();
    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
    }

    public void sleep(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    public Set<Cookie> getCookies() {
        return driver.manage().getCookies();
    }
}
