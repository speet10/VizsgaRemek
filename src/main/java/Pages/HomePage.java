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
    private final By blogButton = By.xpath("//*[@id=\"navbarCollapse\"]/ul[1]/li[7]/a");
    private final By seeAllPostButton = By.xpath("//*[@id=\"blog\"]/div[2]/div[1]/div[2]/div/a");
    private final By logOutButton = By.xpath("//*[@id=\"logout-link\"]/a");
    private final By navBar = By.xpath("//*[@id=\"navbarCollapse\"]/ul[1]");
    private final By navBarText = By.xpath("//*[@id=\"navbarCollapse\"]/ul[1]/li[1]/a");
    public final By navBarLine = By.xpath("//*[@id=\"navbarCollapse\"]//*[@class=\"nav-item\"]");
    private final By profileButton = By.xpath("//*[@id=\"profile-btn\"]");

/** Metódus, a profil oldalra navigál **/
    public void navigateToProfile(){
        driver.findElement(profileButton).click();
    }

/** Metódus, a profil oldalra navigál **/
    public void navigateToBlog() throws InterruptedException {
        driver.findElement(blogButton).click();
        Thread.sleep(1500);
        driver.findElement(seeAllPostButton).click();
    }

/** Metódus, rákattint a kijelentkezés gombra **/
    public void logOut() {
        driver.findElement(logOutButton).click();
    }


/** Metódus, csinál egy listát ,ami a navigációs sáv elemeinek a neveit tartalmazza,
 majd a tesztben megnézhetjük,hogy a keresett elemnek a nevét tartalmazza -e a lista **/
    public boolean createDataList(String word ) {
        boolean result = false;
        List<WebElement> list = driver.findElements(navBar);
        for (WebElement element : list) {
            System.out.println(element.getText());
            driver.findElement(navBarText);
            if (element.getText().toLowerCase().contains(word.toLowerCase())) {
                
                result = true;
            }
        }
        return result;
    }

 /** Metódus, a navigációs sáv elemeinek listáját átadjuk egy tömbnek **/
    public ArrayList navBarList(By elements){
    List<WebElement> elementList = driver.findElements(elements);
    ArrayList<String> stringArrayList = new ArrayList<>();
    for (WebElement element : elementList){
       stringArrayList.add(element.getText());

    }

    return stringArrayList;

    }

    /** Metódus, létrehozunk egy NavBarList.txt fájlt és beleírunk tömb lista elemeket **/

    public void writeFile(ArrayList<String> data) throws IOException {
        FileWriter fw = new FileWriter("src/main/java/NavBarList.txt");
        fw.write(String.valueOf(data));
        fw.close();
    }

 /** Metódus, a tömb elemeit eltávolítja a fájlból **/
    public void clearTextList() throws IOException {
        new FileWriter("src/main/java/NavBarList.txt",false).close();
    }
}






