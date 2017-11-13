package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoronySdelokPage extends ParentPage{
    @FindBy(xpath = ".//*[@href='http://v3.test.itpmgroup.com/dictionary/providers/edit']")
    WebElement buttonAdd;

    @FindBy(id = "prov_cus_proCustName")
    WebElement proCustName;

    @FindBy(id = "prov_cus_proCustAddress")
    WebElement proCustAddress;

    @FindBy(id = "prov_cus_proCustIsFl")
    WebElement checkboxPrivatePerson;

    @FindBy(name = "add")
    WebElement buttonSave;

    public StoronySdelokPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void createNewPrivatePersonKontragent (String name, String address, boolean privatePerson) {
        actionsWithOurWebElements.clickOnWebElement(buttonAdd);
        actionsWithOurWebElements.enterTextIntoInput(proCustName, name);
        actionsWithOurWebElements.enterTextIntoInput(proCustAddress, address);
        actionsWithOurWebElements.setStateToCheckBox(checkboxPrivatePerson, "Checked");
        actionsWithOurWebElements.clickOnWebElement(buttonSave);
    }

}
