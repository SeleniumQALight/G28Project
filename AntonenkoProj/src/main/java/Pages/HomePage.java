package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {

    @FindBy(xpath = ".//div[@class='pull-left image']//img[@class='img-circle']")
    WebElement avatar;
    @FindBy (xpath = ".//li[@id='deal']")
    WebElement sdelki;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isAvatarPresent() {
        return actionsWithOurWebElements.isElementPresent(avatar);

    }

    public void clickOnSdelkiLink (){

        actionsWithOurWebElements.clickOnWebElement(sdelki);
    }
}
