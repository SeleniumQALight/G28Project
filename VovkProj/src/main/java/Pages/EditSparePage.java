package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditSparePage extends ParentPage {
    @FindBy(id="spares_spareName")
    private WebElement inputSpareName;

    @FindBy(id="spares_spareType")
    private WebElement spareTypeDropDown;

    @FindBy(name="add")
    private WebElement buttonAdd;

    public EditSparePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterTextIntoSpareName(String spareName) {
        actionsWithOurWebElements.enterTextIntoInput(inputSpareName, spareName);
    }

    public void selectTextInDropDownTypeOfSpare(String typeOfSpareFor) {
        actionsWithOurWebElements.selectItemInDropdownByVisibleText(spareTypeDropDown, typeOfSpareFor);
    }

    public void clickOnAddButton() {
        actionsWithOurWebElements.clickOnWebElement(buttonAdd);
    }
}
