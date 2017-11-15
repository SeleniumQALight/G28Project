package Pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {

    @FindBy(xpath = ".//div[@class='pull-left image']//img[@class='img-circle']")
    WebElement avatar;

    @FindBy(xpath = ".//*[@class='dropdown-toggle']")
    WebElement avatarDropDown;

    @FindBy(xpath=".//*[@href='/logout']")
    WebElement buttonLogout;

    @FindBy(xpath = ".//*[@class='pull-left']//a")
    WebElement buttonMyProfile;

    @FindBy(id = "userProfileEdit_user_name")
    WebElement inputProfileName;

    @FindBy(name="save")
    WebElement buttonSaveChangesMyProfile;

    @FindBy(xpath = ".//div[@class='user-panel']//div//p")
    WebElement userNameHomepage;

    @FindBy(id = "dictionary")
    WebElement menuDictionary;

    @FindBy(id="prov_cus")
    private WebElement subMenuStoronySdelok;

    @FindBy(id = "spares")
    private WebElement subMenuSpare;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isAvatarPresent() {
        return actionsWithOurWebElements.isElementPresent(avatar);
    }

    public void openPageStoronySdelok() {
        try {
            webDriver.get("http://v3.test.itpmgroup.com/dictionary/providers");
            logger.info("Page StoronySdelok was opened");
        } catch (Exception e) {
            logger.error("Can not open url");
            Assert.fail("Can not open url");
        }
    }

    public void clickOnButtonLogout() {
        actionsWithOurWebElements.clickOnWebElement(buttonLogout);
    }

    public void clickOnAvatar() {
        actionsWithOurWebElements.clickOnWebElement(avatarDropDown);
    }

    public void clickOnButtonMyProfile() {
        actionsWithOurWebElements.clickOnWebElement(buttonMyProfile);
    }

    public void changeProfileName(String newName) {
        actionsWithOurWebElements.enterTextIntoInput(inputProfileName, newName);
    }

    public void saveChangesToMyProfile() {
        actionsWithOurWebElements.clickOnWebElement(buttonSaveChangesMyProfile);
    }

    public boolean isNewProfileNameIsPresent(String profileName) {
        return webDriver.findElement(By.xpath(".//span[contains(text(), '"+ profileName+"')]")).getText().equalsIgnoreCase(profileName);
    }

    public void clickOnMenuDictionary() {
        actionsWithOurWebElements.clickOnWebElement(menuDictionary);
    }

    public void clickOnSubMenuSpare() {
        actionsWithOurWebElements.clickOnWebElement(subMenuSpare);
    }

    public void clickOnSubMenuStoronySdelok() {
        actionsWithOurWebElements.clickOnWebElement(subMenuStoronySdelok);
    }

}
