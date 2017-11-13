package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditTypeSdelkiPage extends ParentPage {
    @FindBy(id="deal_type_dealTypeName")
    private WebElement inputTypeSdelki;
    @FindBy(name="add")
    private WebElement buttonCreate;
    @FindBy(name="delete")
    private WebElement buttonDelete;

    public EditTypeSdelkiPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterTextInToInputDealTypeName(String typeSdelki) {
        actionsWithOurWebElements.enterTextInToInput(inputTypeSdelki,typeSdelki);
    }

    public void cliclOnCreateButton() {
        actionsWithOurWebElements.clickOnWebElement(buttonCreate);
    }

    public void clickOnDeleteButton() {
        actionsWithOurWebElements.clickOnWebElement(buttonDelete);
    }
}
