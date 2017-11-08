package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SdelkyPage extends ParentPage {
    @FindBy(xpath = ".//*[@href='http://v3.test.itpmgroup.com/deal/edit']")
    WebElement buttonAdd;

    @FindBy(id = "deal_dealDate_date_day")
    WebElement selectorDay;

    @FindBy(id = "deal_dealDate_date_month")
    WebElement selectorMonth;

    @FindBy(name = "add")
    WebElement buttonAddSdelka;

    @FindBy(xpath = ".//*[@class='help-block']")
    WebElement helpBlock;

    public SdelkyPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void createNewSdelka (String day, String month) {
        actionsWithOurWebElements.clickOnWebElement(buttonAdd);
        actionsWithOurWebElements.selectItemInDropdownByVisibleText(selectorDay, day);
        actionsWithOurWebElements.selectItemInDropdownByValue(selectorMonth, month);
        actionsWithOurWebElements.clickOnWebElement(buttonAddSdelka);
    }

    public boolean isErrorMessagePresent() {
        return actionsWithOurWebElements.isElementPresent(helpBlock);
    }
}
