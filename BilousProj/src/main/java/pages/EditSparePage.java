package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditSparePage extends ParrentPage {

    @FindBy (id = "spares_spareName")
    private WebElement inputSpareName;
    @FindBy (id = "spares_spareType")
    private WebElement spareTypeDropDown;
    @FindBy (name = "add")
    private WebElement addButton;

    public EditSparePage(WebDriver webDriver) {
        super(webDriver);
    }


    public void enterTextInToInputSpareName(String sparename) {
        actionsWithOurWebElements.enterTextIntoInput(inputSpareName,sparename);
    }

    public void selectTextDropDownSpareType(String typeOfSpareForSelect){
        actionsWithOurWebElements.selectItemInDropDownByVisibleText(spareTypeDropDown,typeOfSpareForSelect);
    }

    public void clickOnAddButton(){
        actionsWithOurWebElements.clickOnWebElement(addButton);
    }
}
