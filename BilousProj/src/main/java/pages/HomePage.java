package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParrentPage {

    @FindBy(xpath = ".//div[@class='pull-left image']//img[@class='img-circle']")
    WebElement avatar;
    @FindBy(id = "dictionary")
    WebElement menuDictionary;
    @FindBy(xpath = ".//li[@id='dictionary']//*[@href='/dictionary/providers']")
    WebElement subMenuDealType;
    @FindBy(id = "apparat")
    WebElement subMenuApparat;
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
    @FindBy(xpath = ".//ul[@class='nav navbar-nav']")
    WebElement profileBoxnav;
    @FindBy(xpath = ".//li[@class='dropdown user user-menu open']")
    WebElement profileBox;
    @FindBy(xpath = ".//a[@href='/logout']")
    WebElement logOutButton;
    @FindBy(id = "prov_cus_proCustIsFl")
    WebElement checkBox;
    @FindBy(id = "spares")
    WebElement submenuSpare;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isAvatarPresent() {
        return actionsWithOurWebElements.isElementPresent(avatar);
    }

    public void clickOnMenuDictionary() {
        actionsWithOurWebElements.clickOnWebElement(menuDictionary);


    }


    public void selectOnDictionaryMenuItemApparat() {
        actionsWithOurWebElements.clickOnWebElement(subMenuApparat);

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
        actionsWithOurWebElements.clickOnWebElement(subMenuDealType);
    }

    public void clickonSubmenuSpare() {
        actionsWithOurWebElements.clickOnWebElement(submenuSpare);
    }


//   public void clickOnCheckBox() {
//        actionsWithOurWebElements.setStateToCheckBox(checkBox);
//
//    }


}
