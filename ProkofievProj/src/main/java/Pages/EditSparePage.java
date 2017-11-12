package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditSparePage extends ParentPage{
    @FindBy(id = "spares_spareName")
    private WebElement inputSpareName;

    @FindBy(id = "spares_spareType")
    private WebElement spareTypeDropDown;

    @FindBy(name = "add")
    private WebElement buttonAdd;

    public EditSparePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterTextInToInputSpareName(String spareName) {
        actionsWithOurWebElements.enterTextInToInput(inputSpareName, spareName);
    }

    public void clickOnAddButton(){
        actionsWithOurWebElements.clickOnWebElement(buttonAdd);
    }

    public void selectTextInDropDownTypeOfSpare(String typeOfSpareForSelect){
        actionsWithOurWebElements.selectItemInDropDownByVisibleText(spareTypeDropDown, typeOfSpareForSelect);
    }
}
