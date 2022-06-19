package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.BufferedReader;
import java.io.FileReader;


public class StartingPage {

    WebDriver driver;

    public StartingPage(WebDriver driver) {

        this.driver = driver;
    }
    public final By privacyPopUpWindow = By.xpath("//*[@id=\"overlay\"]/div");
    private final By privacyAcceptButton = By.xpath("//*[@id=\"terms-and-conditions-button\"]");
    private final By privacyCloseButton = By.xpath("//*[@id=\"overlay\"]/div/div[1]");
    private final By registerPageButton = By.xpath("(//*[@id=\"register-form-button\"])[1]");
    private final By registerUsernameInput = By.id("register-username");
    private final By registerPasswordInput = By.id("register-password");
    private final By registerEmailInput = By.id("register-email");
    private final By registerButton = By.xpath("//*[@id=\"register\"]/form/div[6]/button");
    private final By loginPageButton = By.xpath("(//*[@id=\"login-form-button\"])[2]");
    private final By loginUsernameInput = By.xpath("//*[@id=\"email\"]");
    private final By loginPasswordInput = By.xpath("//*[@id=\"password\"]");
    private final By loginButton = By.xpath("//*[@id=\"login\"]/form/div[4]/button");

    String username = "Peti";
    String password = "Peti123";
    String email = "speti94@gmail.com";


    public void privacyPolicyAccepting(){
        driver.findElement(privacyAcceptButton).click();
    }

    public void privacyPolicyClosing() {
        driver.findElement(privacyCloseButton).click();
    }

    public void registerProcess() {
        driver.findElement(registerPageButton).click();
        driver.findElement(registerUsernameInput).click();
        driver.findElement(registerUsernameInput).sendKeys(username);
        driver.findElement(registerPasswordInput).click();
        driver.findElement(registerPasswordInput).sendKeys(password);
        driver.findElement(registerEmailInput).click();
        driver.findElement(registerEmailInput).sendKeys(email);
        driver.findElement(registerButton).click();
    }

    public void loginProcess() {
        driver.findElement(loginPageButton).click();
        driver.findElement(loginUsernameInput).click();
        driver.findElement(loginUsernameInput).sendKeys(username);
        driver.findElement(loginPasswordInput).click();
        driver.findElement(loginPasswordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }


    FileReader fr = null;
    BufferedReader br = null;

    String readLine;
    String filePath;
    StringBuffer ab;

    public void readTextFile(String filePath) throws Exception {


        fr = new FileReader(filePath);
        br = new BufferedReader(fr);
        while ((readLine = br.readLine()) !=null) ;
    }


}

