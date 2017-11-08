package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DealTypePage extends ParrentPage {
    @FindBy(id = "dictionary")
    WebElement menuDictionary;
    @FindBy(xpath = ".//li[@id='dictionary']//*[@href='/dictionary/providers']")
    WebElement subMenuDealType;

    public DealTypePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnMenuDictionary() {
        actionsWithOurWebElements.clickOnWebElement(menuDictionary);
    }

    public void selectOnDictionaryMenuItemDealType() {
        actionsWithOurWebElements.clickOnWebElement(subMenuDealType);
    }

}

