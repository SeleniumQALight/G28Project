package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParrentPage {

    @FindBy(xpath = ".//div[@class='pull-left image']//img[@class='img-circle']")
    WebElement avatar;
    @FindBy(xpath = ".//li[@id='dictionary']")
    WebElement dictionaryExpandList;
    @FindBy(xpath = ".//li[@id='dictionary']//*[@href='/dictionary/providers']")
    WebElement dictionaryMenuItemDealType;
    @FindBy(xpath = ".//*[@id='apparat']")
    WebElement dictionaryMenuItemApparat;
    @FindBy(xpath = ".//a[@class='btn btn-info btn-sm' and @data-original-title='Add']")
    WebElement addButton;
    @FindBy(xpath = ".//input[@id='apparat_apparatNumber']")
    WebElement apparatNoInput;
    @FindBy(xpath = ".//input[@id='apparat_apparatComment']")
    WebElement apparatCommentInput;
    @FindBy(xpath = ".//button[@type='submit']")
    WebElement createButton;
    //@FindBy(xpath = ".//table[@id='device_list']//tr//td[text()='" + dictionaryName + "']//..//td[text()='" + comment + "']")
    //WebElement addedApparatDictionary;
    @FindBy(xpath = ".//table[@id='device_list']//tr//td[text()='51120171']//..//td[text()='BilousTestComment']")
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
    @FindBy(xpath = ".//ul[@class='nav navbar-nav']")
    WebElement profileBoxnav;
    @FindBy(xpath = ".//li[@class='dropdown user user-menu open']")
    WebElement profileBox;
    @FindBy(xpath = ".//a[@href='/logout']")
    WebElement logOutButton;
    @FindBy(xpath = ".//*[@id='prov_cus']")
    WebElement checkBox;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isAvatarPresent() {
        return actionsWithOurWebElements.isElementPresent(avatar);
    }

    public void clickOnDictionaryExpandList() {
        actionsWithOurWebElements.clickOnWebElement(dictionaryExpandList);

    }



    public void selectOnDictionaryMenuItemApparat() {
        actionsWithOurWebElements.clickOnWebElement(dictionaryMenuItemApparat);

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

    public void expandProfileBox() {
        actionsWithOurWebElements.clickOnWebElement(profileBoxnav);
    }

    public boolean isProfileBoxPresent() {
        return actionsWithOurWebElements.isElementPresent(profileBox);
    }

    public void clickOnLogoutButton() {
        actionsWithOurWebElements.clickOnWebElement(logOutButton);
    }

    public void selectOnDictionaryMenuItemDealType() {
        actionsWithOurWebElements.clickOnWebElement(dictionaryMenuItemDealType);
    }

//    public void clickOnCheckBox() {
//        actionsWithOurWebElements.setStateToCheckBox(checkBox);
//
//    }

}
