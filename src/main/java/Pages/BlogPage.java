package Pages;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class BlogPage extends HomePage{

    public BlogPage(WebDriver driver){
        super(driver);

    }
    private final By firstButton = By.xpath("//*[@id=\"content\"]/section/div/div/nav/ul/li[1]/a");
    private final By secondButton = By.xpath("//*[@id=\"content\"]/section/div/div/nav/ul/li[2]/a");
    private final By nextButton = By.xpath("//*[@id=\"content\"]/section/div/div/nav/ul/li[3]/a");


    public void pagination(){

        Utils util = new Utils(driver);
        util.scrollDown();
        driver.findElement(secondButton).click();
        driver.findElement(firstButton).click();
        util.scrollDown();
    }
    public void paginationNextButton(){
        Utils util = new Utils(driver);
        util.scrollDown();
        driver.findElement(nextButton).click();
        driver.findElement(firstButton).click();
        util.scrollDown();
    }
    public void paginationBack(){
        driver.findElement(secondButton).click();
        Utils util = new Utils(driver);
        util.goBack();
    }

    public void paginationNextButtonBack(){
        driver.findElement(nextButton).click();
        Utils util = new Utils(driver);
        util.goBack();
    }
}


