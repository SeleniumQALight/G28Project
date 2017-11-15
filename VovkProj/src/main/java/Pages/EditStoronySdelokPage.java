package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditStoronySdelokPage extends ParentPage {
    @FindBy(xpath = ".//*[@href='http://v3.test.itpmgroup.com/dictionary/providers/edit']")
    WebElement buttonAdd;

    @FindBy(id = "prov_cus_proCustName")
    WebElement inputProCustName;

    @FindBy(id = "prov_cus_proCustAddress")
    WebElement inputProCustAddress;

    @FindBy(id = "prov_cus_proCustPhone")
    WebElement inputProCustPhone;

    @FindBy(id = "prov_cus_proCustIsFl")
    WebElement checkboxPrivatePerson;

    @FindBy(id = "prov_cus_isOurFirm")
    WebElement checkboxIsOurFirm;

    @FindBy(name = "add")
    WebElement buttonSave;

    public EditStoronySdelokPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void enterTextIntoProCustName(String customerName) {
        actionsWithOurWebElements.enterTextIntoInput(inputProCustName, customerName);
    }

    public void enterTextIntoProCustAddress(String customerAddress) {
        actionsWithOurWebElements.enterTextIntoInput(inputProCustAddress, customerAddress);
    }

    public void enterTextIntoProCustPhone(String customerPhone) {
        actionsWithOurWebElements.enterTextIntoInput(inputProCustPhone, customerPhone);
    }

    public void checkCheckBoxPrivatePerson(String status) {
        actionsWithOurWebElements.setStateToCheckBox(checkboxPrivatePerson, status);
    }

    public void clickOnAddButton() {
        actionsWithOurWebElements.clickOnWebElement(buttonSave);
    }
}
