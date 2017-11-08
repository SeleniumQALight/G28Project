package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {

    @FindBy(xpath = ".//div[@class='pull-left image']//img[@class='img-circle']")
    WebElement avatar;

    @FindBy(xpath = ".//*[@id='dictionary']/a")
    private WebElement menuDictionary;

    @FindBy(id= "spares")
    private WebElement subMenuSpare;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }



    // method for avatar
    public boolean isAvatarPresent() {
        return actionsWithOurWebElements.isElementPresent(avatar);
    }



    //метод кликает на меню в разделе словари
    public void clickOnMenuDictionary() {
        actionsWithOurWebElements.clickOnWebElement(menuDictionary);
    }



    public void clickOnSubMenuSpare() {
        actionsWithOurWebElements.clickOnWebElement(subMenuSpare);
    }
}
