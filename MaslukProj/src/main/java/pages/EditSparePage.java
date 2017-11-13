package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Администратор on 08.11.2017.
 */
public class EditSparePage extends ParentPage {

    @FindBy(id = "spares_spareName")
    private WebElement InputSpareName;

    @FindBy(id = "spares_spareType")
    private WebElement spareTypeDropDown;

    @FindBy (name = "add")
    private WebElement buttonAdd;

    public EditSparePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterTextIntoInputSpareName(String spareName) {
        actionsWithOurWebElements.enterTextIntoInput(InputSpareName, spareName);

    }

    public void selectTextIntoDropDownTypeOfSpare (String typeOfSpareForSelect) {
        actionsWithOurWebElements.selectItemInDropDownByVisibleText(spareTypeDropDown, typeOfSpareForSelect);
    }

    public void clickOnAddButton () {
        actionsWithOurWebElements.clickOnWebElement(buttonAdd);
    }
}