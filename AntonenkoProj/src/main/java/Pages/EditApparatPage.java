package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditApparatPage extends ParentPage {
    @FindBy(id="apparat_apparatNumber")
    private WebElement inputApparatNumber;
    @FindBy(id="apparat_apparatComment")
    private WebElement inputApparatComment;
    @FindBy(name="add")
    private WebElement buttonSozdat;

    public EditApparatPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterTextInToInputApparatNumber(String apparatNumber) {
        actionsWithOurWebElements.enterTextInToInput(inputApparatNumber,apparatNumber);
    }

    public void enterTextInToInputApparatComment(String apparatComment) {
        actionsWithOurWebElements.enterTextInToInput(inputApparatComment, apparatComment);
    }

    public void clickOnSozdatButton() {
        actionsWithOurWebElements.clickOnWebElement(buttonSozdat);
    }
}
