package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by user on 30.10.2017.
 */
public class HomePage extends ParentPage {
    @FindBy(xpath = ".//div[@class='pull-left image']//img[@class='img-circle']")
    WebElement avatar;

    @FindBy (xpath = ".//*[@id='dictionary']/a")
    private WebElement menuDictionary;

    @FindBy (id = "spares")
    private WebElement subMenuSpare;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
    public boolean isAvatarPresent(){
       return actionsWithOursWebElements.isElementPresent(avatar);

    }


    public void clickOnMenuDictionary() {
        actionsWithOursWebElements.clickOnWebElement(menuDictionary);
    }


    public void clickOnSubMenuSpare() {
        actionsWithOursWebElements.clickOnWebElement(subMenuSpare);
    }
}
