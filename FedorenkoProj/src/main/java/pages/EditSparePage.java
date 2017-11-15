package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Aleksandr on 08.11.2017.
 */
public class EditSparePage extends ParentPage {
    @FindBy(id = "space_spareName")
    private WebElement inputSpareName;
    @FindBy(id = "spares_spareType")
    private WebElement spareTypeDropDown;
    @FindBy(name = "add")
    private WebElement buttonAdd;

    public EditSparePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterTextInToInputSpearName(String spareName) {
    actionsWithOurWebElements.enterTextInToInput(inputSpareName, spareName);
    }

    public void selectTextInDropDownTypeOfSpare (String typeOsSpareForSelect){
        actionsWithOurWebElements.selectItemInDropDownByVisibleText(spareTypeDropDown, typeOsSpareForSelect);
    }
    public void clickOnAddButton(){
        actionsWithOurWebElements.clickOnWebElement(buttonAdd);
    }
}
