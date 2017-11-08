package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SparePage extends ParentPage {

    // перейти на страницу по линку
    @FindBy(xpath = ".//*[@href='http://v3.test.itpmgroup.com/dictionary/spares/edit']")
    private WebElement buttonPlus;

    // конструктор
    public SparePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnPlusButton() {

        actionsWithOurWebElements.clickOnWebElement(buttonPlus);
    }

    public boolean isSpareInList(String nameOfSpare) {
        return actionsWithOurWebElements.isElementPresent(
                ".//*[text()='" + nameOfSpare + "']");
    }


}
