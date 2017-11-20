package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoronySdelokPage extends ParentPage{
    @FindBy(xpath = ".//*[@href='http://v3.test.itpmgroup.com/dictionary/providers/edit']")
    WebElement buttonPlus;



    public StoronySdelokPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnPlusButton() {
        actionsWithOurWebElements.clickOnWebElement(buttonPlus);
    }

    public boolean isStoronaSdelokInList(String customerName, String customerAddress, String customerPhone) {
        return (actionsWithOurWebElements.isElementPresent(".//*[text()='"+customerName + "']") &
                actionsWithOurWebElements.isElementPresent(".//*[text()='"+customerAddress + "']") &
                actionsWithOurWebElements.isElementPresent(".//*[text()='"+customerPhone + "']"));
    }
}
