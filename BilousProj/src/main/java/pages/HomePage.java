package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParrentPage {

    @FindBy(xpath = ".//div[@class='pull-left image']//img[@class='img-circle']")
    WebElement avatar;
    @FindBy(id = "dictionary")
    WebElement menuDictionary;
    @FindBy(id = "apparat")
    WebElement subMenuApparat;
    @FindBy(id = "spares")
    WebElement submenuSpare;
    @FindBy(xpath = ".//ul[@class='nav navbar-nav']")
    WebElement profileBoxnav;
    @FindBy(xpath = ".//li[@class='dropdown user user-menu open']")
    WebElement profileBox;
    @FindBy(xpath = ".//a[@href='/logout']")
    WebElement logOutButton;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isAvatarPresent() {
        return actionsWithOurWebElements.isElementPresent(avatar);
    }
    public void clickOnMenuDictionary() {
        actionsWithOurWebElements.clickOnWebElement(menuDictionary);

    }

    public void selectOnDictionaryMenuItemApparat() {
        actionsWithOurWebElements.clickOnWebElement(subMenuApparat);

    }
    public void clickonSubmenuSpare() {
        actionsWithOurWebElements.clickOnWebElement(submenuSpare);
    }
    public void expandProfileBox() {
        actionsWithOurWebElements.clickOnWebElement(profileBoxnav);
    }

    public boolean isProfileBoxPresent() {
        return actionsWithOurWebElements.isElementPresent(profileBox);
    }

    public void clickOnLogoutButton() {
        actionsWithOurWebElements.clickOnWebElement(logOutButton);
    }

}
