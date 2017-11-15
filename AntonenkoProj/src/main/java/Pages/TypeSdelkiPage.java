package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TypeSdelkiPage extends ParentPage {

    @FindBy(xpath = ".//*[@href='http://v3.test.itpmgroup.com/dictionary/deal_type/edit']")
    private WebElement buttonAdd;

    public TypeSdelkiPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnAddButton() {
        actionsWithOurWebElements.clickOnWebElement(buttonAdd);
    }

    public boolean isTypeSdelkiInList(String nameOfTypeSdelki) {
        return actionsWithOurWebElements.isElementPresent(".//*[text()='" + nameOfTypeSdelki + "']");
    }

    public void clickOnTypeSdelkiInList(String nameOfTypeSdelki) {
        actionsWithOurWebElements.clickOnWebElement(".//*[text()='" + nameOfTypeSdelki + "']");
    }
}
