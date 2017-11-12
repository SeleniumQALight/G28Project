package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ApparatPage extends ParrentPage {
    final private String apparatNumber = "12112017";
    final private String apparatComment = "BilousTestComment";

    @FindBy(xpath = ".//a[@class='btn btn-info btn-sm' and @data-original-title='Add']")
    WebElement addButton;
    @FindBy(id = "apparat_apparatNumber")
    WebElement apparatNoInput;
    @FindBy(id = "apparat_apparatComment")
    WebElement apparatCommentInput;
    @FindBy(xpath = ".//button[@type='submit']")
    WebElement createButton;
    @FindBy(xpath = ".//button[@type='submit' and @name='save']")
    WebElement saveButton;
    @FindBy(xpath = ".//button[@type='submit' and @name='delete']")
    WebElement removeButton;
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

    public boolean isAddedApparatDictionaryPresent(String number, String comment) {
        return actionsWithOurWebElements.isElementPresent(".//table[@id='device_list']//td[text()='"+ number +"']//..//td[text()='"+ comment +"']");
    }


    public void clickOnApparatDictionary(String number, String comment) {
        actionsWithOurWebElements.clickOnWebElement(".//table[@id='device_list']//td[text()='"+ number +"']//..//td[text()='"+ comment +"']");

    }

    public void clickOnSaveButton() {
        actionsWithOurWebElements.clickOnWebElement(saveButton);
    }

    public void clickOnRemoveButton() {
        actionsWithOurWebElements.clickOnWebElement(removeButton);
    }

    public boolean isRemoveddDictionaryNotPresent(String number, String comment) {
        return actionsWithOurWebElements.elementIsNotPresent(".//table[@id='device_list']//td[text()='"+ number +"']//..//td[text()='"+ comment +"']");

    }

    public void addNewApparatDictionary(){
        clickOnAddBtn();
        enterInIntoInputApparatNumber(apparatNumber);
        enterInIntoInputApparatComment(apparatComment);
        clickCreateButton();
    }






}
