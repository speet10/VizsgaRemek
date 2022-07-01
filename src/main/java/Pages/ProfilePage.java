package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends HomePage {

    public ProfilePage(WebDriver driver) {

        super(driver);
    }

    private final By profileNameInput = By.xpath("//*[@id=\"name\"]");
    private final By profileBioInput = By.xpath("//*[@id=\"bio\"]");
    private final By profilePhoneInput = By.xpath("//*[@id=\"phone-number\"]");
    private final By saveProfileButton = By.xpath("//*[@id=\"edit-profile\"]/form/div[5]/button");
    private final By deleteAccountButton = By.xpath("//*[@id=\"edit-profile\"]/form/div[6]/button");
    private final By secondDeleteAccountButton = By.xpath("//*[@id=\"delete-account-btn\"]");
    private final By profileEditAlert = By.xpath("//*[@id=\"edit-alert\"]");

    String newName = "Peter";
    String newBio = "Ez a profilom.";
    String newPhoneNumber = "+36303333333";

    public String getProfileEditedAlert() {

        return driver.findElement(profileEditAlert).getText();

    }

    public void profileEditProcess(){

        driver.findElement(profileNameInput).click();
        driver.findElement(profileNameInput).sendKeys(newName);
        driver.findElement(profileBioInput).click();
        driver.findElement(profileBioInput).sendKeys(newBio);
        driver.findElement(profilePhoneInput).click();
        driver.findElement(profilePhoneInput).sendKeys(newPhoneNumber);
        driver.findElement(saveProfileButton).click();

    }

    public void deleteAccountProcess(){

        driver.findElement(deleteAccountButton).click();
        driver.findElement(secondDeleteAccountButton).click();

    }
}