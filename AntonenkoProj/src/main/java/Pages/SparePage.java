package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SparePage extends ParentPage {

    @FindBy(xpath = ".//*[@href='http://v3.test.itpmgroup.com/dictionary/spares/edit']")
    private WebElement buttonPlys;

    public SparePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnPlysButton() {
        actionsWithOurWebElements.clickOnWebElement(buttonPlys);
    }

    public boolean isSpareInList(String nameOfSpare) {
        return actionsWithOurWebElements.isElementPresent(".//*[text()='" + nameOfSpare + "']");
    }

    public void clickOnSpareInList(String nameOfSpare) {
        actionsWithOurWebElements.clickOnWebElement(".//*[text()='" + nameOfSpare + "']");
    }
}
