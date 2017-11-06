package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SdelkiListPage extends ParentPage {

    @FindBy(xpath = ".//li[@class='active' and text()='Сделки']")
    WebElement breadcrumbs;
    @FindBy(xpath =".//a[@ href='http://v3.test.itpmgroup.com/deal/edit']")
    WebElement addbutton;

    public SdelkiListPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isBreadcrumbsPresent(){
        return actionsWithOurWebElements.isElementPresent(breadcrumbs);

    }
    public void clickOnAddButton(){
        actionsWithOurWebElements.clickOnWebElement(addbutton);
    }

    public boolean isAddButtonPresent() {
        return actionsWithOurWebElements.isElementPresent(addbutton);
    }
}
