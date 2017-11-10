package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ApparatPage extends ParrentPage {


    @FindBy(xpath = ".//a[@class='btn btn-info btn-sm' and @data-original-title='Add']")
    WebElement addButton;
    @FindBy(id = "apparat_apparatNumber")
    WebElement apparatNoInput;
    @FindBy(id = "apparat_apparatComment")
    WebElement apparatCommentInput;
    @FindBy(xpath = ".//button[@type='submit']")
    WebElement createButton;
    @FindBy(xpath = ".//table[@id='device_list']//tr//td[text()='51120172']//..//td[text()='BilousTestComment']")
    WebElement addedApparatDictionary;
    @FindBy(xpath = ".//table[@id='device_list']//tr//td[text()='51120173']//..//td[text()='BilousTestComment']")
    WebElement apparatDictionary;
    @FindBy(xpath = ".//button[@type='submit' and @name='save']")
    WebElement saveButton;
    @FindBy(xpath = ".//table[@id='device_list']//tr//td[text()='511201731']//..//td[text()='BilousTestCommentEdited']")
    WebElement ediedApparatDictionary;
    @FindBy(xpath = ".//button[@type='submit' and @name='delete']")
    WebElement removeButton;
    @FindBy(xpath = ".//table[@id='device_list']//tr//td[text()='51120173']//..//td[text()='BilousTestComment']")
    WebElement removedApparatDictionary;
    @FindBy(id = "prov_cus_proCustIsFl")
    WebElement checkBox;



    public ApparatPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void clickOnAddBtn() {
        actionsWithOurWebElements.clickOnWebElement(addButton);

    }

    public void enterInIntoInputApparatNumber(String dictionaryName) {

        actionsWithOurWebElements.enterTextIntoInput(apparatNoInput, dictionaryName);
    }

    public void enterInIntoInputApparatComment(String comment) {

        actionsWithOurWebElements.enterTextIntoInput(apparatCommentInput, comment);
    }

    public void clickCreateButton() {
        actionsWithOurWebElements.clickOnWebElement(createButton);

    }

    public boolean isAddedDictionaryPresent() {
        return actionsWithOurWebElements.isElementPresent(addedApparatDictionary);
    }

    public void clickOnApparatDictionary() {
        actionsWithOurWebElements.clickOnWebElement(apparatDictionary);

    }

    public void clickOnSaveButton() {
        actionsWithOurWebElements.clickOnWebElement(saveButton);
    }

    public boolean isEditeddDictionaryPresent() {
        return actionsWithOurWebElements.isElementPresent(ediedApparatDictionary);
    }

    public void clickOnRemoveButton() {
        actionsWithOurWebElements.clickOnWebElement(removeButton);
    }

    public boolean isRemoveddDictionaryNotPresent() {
        return actionsWithOurWebElements.elementIsNotPresent(removedApparatDictionary);
    }






}
