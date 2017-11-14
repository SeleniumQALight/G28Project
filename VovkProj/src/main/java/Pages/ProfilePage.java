package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends ParentPage{

    @FindBy(id = "userProfileEdit_user_name")
    WebElement inputProfileName;

    @FindBy(name="save")
    WebElement buttonSaveChangesMyProfile;

    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void changeProfileName(String newName) {
        actionsWithOurWebElements.enterTextIntoInput(inputProfileName, newName);
    }

    public void saveChangesToMyProfile() {
        actionsWithOurWebElements.clickOnWebElement(buttonSaveChangesMyProfile);
    }

    public boolean isNewProfileNameIsPresent(String profileName) {
        return actionsWithOurWebElements.isElementPresent(".//*[text()='"+profileName + "']");
    }
}
