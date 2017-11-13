package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by user on 06.11.2017.
 */
public class SparePage extends ParentPage {
    @FindBy(xpath = ".//*[@href='http://v3.test.itpmgroup.com/dictionary/spares/edit']")
    private WebElement buttonPlus;
    public SparePage(WebDriver webDriver){
        super(webDriver);
    }


    public void clickOnPlusButton() {

        actionsWithOursWebElements.clickOnWebElement(buttonPlus);
    }

    public boolean isSpareInList(String nameOfSpare) {
        return actionsWithOursWebElements.isElementPresent(".//*[text()='" + nameOfSpare + " ']");
    }
}
