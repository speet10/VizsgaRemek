package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.concurrent.TimeUnit;


public class BlogPage extends HomePage{

    public BlogPage(WebDriver driver){
        super(driver);
    }


    private final By nextButton = By.xpath("//*[@id=\"content\"]/section/div/div/nav/ul/li[3]/a");
    private final By blogPosts = By.xpath("//*[@id=\"content\"]/section/div/div/div");

/** Metódus,listába teszi a posztokat és visszaadja a lista hosszát. **/
    public int numberOfBlogPosts() {
        int num = 0;

        List<WebElement> postList = driver.findElements(blogPosts);
        num = postList.size();

        return num;
    }

    /** Metódus,megnézi,hogy a léptető gomb látható-e **/
    public boolean existsNextButton() {
        try{
            WebDriverWait wait = new WebDriverWait(driver, 8);
            wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
            return true;
        }
        catch (Exception e){
            return false;
        }

        /** Metódus,kattint a léptető gombra **/
    }
    public void nextButtonClick() {
        if (existsNextButton()) {
            driver.findElement(nextButton).click();
        }
    }

    /** Metódus, összeszámolja az oldalakon található posztokat, ameddig tud léptetni az oldalon **/
    public int blogPostCalculator() {
        int actual = 0;
        while (true) {
            driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
            actual += numberOfBlogPosts();
            if (!existsNextButton()) {
                break;
            }
            nextButtonClick();
        }
        return actual;
    }
}


