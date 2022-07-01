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


    public int numberOfBlogPosts() {
        int num = 0;

        List<WebElement> postList = driver.findElements(blogPosts);
        num = postList.size();

        return num;
    }
    public boolean existsNextButton() {
        try{
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    public void nextButtonClick() {
        if (existsNextButton()) {
            driver.findElement(nextButton).click();
        }
    }
    public int blogPostCalculator() {
        int actual = 0;
        while (true) {
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            actual += numberOfBlogPosts();
            if (!existsNextButton()) {
                break;
            }
            nextButtonClick();
        }
        return actual;
    }


}


