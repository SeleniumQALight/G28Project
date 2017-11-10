package pages;


import com.sun.org.apache.xpath.internal.operations.Equals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SparePage extends ParentPage {

    @FindBy(xpath = "//*[@href='http://v3.test.itpmgroup.com/dictionary/spares/edit']")
    private WebElement buttonPlus;

    @FindBy(name = "delete")
    private WebElement deleteButton;

    public SparePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnPlusButton() {
        actionsWithOurWebElements.clickOnWebElement((buttonPlus));
    }

    public void clickOnDeleteButton(){
        actionsWithOurWebElements.clickOnWebElement(deleteButton);
    }

    public boolean isSpareInList(String nameOfSpare) {
        return actionsWithOurWebElements.isElementPresent(".//*[text()='" + nameOfSpare + "']");
    }

    private void clickOnSpareName(String nameOfSpare) {
        try {
            WebElement webElement = webDriver.findElement(By.xpath(".//*[text()='" + nameOfSpare + "']"));
            webElement.click();
        } catch (Exception e) {
            return;

        }
    }

    public void deleteSpareInList(String nameOfSpare) {
        clickOnSpareName(nameOfSpare);
        clickOnDeleteButton();
        logger.info("Delete element " + nameOfSpare );
    }


}
