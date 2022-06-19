package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends StartingPage {



    public HomePage(WebDriver driver) {
        super(driver);

    }
    public final String txtPath = "src/main/java/NavBarList.txt";
    private final By blogButton = By.xpath("//*[@id=\"navbarCollapse\"]/ul[1]/li[7]/a");
    private final By seeAllPostButton = By.xpath("//*[@id=\"blog\"]/div[2]/div[1]/div[2]/div/a");
    private final By hireMeNowButton = By.xpath("//*[@id=\"navbarCollapse\"]/div/a");
    private final By logOutButton = By.xpath("//*[@id=\"logout-link\"]/a");
    private final By navBar = By.xpath("//*[@id=\"navbarCollapse\"]/ul[1]");
    private final By navBarText = By.xpath("//*[@id=\"navbarCollapse\"]/ul[1]/li[1]/a");

    public final By navBarLine = By.xpath("//*[@id=\"navbarCollapse\"]//*[@class=\"nav-item\"]");

    public void navigateToBlog() {
        driver.findElement(blogButton).click();
        driver.findElement(seeAllPostButton).click();
    }

    public void navigateToContact() {
        driver.findElement(hireMeNowButton).click();
    }

    public void logOut() {
        driver.findElement(logOutButton).click();
    }

    public boolean createDataList(String title ) {
        boolean result = false;
        List<WebElement> list = driver.findElements(navBar);
        for (WebElement element : list) {
            System.out.println(element.getText());
            driver.findElement(navBarText);
            if (element.getText().toLowerCase().contains(title.toLowerCase())) {
                ;
                result = true;
            }
        }
        return result;
    }

    public ArrayList navBarList(By elements){
    List<WebElement> elementList = driver.findElements(elements);
    ArrayList<String> stringArrayList = new ArrayList<>();
    for (WebElement element : elementList){
       stringArrayList.add(element.getText());

    }

    return stringArrayList;

    }

    public void writeFile(ArrayList<String> data) throws IOException {
        FileWriter fw = new FileWriter(txtPath);
        fw.write(String.valueOf(data));
        fw.close();
    }
}






